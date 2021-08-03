package com.example.resume.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.resume.model.UserDetail;
import com.example.resume.service.UserDetailService;

@RestController
@RequestMapping(value = "/user")
public class UserDetailController {
	
	@Autowired
	UserDetailService userDetailService;
	
	@GetMapping("/getall")
	public ResponseEntity<List<UserDetail>> getAllUsers(){
		
		List<UserDetail> userDetailList = userDetailService.getAllUserDetails();
		
		return new ResponseEntity<List<UserDetail>>(userDetailList, HttpStatus.OK);
	}
	
	@GetMapping("/getuser/{id}")
	public ResponseEntity<UserDetail> getUserById(@PathVariable("id") long id){
		
		UserDetail userDetail = userDetailService.getUserDetail(id);
		
		return new ResponseEntity<UserDetail> (userDetail, HttpStatus.OK);
	}
	
	@PostMapping(value="/adduser")
	public ResponseEntity<UserDetail> addUser(@RequestBody UserDetail userDetail){
		
		UserDetail newUserDetail = userDetailService.addUserDetail(userDetail);
		
		return new ResponseEntity<UserDetail> (newUserDetail,HttpStatus.OK);
	}
	
	@PutMapping("/updateuser/{id}")
	public ResponseEntity<UserDetail> editUser(@PathVariable("id") long id, @RequestBody UserDetail userDetail){
		
		UserDetail updatedUserDetail = userDetailService.editUserDetail(id, userDetail);
		
		return new ResponseEntity<UserDetail> (updatedUserDetail, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") long id){
		
		userDetailService.deleteUserDetail(id);
		
		return new ResponseEntity<String> ("User Deleted Successfully", HttpStatus.OK);
	}
}

package com.example.resume.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.resume.exception.UserDetailNotFoundException;
import com.example.resume.model.UserDetail;
import com.example.resume.repository.UserDetailRepository;

@Service
public class UserDetailService {
	
	@Autowired
	UserDetailRepository userDetailRepository;
	
	public UserDetail addUserDetail(UserDetail userDetail){
		
		return userDetailRepository.save(userDetail);
	}
	
	public List<UserDetail> getAllUserDetails(){
		
		return userDetailRepository.findAll();
	}
	
	public UserDetail getUserDetail(long id) {
		Optional<UserDetail> userDetail = userDetailRepository.findById(id);
		
		if(userDetail.isPresent()) {
			return userDetail.get();
		}
		else {
			throw new UserDetailNotFoundException("User Detail Not Found");
		}
	}
	
	public UserDetail editUserDetail(long id, UserDetail userDetail) {
		
		Optional<UserDetail> userDetail1 = userDetailRepository.findById(id);
		if(userDetail1.isPresent()) {
			//UserDetail updatedUserDetail = new UserDetail();
			
			userDetail1.get().setId(id);
			userDetail1.get().setAddress(userDetail.getAddress());
			userDetail1.get().setEmail(userDetail.getEmail());
			userDetail1.get().setMobileNumber(userDetail.getMobileNumber());
			userDetail1.get().setName(userDetail.getName());
			userDetail1.get().setProfile(userDetail.getProfile());
			
			return userDetailRepository.save(userDetail1.get());
			
		}
		else {
			throw new UserDetailNotFoundException("User Detail Not Found");
		}
	}
	
	public void deleteUserDetail(long id) {
		Optional<UserDetail> userDetail = userDetailRepository.findById(id);
		
		if(userDetail.isPresent()) {
			
			userDetailRepository.deleteById(id);
		}
		else {
			throw new UserDetailNotFoundException("User Detail Not Found");
		}
	}
}

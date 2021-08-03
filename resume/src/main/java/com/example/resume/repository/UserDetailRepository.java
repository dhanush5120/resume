package com.example.resume.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resume.model.UserDetail;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long>{
	
	List<UserDetail> findByNameContainsIgnoreCase(String name);

}

package com.example.HCM20_FPL_CT_INTERN_01_G1_Lab1.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HCM20_FPL_CT_INTERN_01_G1_Lab1.entity.student;

public interface studentRepository extends JpaRepository<student, String>{

	List<student> findByName(String name);
	
	List<student> findByEmail(String email);


}

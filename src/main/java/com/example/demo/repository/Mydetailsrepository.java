package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MydetailsEntity;

public interface Mydetailsrepository extends JpaRepository<MydetailsEntity , Integer> {

	
}

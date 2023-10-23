package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MydetailsEntity;
import com.example.demo.service.MydetailsService;

@RestController
@RequestMapping("/Mydetails")
@CrossOrigin
public class MydetailsController {

	
	@Autowired
	MydetailsService mydeatilsservice;
	
	@PostMapping("/create")
	public MydetailsEntity mydetailsCreate(@RequestBody  MydetailsEntity mydetailsentity)
	{
		
		return mydeatilsservice.mydetailsCreate(mydetailsentity);
		
	}
	
    @PutMapping("/{id}")
    public ResponseEntity<MydetailsEntity> updatePersonalDetails(
        @PathVariable Integer id,
        @RequestBody MydetailsEntity updateentity
    ) {
    	MydetailsEntity updated = mydeatilsservice.updatePersonalDetails(id, updateentity);
        return ResponseEntity.ok(updated);
    }

	
	
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePersonalDetails(@PathVariable Integer id) {
    	mydeatilsservice.deleteMyPersonalDetailsById(id);
        return new ResponseEntity<>("Personal Details with ID " + id + " has been deleted.", HttpStatus.OK);
    }
    
    
    

	
	 @GetMapping
	    public List<MydetailsEntity> getAllMydetails() {
	        return mydeatilsservice.getAllmydetails();
	    }
	
	
	
	
}

package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MydetailsEntity;
import com.example.demo.repository.Mydetailsrepository;

@Service
public class MydetailsService {

	@Autowired
	Mydetailsrepository mydetailsrepository;

	public MydetailsEntity mydetailsCreate(MydetailsEntity mydetailsentity) {

		return mydetailsrepository.save(mydetailsentity);

	}

	public void deleteMyPersonalDetailsById(Integer id) {
		mydetailsrepository.deleteById(id);
	}

	public MydetailsEntity updatePersonalDetails(Integer id, MydetailsEntity updateentity) {
		MydetailsEntity existingDetails = mydetailsrepository.findById(id).orElseThrow();

		// Update the fields you want to change
		if (updateentity.getFirst_name() != null) {
			existingDetails.setFirst_name(updateentity.getFirst_name());
		}
		if (updateentity.getMid_name() != null) {
			existingDetails.setMid_name(updateentity.getMid_name());
		}
		if (updateentity.getLast_name() != null) {
			existingDetails.setLast_name(updateentity.getLast_name());
		}
		if (updateentity.getSex() != null) {
			existingDetails.setSex(updateentity.getSex());
		}
		if (updateentity.getProffision() != null) {
			existingDetails.setProffision(updateentity.getProffision());
		}
		if (updateentity.getDate_of_Birth() != null) {
			existingDetails.setDate_of_Birth(updateentity.getDate_of_Birth());
		}
		if (Objects.nonNull(updateentity.getAge())) {
			existingDetails.setAge(updateentity.getAge());
		}
		if (updateentity.getAddress() != null) {
			existingDetails.setAddress(updateentity.getAddress());
		}

		return mydetailsrepository.save(existingDetails);
	}

	public List<MydetailsEntity> getAllmydetails() {

		return mydetailsrepository.findAll();
	}

}

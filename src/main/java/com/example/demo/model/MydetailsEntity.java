package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class MydetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int   id;
	private String first_name;
	private String mid_name;
	private String last_name;
	private String sex;
	private String proffision;
	private String date_of_Birth;
	private int  age;
	private String address;
	
	public MydetailsEntity() {
		// TODO Auto-generated constructor stub
	}

	public MydetailsEntity(int id, String first_name, String mid_name, String last_name, String sex, String proffision,
			String date_of_Birth, int age, String address) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.mid_name = mid_name;
		this.last_name = last_name;
		this.sex = sex;
		this.proffision = proffision;
		this.date_of_Birth = date_of_Birth;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMid_name() {
		return mid_name;
	}

	public void setMid_name(String mid_name) {
		this.mid_name = mid_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getProffision() {
		return proffision;
	}

	public void setProffision(String proffision) {
		this.proffision = proffision;
	}

	public String getDate_of_Birth() {
		return date_of_Birth;
	}

	public void setDate_of_Birth(String date_of_Birth) {
		this.date_of_Birth = date_of_Birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MydetailsEntity [id=" + id + ", first_name=" + first_name + ", mid_name=" + mid_name + ", last_name="
				+ last_name + ", sex=" + sex + ", proffision=" + proffision + ", date_of_Birth=" + date_of_Birth
				+ ", age=" + age + ", address=" + address + ", getId()=" + getId() + ", getFirst_name()="
				+ getFirst_name() + ", getMid_name()=" + getMid_name() + ", getLast_name()=" + getLast_name()
				+ ", getSex()=" + getSex() + ", getProffision()=" + getProffision() + ", getDate_of_Birth()="
				+ getDate_of_Birth() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}

package com.springcore.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
@Scope("prototype")
public class Student {
	@Value("Riddhi")
	private String studentName;
	@Value("Thane")
	private String city;
	@Value("#{add}")
	private List<String> addresses;
	
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public List<String> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", addresses=" + addresses + "]";
	}

	
	
	
}

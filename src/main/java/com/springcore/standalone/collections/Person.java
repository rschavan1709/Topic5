package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {

	private List<String> myBestFriends;
	private Map<String, Double> feeStructure;
	
	@Override
	public String toString() {
		return "Person [myBestFriends=" + myBestFriends + ", feeStructure=" + feeStructure + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getMyBestFriends() {
		return myBestFriends;
	}
	public void setMyBestFriends(List<String> myBestFriends) {
		this.myBestFriends = myBestFriends;
	}
	public Map<String, Double> getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(Map<String, Double> feeStructure) {
		this.feeStructure = feeStructure;
	}
	
	
	
}

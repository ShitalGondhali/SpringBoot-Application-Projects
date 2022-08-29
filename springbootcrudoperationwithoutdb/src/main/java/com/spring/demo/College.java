package com.spring.demo;

public class College 
{

	private int collegeId;
	private String collegeName;
	private String collegeContactNo;
	private String collegeAddress;
	
	public College() {
		super();
	}
	
	public College(int collegeId, String collegeName, String collegeContactNo, String collegeAddress) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeContactNo = collegeContactNo;
		this.collegeAddress = collegeAddress;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeContactNo() {
		return collegeContactNo;
	}

	public void setCollegeContactNo(String collegeContactNo) {
		this.collegeContactNo = collegeContactNo;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	
}

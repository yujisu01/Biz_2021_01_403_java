package com.callor.student.model;

public class StudentVO {
	
	private int sNum;
	private String sName;
	private String sMajor;
	private int sGrade;
	private int sClass;
	private String sAdd;
	private String sTel;
	
	
	public StudentVO(int sNum, String sName, String sMajor, int sGrade, int sClass, String sAdd, String sTel) {
		super();
		this.sNum = sNum;
		this.sName = sName;
		this.sMajor = sMajor;
		this.sGrade = sGrade;
		this.sClass = sClass;
		this.sAdd = sAdd;
		this.sTel = sTel;
	}
	public StudentVO() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public int getsNum() {
		return sNum;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsMajor() {
		return sMajor;
	}
	public void setsMajor(String sMajor) {
		this.sMajor = sMajor;
	}
	public int getsGrade() {
		return sGrade;
	}
	public void setsGrade(int sGrade) {
		this.sGrade = sGrade;
	}
	public int getsClass() {
		return sClass;
	}
	public void setsClass(int sClass) {
		this.sClass = sClass;
	}
	public String getsAdd() {
		return sAdd;
	}
	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}
	public String getsTel() {
		return sTel;
	}
	public void setsTel(String sTel) {
		this.sTel = sTel;
	}
	@Override
	public String toString() {
		return "StudentVO [sNum=" + sNum + ", sName=" + sName + ", sMajor=" + sMajor + ", sGrade=" + sGrade
				+ ", sClass=" + sClass + ", sAdd=" + sAdd + ", sTel=" + sTel + "]";
	}
	
	
	

}

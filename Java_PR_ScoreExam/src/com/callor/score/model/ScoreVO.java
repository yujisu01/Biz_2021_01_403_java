package com.callor.score.model;

public class ScoreVO {
	
	private String stNum;
	private int kor;
	private int eng;
	private int math;
	private int music;
	private int total;
	private float avg;
	
	
	public ScoreVO(String stNum, int kor, int eng, int math, int music, int total, float avg) {
		super();
		this.stNum = stNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
		this.total = total;
		this.avg = avg;
	}
	public ScoreVO() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", music=" + music
				+ ", total=" + total + ", avg=" + avg + "]";
	}
	
	

}

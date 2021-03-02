package com.callor.oop.model;
/*
 * 카트정보를 담아서 App에서 사용할 Value Object Class이다.
 * 구매자,상품명,규격,날짜,시간,
 * 수량,구매단가,구매금액등이 필요함.
 * 
 */
public class CartVO {
	
	private String userName;
	private String productName;
	private String standard; //규격
	private String date;
	private String time;
	
	private int qty;
	private int price;
	private int total;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", standard=" + standard + ", date="
				+ date + ", time=" + time + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
	
	
	
	//키워드로 변수를 입력하면 오류가 뜬다.
	//String class;
	
	
	
	

}

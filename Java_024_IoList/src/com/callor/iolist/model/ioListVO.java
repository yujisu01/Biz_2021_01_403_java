package com.callor.iolist.model;

public class ioListVO {
	
	private String strDate; 	// 거래일자0
	private String strNo1;
	private String strNo2;
	private String strNo3;
	private String strProduct;		// 상품명4
	private String strClient;		// 거래처명5
	private String strCEO;			// 대표자명6
	private String strDivi;			// 구분	7
	private int intPrice;			// 매입단가8
	private int intSales;			// 판매단가9
	private int intQty;				// 수량10
	
	
	
	
	public ioListVO() {
		
	}
	public ioListVO(String strDate, String strProduct, String strClient, String strCEO, String strDivi, int intPrice,
			int intSales, int intQty) {
		super();
		this.strDate = strDate;
		this.strProduct = strProduct;
		this.strClient = strClient;
		this.strCEO = strCEO;
		this.strDivi = strDivi;
		this.intPrice = intPrice;
		this.intSales = intSales;
		this.intQty = intQty;
	}
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrProduct() {
		return strProduct;
	}
	public void setStrProduct(String strProduct) {
		this.strProduct = strProduct;
	}
	public String getStrClient() {
		return strClient;
	}
	public void setStrClient(String strClient) {
		this.strClient = strClient;
	}
	public String getStrCEO() {
		return strCEO;
	}
	public void setStrCEO(String strCEO) {
		this.strCEO = strCEO;
	}
	public String getstrDivi() {
		return strDivi;
	}
	public void setStrDivi(String strDivi) {
		this.strDivi = strDivi;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntSales() {
		return intSales;
	}
	public void setIntSales(int intSales) {
		this.intSales = intSales;
	}
	public int getIntQty() {
		return intQty;
	}
	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}
	@Override
	public String toString() {
		return "ioListEx_01 [strDate=" + strDate + ", strProduct=" + strProduct + ", strClient=" + strClient
				+ ", strCEO=" + strCEO + ", strDivi=" + strDivi + ", intPrice=" + intPrice + ", intSales=" + intSales
				+ ", intQty=" + intQty + "]";
	}
	
	
	
}

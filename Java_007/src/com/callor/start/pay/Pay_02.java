package com.callor.start.pay;
//일반적으로 많이 사용하는 코드임

public class Pay_02 {
	public static void main(String[] args) {
		
			int pay = 4_789_800;  
			int paper = 50_000;
			
		int sw = -1;
		for(  ; paper > 0  ;  ) { 
			int count = pay / paper;
				pay -= (paper * count); 
				System.out.println(paper + "원권:" + count);
			if(sw < 0) {   // sw가 0보다작으면
			
				paper = paper / 5;
			}
			else {   	//그렇지않으면
				paper = paper / 2;
			}
			
			sw*= (-1);
			
			
			
		}
	}
	
}

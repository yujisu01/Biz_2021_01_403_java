package com.callor.start.pay;

public class Pay_03 {
	public static void main(String[] args) {
		
			int pay = 4_789_800;  
			int paper = 50_000;
			
		for(int i =0 ; paper > 0  ; i++  ) {
			int count = pay / paper;
			pay -= (paper * count); 
			System.out.println(paper + "원권:" + count);
			
			if(i % 2 ==  0) { // i가 짝수이면
			
				paper = paper / 5;
			}
			else { // 그렇지 않으면
				paper = paper / 2;
			}
			
			
			
			
			
		}
	}
	
}

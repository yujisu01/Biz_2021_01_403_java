package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스의 extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모)클래스 
 * ScoreServiceExtendsV1 : Child(자식) 클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의된 모든 메서드를
 * 		코드 한줄 추가, 수정 없이 그대로 사용할수 있다.
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 메서드와
 * 		새롭게 추가된 메서드가 있는 확장된 클래스의 생성
 * 
 */

public class ScoreServiceExtendsV1 extends ScoreServiceV4{
	
	
	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 * 
	 * 
	 */
	public int input(String subject) {				
		Scanner scan = new Scanner(System.in); 		// 문자를 입력하기 위해 Scanner문을 추가했다
		
		int intScore = 0;		// intScore의 점수를 입력하기전에 먼저 초기화를 시켜주는 과정이다.
		while(true) {			// 반복문을 시작하기 위해 써주는 명령어이다. while괄호안에 있는 명령어들이 괄호가 닫힐때까지 반복된다.
			
			/*
			 * Run을 실행하면 콘솔창에 보일수 있도록 해주는 출력명령어이다.
			 * Scanner문과 함께 사용하면 내가 콘솔창에 직접 타이핑을 할수 있다.
			 * println은 엔터의 효과가 있으므로, 무엇인가를 입력할때는 ln을 떼주고 print까지만 작성해준다.
			 * 
			 */
			System.out.print(subject + "점수 입력 >> ");		
			/*
			 * 38번째 줄에서 int를 이용해서 정수형변수를 선언해주었기 때문에 int는 떼고 intScore만 사용가능하다.
			 * intScore = scan.nextInt(); 는 내가 콘솔에 intScore값을 입력할수 있도록 선언해주는 것이다.
			 */
			intScore = scan.nextInt();
			
			if(intScore < 0 || intScore > 100) {
				System.out.println(subject + "점수는 0 ~ 100까지 입력");
			}else {
				break;
			}
			/*
			 * if문은 조건이 맞는지,틀린지 여부를 가리는 명령문으로써, 
			 * intScore가 만약 0보다 적은수라면 "점수는 0점 이상 입력하시오"라는 출력문이 콘솔창에 생성될것이다.
			 */
				if(intScore < 0) {									
					System.out.println(subject + "점수는 0점 이상입력 하시오");
				// else if는 '혹은' 이라는 개념으로 쓰이며,
				// 혹은 intScore가 100보다 크다면 "점수는 100점이하로 입력하시오"라는 출력문이 콘솔창에 생성될것이다.
				}else if(intScore > 100) {
					System.out.println(subject + "점수는 100점 이하로 입력하시오");
				// else는 '그것이 아니라면' 이라는 개념으로 쓰이며,
				// 그것이 아니라면 멈추시오(=중지하시오)로 쓰였다.
				}else {
					break;
				}
			
		}// 이 괄호는 while(반복문)의 괄호가 닫힌것이다. 그래서 이 뒤에 입력된 것들 또한, 반복이 중단된다.
		
		/*
		 * 큰따옴표 사이에 문자를 넣은뒤의 더하기 (+) 표시는 말그대로 덧셈연산이 아니라,
		 * 그 뒤의 문자열과 함께 출력될수 있도록 해주는 표시이다.
		 * 그래서 큰따옴표 사이의 출력문과, intScore 변수에 입력된 숫자가 함께 콘솔에 출력된다.
		 */
		// System.out.println("입력한 점수 : " + intScore);
		
		return intScore;
		
		// 호출한 코드에서 
		// return 30; == > int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라 ....
		
	}
	
	

}

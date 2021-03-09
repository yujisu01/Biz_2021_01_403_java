package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.IolistVO;
import com.callor.iolist.service.IolistService;
import com.callor.iolist.values.Valiolist;
import com.callor.iolist.values.Values;

public class IolistServiceImplV1 implements IolistService{

	
	private List<IolistVO> ioList;
	public IolistServiceImplV1() {
		ioList = new ArrayList<IolistVO>();
	}
	@Override
	public void loadDataFromFile() {
		// TODO 데이터파일을 읽어오기
		String fileName="src/com/callor/iolist/매입매출데이터.txt";
		// 파일읽기위한 객체선언
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			// 파일읽기위한 객체생성(초기화)
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			// buffer에 읽어들인 text파일데이터에서 
			// 한 줄씩 데이터를 읽어서 처리하기
			while(true) {
				// buffer에서 한줄 데이터를 읽어서 reader변수에 저장한다.
				String reader = buffer.readLine();
				
				// 파일을 모두 읽었는지 검사 (EOF : End of File)
				// 버퍼는 EOF에 다다르면 null값을 return하고
				// reader변수에는 null값이 담겨 있게 된다.
				// 만약 reader변수에 null값이 담겨있으면, 
				// 이제 끝내라!(이제 그만출력해)
				if(reader ==null) {
					break;
				}
				// reader변수에 담긴 문자열을 연산하기
				// 우리가 할일
				// 1. 문자열을 특별한 구분자로 나누어서
				// 2. 분해한후, IolistVO 객체에 담고
				// 3. List<IolistVO> 리스트에 추가해라
				
				// 컴마(,)를 구분자로 해서 분해해라
				// 분해한 결과는 문자열 배열 형태므로
				// 문자열 배열을 선언하여 저장해 둔다.
				String[] ioDatas = reader.split(",");	
				
				// 필드생성자를 사용해서 IolistVO 객체를 생성하면서
				// 인스턴스변수에 값 담기
				IolistVO iolistVO = new IolistVO(
						// Values클래스를 이용하면 많은 변수를 생성할때 헷갈리지 않는다.
						// 문법오류도 예방할수 있다.
						// 프로젝트가 추후 커질것을 대비하여 미리 만들어놓은 (Values)클래스이다. 
						
						ioDatas[Valiolist.IO_DATE], //거래일자)
						ioDatas[Valiolist.IO_PNAME], //상품명)
						ioDatas[Valiolist.IO_DEPT], //거래처명)
						Integer.valueOf(ioDatas[Valiolist.IO_INOUT]), //구문)
						Integer.valueOf(ioDatas[Valiolist.IO_IPRICE]), //매입단가)
						Integer.valueOf(ioDatas[Valiolist.IO_OPRICE]), //판매단가)
						Integer.valueOf(ioDatas[Valiolist.IO_QTY]) //수량)
						);
				
				ioList.add(iolistVO);
			}
			// buffer와 filereader가 하는일 종료
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(fileName + "파일이 없음!!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(fileName + "파일을 읽는도중 문제발생!!!");
		}
		
	}

	@Override
	public void iolistSum() {
		// TODO 구분값에 따라 매입금액과 , 판매금액 계산하기
		
		for(IolistVO vo : ioList) {
			// 매입금액과 판매금액을 담을 변수를 0으로 생성해주고
			int iprice =0;
			int oprice =0;
			
			// 구분값을 inout변수에 담고
			int inout = vo.getIoInout();
			
			// 구분값에 따라서 iprice 또는 oprice만 계산하면
			// 계산하지 않은 변수는 0으로 계속 유지
			if(inout ==1) {		// 구분이 매입일경우
				iprice = vo.getIoIprice() * vo.getIoQty();
			}
			else if(inout==2) {
				oprice = vo.getIoOprice() * vo.getIoQty();
			}
			// 매입금액과 판매금액을 vo에 담기 
			// 난 이과정을 모르고 생략해버렸다 (까먹지않고 담아주기!)
			vo.setIoITotal(iprice);
			vo.setIoOTotal(oprice);
		}
		
	}

	@Override
	public void printIolist() {
		// TODO Auto-generated method stub
		System.out.println("** Loo9 매입매출명세서 **");
		System.out.println(Values.dLine(80));
		// 필요한 항목만 출력해준다
		System.out.println("거래일자\t거래처명\t상품명\t매입금액\t판매금액");
		System.out.println(Values.sLine(80));
		
		int nCount = 0;
		int nITotal = 0;
		int nOTotal = 0;
		
		// int형 배열은 배열을 선언함과 동시에 
		// 각 요소가 0으로 초기화된다. (객체는 별도로 초기화를 해줘야함) 
		int arrTotal[] = new int[2];
		
		for(IolistVO vo : ioList) {
			System.out.print(vo.getIoDate() + "\t");
			System.out.print(vo.getIoDept() + "\t");
			System.out.print(vo.getIoPName() + "\t");
			System.out.printf("%5d\t",vo.getIoITotal());
			System.out.printf("%5d\t\n",vo.getIoOTotal());
			
			nCount++;
			nITotal += vo.getIoITotal();
			nOTotal += vo.getIoOTotal();
			
			// 배열에 담은방식 (항목이 많을경우 배열로 해도된다)
			arrTotal[0] += vo.getIoInout();
			arrTotal[1] += vo.getIoOTotal();
		}
		System.out.println(Values.sLine(80));
		System.out.printf("합계: %3d건\t\t%3d\t%3d\n", nCount, nITotal, nOTotal);
		System.out.println(Values.dLine(80));
		System.out.printf("합계: %3d건\t\t", nCount);
		
		for(int n :arrTotal) {
			System.out.printf("%3d\t", n);
		}
		System.out.println();
		
	}

}

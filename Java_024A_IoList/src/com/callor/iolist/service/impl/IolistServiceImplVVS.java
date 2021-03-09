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

public class IolistServiceImplVVS implements IolistService {

	private List<IolistVO> ioList;

	public IolistServiceImplVVS() {
		ioList = new ArrayList<IolistVO>();
	}

	@Override
	public void loadDataFromFile() {
		// 데이터파일 읽어오기
		String fileName = "src/com/callor/iolist/매입매출데이터.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				String[] ioDatas = reader.split(",");

				IolistVO iolistVO = new IolistVO(

						ioDatas[Valiolist.IO_DATE], // 거래일자)
						ioDatas[Valiolist.IO_PNAME], // 상품명)
						ioDatas[Valiolist.IO_DEPT], // 거래처명)
						Integer.valueOf(ioDatas[Valiolist.IO_INOUT]), // 구문)
						Integer.valueOf(ioDatas[Valiolist.IO_IPRICE]), // 매입단가)
						Integer.valueOf(ioDatas[Valiolist.IO_OPRICE]), // 판매단가)
						Integer.valueOf(ioDatas[Valiolist.IO_QTY]) // 수량)
				);

				ioList.add(iolistVO);
			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없음!!!!");

		} catch (IOException e) {
			System.out.println(fileName + "파일을 읽는도중 문제발생!!!");
		}

	}

	@Override
	public void iolistSum() {
		// 판매금액,매입금액 계산

		for (IolistVO vo : ioList) {
			int iprice = 0;
			int oprice = 0;
			int inout = vo.getIoInout();

			if (inout == 1) { // 구분이 매입일경우
				iprice = vo.getIoIprice() * vo.getIoQty();
			} else if (inout == 2) {
				oprice = vo.getIoOprice() * vo.getIoQty();
			}

			vo.setIoITotal(iprice);
			vo.setIoOTotal(oprice);
		}

	}
	@Override
	public void printIolist() {
		// 출력
		System.out.println("** Loo9 매입매출명세서 **");
		System.out.println(Values.dLine(80));
		System.out.println("거래일자\t거래처명\t상품명\t매입금액\t판매금액");
		System.out.println(Values.sLine(80));

		int nCount = 0;
		int nITotal = 0;
		int nOTotal = 0;
		int arrTotal[] = new int[2];

		for (IolistVO vo : ioList) {
			System.out.print(vo.getIoDate() + "\t");
			System.out.print(vo.getIoDept() + "\t");
			System.out.print(vo.getIoPName() + "\t");
			System.out.printf("%5d\t", vo.getIoITotal());
			System.out.printf("%5d\t\n", vo.getIoOTotal());

			nCount++;
			nITotal += vo.getIoITotal();
			nOTotal += vo.getIoOTotal();

			arrTotal[0] += vo.getIoInout();
			arrTotal[1] += vo.getIoOTotal();
		}
		System.out.println(Values.sLine(80));
		System.out.printf("합계: %3d건\t\t%3d\t%3d\n", nCount, nITotal, nOTotal);
		System.out.println(Values.dLine(80));
		System.out.printf("합계: %3d건\t\t", nCount);

		for (int n : arrTotal) {
			System.out.printf("%3d\t", n);
		}
		System.out.println();

	}

}

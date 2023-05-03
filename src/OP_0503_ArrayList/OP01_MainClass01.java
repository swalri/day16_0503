package OP_0503_ArrayList;

import java.util.Scanner;

public class OP01_MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OP01_ServiceClass opsc = new OP01_ServiceClass();
		String num;
		int choice;
		//프로그램 실행
		while(true) {
			System.out.println("==================");//칸나누기
			System.out.println("1. 학생 검색");
			System.out.println("2. 학생 등록");
			System.out.println("3. 모든 학생 보기");
			System.out.println("4. 종료");
			System.out.print(">>> ");
			try {
				num = scan.next();
				choice = Integer.parseInt(num);
				switch(choice) {
				case 1://학생 검색
					opsc.serch();
					break;
				case 2://학생 등록
					opsc.plus();
					break;
				case 3://모든 학생 보기
					opsc.showAll();
					break;
				case 4://종료
					System.out.println("종료합니다");
					System.exit(0);
					break;
				default://오류
					System.out.println("잘못입력했습니다");
					break;
				}//switch
			} catch (NumberFormatException e) {//문자입력오류
				System.out.println("잘못입력했습니다");
			}//try catch
		}//while
	}
}

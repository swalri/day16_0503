package OP_0503_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class OP01_ServiceClass {
	private Scanner scan = new Scanner(System.in);
	ArrayList<OP01_DTOClass> arrMember = new ArrayList<>();
	
	//이름, 학번, 국, 영, 수, 등급
	String name;//이름
	int number;//학번
	String num;//학번 입력
	int kor;//국어
	int eng;//영어
	int math;//수학
	
	//학생 검색
	public void serch() {
		System.out.print("학번 입력 : ");
		num = scan.next();
		number = Integer.parseInt(num);
		for(OP01_DTOClass stdto : arrMember) {
			if(stdto.getNumber() == number) {
				System.out.println(stdto.getNumber());
				System.out.println(stdto.getName());
				System.out.println(stdto.getKor());
				System.out.println(stdto.getEng());
				System.out.println(stdto.getMath());
				System.out.println(stdto.getRating());
			}
		}
	}
	
	// 학생 등록
	public void plus() {
		OP01_DTOClass dto = new OP01_DTOClass();
		boolean a = true;
		System.out.print("학번 입력 : ");
		num = scan.next();
		number = Integer.parseInt(num);
		
		for(OP01_DTOClass stdto : arrMember) {
			if(stdto.getNumber() == number) {
				System.out.println("중복된 학번은 사용할 수 없습니다");
				a = false;
				break;
			}
		}
		if(a) {
			System.out.print("이름 입력 : ");
			name = scan.next();
			System.out.print("국어 점수 입력 : ");
			kor = scan.nextInt();
			System.out.print("영어 점수 입력 : ");
			eng = scan.nextInt();
			System.out.print("수학 점수 입력 : ");
			math = scan.nextInt();
			
			dto.setNumber(number);
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMath(math);
			dto.setRating(ratingFunc());
			arrMember.add(dto);
			
			System.out.println("가입되셨습니다");
		}
	}
	//연산 : 합,평균,등급을 구하는 기능
	private String ratingFunc() {
		int sum = kor+eng+math;
		double avg = sum / 3;
		String rating; //등급
		if(avg >= 90)	   {rating = "A";}
		else if(avg >= 80) {rating = "B";}
		else if(avg >= 70) {rating = "C";}
		else if(avg >= 60) {rating = "D";}
		else if(avg >= 50) {rating = "E";}
		else {				rating = "F";}
		return rating;
	}
	
	//전체보기
	public void showAll() {
		for(OP01_DTOClass stdto : arrMember) {
			System.out.println(stdto.getNumber());
			System.out.println(stdto.getName());
			System.out.println(stdto.getKor());
			System.out.println(stdto.getEng());
			System.out.println(stdto.getMath());
			System.out.println(stdto.getRating());
		}
	}
	
}

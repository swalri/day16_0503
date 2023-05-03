package day16_0503;

import java.util.ArrayList;
import java.util.Scanner;

class Member03{
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Member03> list = new ArrayList<>();
		String name;
		int num;
		while(true) {
			System.out.println("=================");
			System.out.println("1. 등록");
			System.out.println("2. 모든 내용 출력");
			System.out.println("3. 종료");
			
			num = scan.nextInt();
			switch(num){
			case 1: 
				System.out.print("이름 입력 : ");
				name = scan.next();
				Member03 m = new Member03();
				m.setName(name);
				list.add(m);
				System.out.println("저장 완료");
				break;
			case 2: 
				for(Member03 mm : list) {
					System.out.println(mm.getName());
					System.out.println(mm.getAge());
				}
				break;
			case 3: System.exit(0);
			case 4:
				System.out.print("이름 입력 : ");
				num = scan.nextInt();
				Member03 mm = new Member03();
				mm.setAge(num);
				list.add(mm);
				System.out.println("저장 완료");
				break;
			default : break;
			}
		}
		
		
	}
}

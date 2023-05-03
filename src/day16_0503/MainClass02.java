package day16_0503;

import java.util.ArrayList;

class Member {
	private String name, addr;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAddr() {return addr;}
	public void setAddr(String addr) {this.addr = addr;}
}

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		Member m1 = new Member();
		
		m1.setAddr("k"); m1.setName("kim");
		list.add(m1);
//		System.out.println(list.get(0).getName());
		Member m01 = list.get(0);
		System.out.println(m01.getName());
		System.out.println(m01.getAddr());
		
		Member m2 = new Member();
		
		m2.setAddr("g"); m2.setName("gim");
		list.add(m2);
		System.out.println("=============");
		for(int i=0;i<list.size();i++) {
//			Member m = list.get(i);
//			System.out.println(m.getName());
//			System.out.println(m.getAddr());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAddr());
			System.out.println("---------");
		}
		System.out.println("=============");
		for(Member mm : list) {
			System.out.println(mm.getName());
			System.out.println(mm.getAddr());
			System.out.println("---------");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}

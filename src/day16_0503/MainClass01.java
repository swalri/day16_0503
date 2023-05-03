package day16_0503;

import java.util.ArrayList;
import java.util.HashMap;

/*
wrapper class
 - 일반 8대 기본 자료형을 클래스 타입으로 변경한 것
 - int, char, double...
 - Integer, Character, Double...
*/
class A01<Ta>{
	public void sumFunc(Ta n1, Ta n2) {
		System.out.println(n1+", "+n2);
	}
	
	
	
	
}
public class MainClass01 {
	public static void main(String[] args) {
//		ArrayList<E> arr;
//		HashMap<K, V> ar;
		A01<Integer> a = new A01<>();
		a.sumFunc(10, 20);
		
		A01<String> aa = new A01<>();
		aa.sumFunc("aa", "bb");
		
		
		
	}
}

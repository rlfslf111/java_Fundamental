package java_20191127;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		// java 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 없었음.
		// primitive data type을 객체화 할 수 있는 Wrapper class로 변환하여 저장해야 한다.

		// java 1.5 or java5.0 이후
		ArrayList<Integer> list = new ArrayList();
		list.add(1); // auto-boxing
		list.add(2); // auto-boxing

		Integer i1 = list.get(0);
		Integer i2 = list.get(1);
		int b = i1 + i2; // auto-unboxing

		//String str = "" + 10; 
		String str = String.valueOf(10);
		// 문자열을 int로 바꿀때 사용
		int d = Integer.parseInt(str);
		System.out.println(str);
		System.out.println(d);
	}
}

package java_20191126;

import java.util.ArrayList;

public class CallbyRefDemo {
	public static void change(int i, int[] j,String str) {
		i = 20;
		j[3] = 400;
		str+="123";
	}
	public static void add(String data,ArrayList<String> list){
		list.add(data);
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1111");
		add("2222",list);
		for (String data : list) {
			System.out.println(data);
		}
		
		int a = 10;
		int b[] = { 1, 2, 3, 4 };
		String str = "abc";
		System.out.println(a);
		System.out.println(b[3]);
		System.out.println(str);

		// a call by value, b call by reference
		CallbyRefDemo.change(a, b,str);

		System.out.println(a);// call by value method 호출후 변화 없음
		System.out.println(b[3]);// call by reference method 호출 후 변화 있음
		System.out.println(str);
		
		int[] c;
		c = new int[4];
		System.out.println(c[1]);

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		int[] d = null;
		System.out.println(d);
		d = new int[4];

		int age;
		age = 10;
		System.out.println(age);

	}
}

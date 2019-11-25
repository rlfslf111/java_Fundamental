package java_20191125;

public class StaticDemo {
	static String name;
	int age;
	
	public void m1(){
		name="gil";//instance method에서는 static 변수 사용 가능
		age=20;//instance method에서는 instance 변수 사용 가능
		m2();//instance method에서는 instance method 호출 가능
		m4();//instance method에서는 static method 호출 가능
	}
	public void m2(){
		System.out.println("instance method m2()");
	}
	public static void m3(){
		name="gil";//static method에서 static 변수 사용 가능
		//age=26; //static method 에서 instance 변수 사용 불가능
		//m2(); //static method에서 instance method 호출 불가능
		m4();//static method에서 static method 호출 가능
		StaticDemo sd=new StaticDemo();
		sd.age=26;
		sd.m2();
	}
	public static void m4(){
		System.out.println("static method m4()");
	}
	
}

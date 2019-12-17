package java_20191126;
import java.lang.*; //생략되어있음
public class Super {//extends Object가 생략되어있음
	int money;
	public Super(){
		super();
	}
	public Super(int money){
		//super(); default로 생략되어있음
		this.money=money;
	}
	public void makeMoney(){
		System.out.println("Super makeMoney()");
	}
	public void play(String omok){
		System.out.println("Super play()");
	}
	
	
}

/*
this => 1. 자기자신 객체 -> this.
	 => 2. 다른 생성자 호출 -> this(~);

super=> 1. 부모의 객체 super.
	 => 2. 부모의 생성자 호출
*/
package java_20191126.Inheritance;

public class Child extends Parent{
	double height=181.4;
	//overriding : 부모의 method 재 정의
	//1. method 이름, 매개변수, 반환형 일치
	//2. 접근 한정자는 부모보다 자식이 상위이거나 같으면 됨
	public void work(){
		//super.work();//부모의 work를 호출하고 싶을때
		System.out.println("Child work()");
	}
	public void playGame(){
		System.out.println("Child playGame()");
	}
}

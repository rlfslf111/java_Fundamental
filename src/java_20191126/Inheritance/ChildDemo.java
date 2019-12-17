package java_20191126.Inheritance;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.age=44;
		System.out.println(p1.age);
		p1.work();
		p1.playBadook();
		
		Child c1=new Child();
		System.out.println(c1.height);
		c1.age=25;
		c1.height=190.32;
		c1.playBadook();
		c1.playGame();
		c1.work();
		
		Parent p2=new Child();
		System.out.println(p2.age);
		p2.work();//자신의 work가 아닌 child의 work를 호출함
		p2.age=55;
		p2.playBadook();
		//p2.height 호출 불가능
		//p2.playGame() 호출 불가능
		
		
		/*Child c2=(Child)new Parent();
		System.out.println(c2.age);*/ //ClassCastException 오류
		
	}
}

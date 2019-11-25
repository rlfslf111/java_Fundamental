package java_20191122;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer.interestRate=3.4;
		Customer c1 = new Customer();
		c1.name="길민규";
		c1.email="rlf@naver.com";
		
		System.out.println(c1.name+","+c1.email);
		
		Customer c2 = new Customer();
		c2.name="황의권";
		c2.email="hwang@naver.com";
		
		System.out.println(c2.name+","+c2.email);
		
		Customer c3 = new Customer();
		c3.name="박대현";
		c3.email="park@naver.com";
		
		System.out.println(c3.name+","+c3.email);
		
		Customer c4=c3;
		c4.name="잡스";
		
		System.out.println(c3.name+","+c3.email);
		
		Customer c5 = new Customer();
		c5.name="황의권";
		c5.email="hwang@naver.com";
		System.out.println(c2==c5);
		System.out.println(c3==c4);
		
		//static 변수는 reference 접근 가능하나 일반적으로 클래스 이름을 접근한다.
		//일반적으로 클래스 이름을 접근한다.
		c1.interestRate =10.2;
		System.out.println(c3.interestRate);
		
		Customer.interestRate=12.2;
		System.out.println(Customer.interestRate);
		
//		final Class는 변수 변경이 불가능하다
//		Customer.BANKNAME="국민흔행";
	}
}

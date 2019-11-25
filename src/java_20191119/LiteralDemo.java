package java_20191119;

public class LiteralDemo {
	public static void main(String[] args){
		
		//byte 범위를 넘어가면 overflow 발생
		//byte b1=128;
		byte b2=127;
		
		int a1=128;//10진수 표기법
		int a2=076;//8진수 표기법
		int a3=0x123;//16진수 표기법
		int a4=0b10101;//2진수 표기법
		
		System.out.println(b2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long Literal은 숫자위에 L 또는 l 로 표기
		long l1=2200000l;
		
		//float Literal은 소숫점 위에 f 또는 F로 표기
		float f1=123.43f;
		
		//double Literal은 소숫점 위에 d 또는 D로 표기 (생략 가능)
		double d1=1234.56;
		
		//boolean Literal은 true 또는 false
		boolean isExisted=false;
		
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(isExisted);
		
		a1=10;
		d1=10.0;
		//primitive data type의 == 연산자는 값만 비교함
		System.out.println(a1==d1);
		
		int first=10;
		int second=first;
		System.out.println(first);
		System.out.println(second);
		
		char s1='\uAE38';
		char s2='\uBBFC';
		char s3='\uADDC';
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}

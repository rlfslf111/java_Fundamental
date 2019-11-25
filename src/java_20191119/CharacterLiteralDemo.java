package java_20191119;

public class CharacterLiteralDemo {
	public static void main(String[] args){
		//1. 유니코드 표현 => '\u0000';
		char c1='\uAE38';
		char c2='\uBBFC';
		char c3='\uADDC';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//2.ASCII Code 표현
		char a1=65;
		char a2=97;
		System.out.println(a1);
		System.out.println(a2);

		//3.문자 표현 => ''
		char s1='Y';
		char s2='길';
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("hello\n"+"world");
		String path="C:\\dev\\\"eclipse\"";
		System.out.println(path);
	}
}

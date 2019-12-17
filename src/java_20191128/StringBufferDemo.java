package java_20191128;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		
		//StringBuffer class는  object의 equals() method를 overriding
		//하지 않았기 때문에 equals()를 사용하면 false가 반환된다.
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3);
		
		//문자열 추가
		StringBuffer sq1 = new StringBuffer();
		sq1.append("select name,age");
		sq1.append("from member");
		sq1.append("where");
		sq1.append("order by name desk");
		System.out.println(sq1);
		//추가한 문자를 지우고 싶을 때
		sq1.setLength(0); // <-이게 지우는거 
		sq1.append("select no,writer");
		sq1.append("from broad");
		System.out.println(sq1);
		
	}
}

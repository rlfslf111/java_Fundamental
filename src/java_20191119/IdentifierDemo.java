package java_20191119;//identifier 규칙을 지켜서 생성
//Class 명의 첫글자는 대문자
//두 단어가 합친 경우에는 두 번째 단어의 첫글자는 대문자로 사용 - camel case
public class IdentifierDemo {
	public static void main(String[] args){
		int age=20;
		String name="hello";
		
		//첫글자는 숫자를 사용할 수 없음.
		//String 1fatherName="god";
		
		//공백을 사용할 수 없음.
		//String mother Name="Miche11"
		
		//예약어는 사용할 수 없음.
		//String void="empty";
		
		//Java에서 문자는 유니코드를 의미하기 때문에 세게 모든 문자를 사용할 수 있음
		String 이름="Gil";
		
		System.out.println(이름);
		System.out.println(age);
	}
}

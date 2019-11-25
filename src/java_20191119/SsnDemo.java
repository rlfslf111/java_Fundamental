package java_20191119;

public class SsnDemo {
	public static void main(String[] args){
		int a1=1;
		int a2=1;
		int a3=1;
		int a4=1;
		int a5=1;
		int a6=1;
		
		int b1=1;
		int b2=1;
		int b3=1;
		int b4=1;
		int b5=1;
		int b6=1;
		int b7=8;
		
		//1. 각 자리수를 2부터 9까지 곱하기
		int sum=0;
		sum=a1*2+a2*3+a3*4+a4*5+a5*6+a6*7+b1*8+b2*9+b3*2+b4*3+b5*4+b6*5;
		System.out.println(sum);
		//2. 총 합을 11로 나눈 나머지를 구한다.
		int rest=0;
		rest=sum%11;
		System.out.println(rest);
		//3.11에서 나머지를 뺸다
		int su=0;
		su=11-rest;
		System.out.println(su);
		//4. 3의 결과를 다시 10으로 나눈 나머지를 구한다.
		int fin=0;
		fin=su%10;
		System.out.println(fin);
		//5. 4의 결과와 맨 마지막 숫자가 같으면 "정상적인 주민번호"
		//	그렇지 않으면 "비 정상적인 주민번호" 메세지를 출력한다.
		if(fin==b7){
			System.out.println("정상적인 주민번호");
		}else{
			System.out.println("비 정상적인 주민번호");
		}
//		switch(fin=b7){
//		case 8:
//			System.out.println("정상적인 주민번호");
//			break;
//		default:
//			System.out.println("비정상적인 주민번호");
//		}
	}
}

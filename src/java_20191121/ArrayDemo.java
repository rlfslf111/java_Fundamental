package java_20191121;

public class ArrayDemo {
	public static void main(String[] args){
		//1.배열 선언
		int[] a= new int[4];
		
		//2.배열 할당
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		//length=>배열의 길이
		//length()=>문자열의 길이
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		//배열 생성과 할당을 동시에 설정
		int[] b= {1,2,3,4};
//		for(int j=0; j<b.length; j++){
//			System.out.print(b[j]);
//		}
		b[2]=8;
		b[1]=100;
		for(int temp:b){
			System.out.print(temp);
		}
		
	}
}

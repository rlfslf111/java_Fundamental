package java_20191119;

public class OperatorDemo {
	public static void main(String[] args){
		int a=7, b=20;
		int c=0;
		double d=0;
		c=a+b;
		System.out.println(c);
		
		c=a-b;
		System.out.println(c);
		
		c=a*b;
		System.out.println(c);
		
		d=(double)b/a;
		System.out.println(d);
		
		d=b%a;
		System.out.println(d);
		
		a+=b;
		System.out.println(a);
		
		int sum=0;
		for(int i=1; i<=100; i++){
			sum+=i;
		}
		System.out.println(sum);
		
		//증가 후 대입
		int a1=11, f=0;
		f=++a1;
		System.out.println(f);
		//대입 후 증가
		int y=14;
		f=y++;
		System.out.println(f);
		
		a=10;
		b=20;
		boolean isSuccess=false;
		isSuccess=a>=b;
		System.out.println(isSuccess);
		isSuccess=a<=b;
		System.out.println(isSuccess);
		isSuccess=a!=b;
		System.out.println(isSuccess);
		isSuccess=(a==b)&&(a++==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		isSuccess=(a==b)||(a++==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		c=10;
		d=20;
		System.out.printf("age:%d",c);
	}
}

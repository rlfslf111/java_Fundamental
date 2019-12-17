package java_20191119;

public class ForDemo {
	public static void main(String[] args){
		String str="hello";
		int a1=10;
		int a2=20;
		double d1=12.4567;
		System.out.printf("%s\n",str); 
		System.out.printf("%d %d\n",a1,a2); 
		
		int sum=0;
		for(int i=1; i<=100; i++){
			sum+=i;
		}
		System.out.printf("최종값:%d\n",sum);
		long end =System.currentTimeMillis();
		System.out.println("경과시간:"+end);
		
		int sum1=0;
		for(int i=1;i<100;i++){
			if(i%2==0){
				sum1+=i;
			}
		}
		System.out.println(sum1);
		
		int mul=1;
		for(int i=1; i<10; i++){
			for(int y=1; y<10; y++){
				mul=i*y;
				System.out.printf("%d*%d=%d\n",i,y,mul);
			}	
		}
		
		int mul1=1;
		for(int i=9; i>0; i--){
			for(int y=1; y<10; y++){
				mul1=i*y;
				System.out.printf("%d*%d=%d\n",i,y,mul1);
			}	
		}
		
		for(int i=0; i<5; i++){
			for(int j=0; j<i+1; j++){
				System.out.print('*');	
			}
			System.out.println();
		}
		
		for(int i=5; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print('*');	
			}
			System.out.println();
		}
		
		//피라미드 만들기
		for(int i=0; i<5; i++){
			for(int j=0; j<5-i; j++){
				System.out.print(" ");
			}for(int k=0; k<=2*i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
}

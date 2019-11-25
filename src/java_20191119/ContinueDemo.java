package java_20191119;

public class ContinueDemo {
	public static void main(String[] args){
		int sum=0;
		for(int i=0; i<=10;i++){
			if(i>=5) continue;
			sum+=i;
		}
		System.out.println(sum);
		
		
		
//		outter : for(int i=2;i<=9;i++){
//			for(int j=2;j<=9;j++){
//				if(i==5) continue outter;
//				System.out.printf("%dx%d=%d\n",i,j,i*j);
//			}
//		}
	}
}

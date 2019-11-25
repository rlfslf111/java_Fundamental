package java_20191119;

public class BreakDemo {
	public static void main(String[] args){
		int sum=0;
		for(int i=0; i<10; i++){
			sum+=i;
			if(i==5) break;
		}
		System.out.println(sum);
		
		for(int i=2;i<=9;i++){
			for(int j=2;j<=9;j++){
				if(j==9) break;
				System.out.printf("%dx%d=%d\n",i,j,i*j);
			}
		}
		
		//lable break 문 For문 마다 lable을 설정해두고 빠져나감
		outter : for(int i=2;i<=9;i++){
			for(int j=2;j<=9;j++){
				if(i==5&&j==9) break outter;
				System.out.printf("%dx%d=%d\n",i,j,i*j);
			}
		}
		
	}
}

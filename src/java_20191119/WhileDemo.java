package java_20191119;

public class WhileDemo {
	public static void main(String[] args){
		int su=2;
		int i=1;
		while(i<10){
			int mul=su*i;
			System.out.printf("%d*%d=%d\n",su,i,mul);
			i++;
		}
		
		int sum=0;
		int ej=1;
		while(ej<=100){
			sum+=ej;
			ej++;
		}
		System.out.printf("1부터 100까지의 합은:%d\n",sum);
	
		int first=2;
		while(first<=9){
			int second=1;
			while(second<=9){
			int mul=1;
			mul=first*second;
			System.out.printf("%d*%d=%d\n",first,second,mul);
			second++;
			}
			first++;
		}
	
	}
}

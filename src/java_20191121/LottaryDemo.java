package java_20191121;

public class LottaryDemo {
	public static void main(String[] args){
		//Math.random() -> 0 이상 1미만의 임의의 double 값을 반환
		int[] lotto=new int[6];
		
		for(int i=0; i<lotto.length; i++){
			double random= Math.random();
			int temp=(int)(random*45)+1;
			lotto[i]=temp;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
					break; //for문을 빠져나간다.
				}
			}
		}
		//오름차순 정렬하기
		for(int i=0; i<lotto.length-1;i++){
			for(int j=0;j<lotto.length-(i+1);j++){
				if(lotto[j]>lotto[j+1]){
					int temp=lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
				}
			}
		}
		
		for(int j:lotto){
			System.out.print(j+"\t");
		}
	}
}

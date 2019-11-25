package java_20191121;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits={"apple","banana","watermelon","peach"};
		String[] temp =new String[6];
		/*fruits => 원본 배열
		 * 0=> 원본배열의 위치. 즉 원본배열의 복사할 시작위치
		 * temp=> 복사할 배열
		 * 2=>복사할 배열의 시작위치
		 * 4=>원본 배열 복사할 길이
		*/
		System.arraycopy(fruits, 0, temp, 2, 4);
		temp[0]="blueberry";
		temp[1]="cherry";
		
		for(int i=0; i<fruits.length;i++){
			System.out.println(fruits[i]);
		}
		System.out.println("");
		
		for(int i=0; i<temp.length;i++){
			System.out.println(temp[i]);
		}
		System.out.println("");
		
		String[] ref=temp;
		ref[2]="muhwagwa";
		System.out.println(temp[2]);
		System.out.println("");
		
		for(int i=0; i<ref.length;i++){
			System.out.println(ref[i]);
		}
		
		System.out.println();
		
		int[] a={1,2,3,4};
		int[] b={1,2,3,4};
		if(a==b){
			System.out.println("good");
		}else{
			System.out.println("bad");
		}
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j]){
					System.out.println("good");
				}
			}
		}
	}
}

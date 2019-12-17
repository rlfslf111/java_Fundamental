package java_20191121;

import java.util.*;

public class MakeCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.println("월을 입력하세요 : ");
		int month = scan.nextInt();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);

		
		 
		System.out.println("---------["+year+"년"+month+"월]----------");
		System.out.println("   일      월      화      수      목      금      토    ");
		cal.set(year, month-1,1);
		
		int end=cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i=1; i<=end; i++){
			if(i==1){
				for(int j=1; j<dayOfWeek; j++){
					System.out.print("    ");
				}
			}
			if(i<10){
				System.out.print(" ");
			}
			System.out.print(" "+i+" ");
			if(dayOfWeek%7==0){
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println();
		System.out.println("-----------------------------");
	}
}

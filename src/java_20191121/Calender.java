package java_20191121;
import java.util.*;

public class Calender {
	public static void main(String[] args){
		/*달력 만들기
		 * 1. 1년 1월 1일은 월요일
		 * 2. 1년 365일,윤년은 366일 = 2월 29일까지 존재
		 * 3. 윤년은 4년마다 발생하고 그중에서 100배수는 제외하고 400의 배수는 제외하지 않는다.
		 * 4. 2019년 12월 25일은 무슨 요일인가?를 구한다.
		*/
		Scanner scan = new Scanner(System.in);
		int year,month,day;
		System.out.print("년:");
		year = scan.nextInt();
		System.out.print("월:");
		month=scan.nextInt();
		System.out.print("일:");
		day=scan.nextInt();
		String message = null;
		int[] monthArray={31,28,31,30,31,30,31,31,30,31,30,31};

		String[] weekNames={"일","월","화","수","목","금","토"};
		int illsu,yoil;
		if(year%4==0&&year%100!=0||year%400==0){
			monthArray[1]=29;
		}else{
			monthArray[1]=28;
		}
		illsu=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		for(int i=0; i<month-1;i++){
			illsu+=monthArray[i];
		}
		illsu+=day;
		yoil=illsu%7;
		message=weekNames[yoil];
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.",year,month,day,message);
	}
}

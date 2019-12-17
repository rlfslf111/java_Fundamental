//package java_20191121;
//
//public class CalendarDemo {
//	private int year;
//	private int month;
//	private int day;
//	private int totalCount;
//	int[] monthArray={31,28,31,30,31,30,31,31,30,31,30,31};
//	
//	
//	public CalendarDemo(int y){
////		year=y;
//		this(y,0,0);
//	}
//	public CalendarDemo(int m,int d){
////		month=m;
////		day=d;
//		this(m,d,0);
//	}
//	
//	//this=> 1.자기 자신 객체
//	//		 2.다른 생성자 호출 -> this(~); ->생성자 에서만 호출 가능!
//	
//	//매개변수 3개짜리 생성자
//	public CalendarDemo(int y, int m, int d){
//		this.year = year;
//		this.month = month;
//		this.day = day;
//		getTotalCount();
//	}
//	public void set(int y, int m, int d){
//		year = y;
//		month = m;
//		day = d;
//		getTotalCount();
//	}
//	private void getTotalCount(){
//		int preyear=year-1;
//		int premonth=month-1;
//		totalCount=preyear*365+(preyear/4)-(preyear/100)+(preyear/400);
//	}
//	/*
//	public CalendarDemo(){
//		
//	}*/
//	public static void main(String[] args) {
//		CalendarDemo c=new CalendarDemo(2019,12,25);
////		c.set(2019,12,25);
//	}
//}
package java_20191121;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기 1. 1년 1월 1일은 월요일 2. 1년 365일 , 윤년은 366일 - 2월 29일 3. 윤년은 4년마다
		 * 발생하고 그중에서 100배수는 제외하고 400의 배수는 제외하지 않는다. 4. 2019년 12월 25일 무슨요일까요?
		 */

		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// preYear => 2018년도
		int preYear = year - 1;
		// preMonth => 2019년 11월
		int preMonth = month - 1;
		int totalCount = 0;

		// 2018년도까지 총일 수 구하기
		totalCount = preYear * 365 + 
				(preYear / 4 - preYear / 100 + preYear / 400);
		//2019년도가 윤년인지 판단한다.
		boolean isLeafYear = 
				year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		//2019년도가 윤년이면 2월 29일로 변경한다.
		if (isLeafYear) {
			monthArray[1] = 29;
		}

		// 2019년도 11월까지 합 구하기
		for (int i = 0; i < preMonth; i++) {
			totalCount += monthArray[i];
		}
		
		//2019년 11월까지 합을 구했으면 날짜를 더하여 총 일수를 구한다.
		totalCount += day;

		int dayOfWeek = totalCount % 7;
		if (dayOfWeek == 1) {
			message = "월요일";
		} else if (dayOfWeek == 2) {
			message = "화요일";
		} else if (dayOfWeek == 3) {
			message = "수요일";
		} else if (dayOfWeek == 4) {
			message = "목요일";
		} else if (dayOfWeek == 5) {
			message = "금요일";
		} else if (dayOfWeek == 6) {
			message = "토요일";
		} else if (dayOfWeek == 0) {
			message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.", 
				year, month, day, message);

	}
}
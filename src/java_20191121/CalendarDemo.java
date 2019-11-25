package java_20191121;

public class CalendarDemo {
	private int year;
	private int month;
	private int day;
	int[] monthArray={31,28,31,30,31,30,31,31,30,31,30,31};
	public void set(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	public static void main(String[] args) {
		CalendarDemo c=new CalendarDemo();
		c.set(2019,12,25);
	}
}

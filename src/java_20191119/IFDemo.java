package java_20191119;
import java.util.*;

public class IFDemo {
	public static void main(String[] args){
		//Run Configurations=> Arguments=> Program arguments
		//java java_20191119.IfDemo 12(args[0]) 1998(args[1])
//		int month=Integer.parseInt(args[0]);
//		String season=null;
//		if(month==12||month==1||month==2){
//			season="겨울";
//		}else if(month==3||month==4||month==5){
//			season="봄";
//		}else if(month==6||month==7||month==8){
//			season="여름";
//		}else if(month==9||month==10||month==11){
//			season="가을";
//		}else{
//			season="Empty";
//		}
//		System.out.println(month+"월은\t"+season+"입니다.");
//		
//		int month=5;
//		switch(month){
//		case 1: case 2: case 12:
//			System.out.println("현재의 게절은 겨울입니다.");
//			break;
//		case 3: case 4: case 5:
//			System.out.println("현재의 계절은 봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("현재의 계절은 여름입니다.");
//			break;
//		default:
//		case 9: case 10: case 11:
//			System.out.println("현재의 계절은 가을입니다.");
//		}
//		
		System.out.println("현재의 게절을 입력해주세요:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month){
		case 1: case 2: case 12:
			System.out.println("현재의 게절은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		default:
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
		}
		
	}

}

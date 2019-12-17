package java_20191129;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsDemo {
	public static double getAverage(int[] temp) throws ArrayIndexOutOfBoundsException{
		int sum = 0;
		int k = temp [0];
		int m = temp [1];
		int e = temp [2];
		int h = temp [3];
		sum=k+m+e+h;
		return (double)sum/(double)4;
	}
	public static void main(String[] args) {
		int[] exam = {10,20,30};
		try{
			double avg = getAverage(exam);			
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("국,영,수,사 4과목을 입력해");
		}
		
	}
}

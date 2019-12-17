package java_20191129;

public class TryCatchDemo {
	public static double getAvg(int k, int e){
		int sum = k + e;
		double avg = (double)sum/(double)2;
		return avg;
	}
	public static void main(String[] args) {
		try{
			int k = Integer.parseInt(args[0]);
			int e = Integer.parseInt(args[1]);
			double average = getAvg(k,e);
			System.out.printf("평균 : %.2f",average);			
		}catch(NumberFormatException e){
			//e.printStackTrace(); //error 과정들을 쭈욱 보여주는 문장
			//System.out.println(e.getMessage());
			System.err.println("점수는 숫자야 바보야");
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("인자를 2개 넣어줴");
		}
	}
}

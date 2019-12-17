package java_20191126.step1;
//1.요구사항 : 밀리 세컨즈로 경과 시간을 만들어주세요.
//2.요구사항 : 나노 세컨즈로 경과 시간을 만들어주세요.
public class FootStopWatch {
	long startTime;
	long endTime;
	public double getElapsedMilliTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		
		//1970년 1월 1일 부터 지금까지의 시간을 Milliseconds로 반환==currentTimeMillis
		f.startTime = System.currentTimeMillis();
		for(long i =0; i<20000000000l; i++){
			
		}
		
		f.endTime =  System.currentTimeMillis();
		
		double elapsedTime=f.getElapsedMilliTime();
		System.out.printf("경과 시간 %.3f",elapsedTime);
	}
}



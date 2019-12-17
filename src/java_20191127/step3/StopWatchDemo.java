package java_20191127.step3;

//1.실제 비지니스 logic이 있는 class와 실행되는 class를 분리해보기
//2. 시간을 측정하는 기능을 method로 추출
public class StopWatchDemo {
	public static void main(String[] args) {
		
		StopNanoWatch s = new StopNanoWatch();
		s.start();
		for(long i=0; i<5000000000l; i++){
				
		}
		s.stop();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과 시간 : %.9f\n",elapsedTime);
		}
	
}

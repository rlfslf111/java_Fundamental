package java_20191127.step5;

//1.실제 비지니스 로직을 해당 클래스의 메서드로 만들어보자.
//2.클래스들의 공통 요소가 있으면 부모 클래스로 상속하자.
public class StopWatchDemo {
	public void execute(StopWatch s){
		s.run();
	}

	
	public static void main(String[] args) {
		StopWatchDemo swd = new StopWatchDemo();
		
		StopMilliWatch s1 = new StopMilliWatch();
		swd.execute(s1);
//		swd.execute(new StopMilliWatch());
		
		StopNanoWatch s2 = new StopNanoWatch();
		swd.execute(s2);
//		swd.execute(new StopNanoWatch());
		
		StopMicroWatch s3 =new StopMicroWatch();
		swd.execute(s3);
//		swd.execute(new StopMicroWatch());
		
	}
}

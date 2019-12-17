package java_20191127.step6;

//1. 모든 클래스의 Encapsulation
//2. main Class의 java Reflection 추가
public class StopWatchDemo {
	public void execute(StopWatch s) {
		s.run();
	}

	public static void main(String[] args) throws Exception {
		String input = args[0];
		String ClassName = "java_20191127.step6." + input;
		StopWatchDemo swd = new StopWatchDemo();
		StopWatch s = (StopWatch) Class.forName(ClassName).newInstance();
		swd.execute(s);

		/*
		 * StopMilliWatch s1 = new StopMilliWatch(); swd.execute(s1); //
		 * swd.execute(new StopMilliWatch());
		 * 
		 * StopNanoWatch s2 = new StopNanoWatch(); swd.execute(s2); //
		 * swd.execute(new StopNanoWatch());
		 * 
		 * StopMicroWatch s3 =new StopMicroWatch(); swd.execute(s3); //
		 * swd.execute(new StopMicroWatch());
		 */
	}
}

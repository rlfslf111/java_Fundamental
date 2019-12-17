package java_20191202;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	@Override
	public synchronized void run() {
		
		
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			
			//synchronized(SynchronizedDemo.class){
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d , y : %d - %s%n",x,y,threadName);
			//}
		}
	}
	public static void main(String[] args){
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		
		//t1.start();
		//t2.start();
		
		while(true){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Thread(s1).start();
		}
		
		
		
		
		
		
	}
}
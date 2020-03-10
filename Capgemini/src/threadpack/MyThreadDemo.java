package threadpack;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<15;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" " + i);
		}
	}
}

public class MyThreadDemo {
	public static void main(String[] args)throws Exception {
		 MyThread thread = new MyThread();
		 thread.setName("one");
		 thread.start();
//		 thread.join();
		 thread.start();
		 MyThread thread2 = new MyThread();
		 thread2.setName("two");
		 thread2.start();
//		 thread2.join();
		 for(int i=1;i<7;i++)
			 System.out.println(Thread.currentThread().getName()+" " + i);
		
	}

}

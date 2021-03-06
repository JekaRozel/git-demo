package multithread;

public class M1 {
	
	private  int count = 0;
	
	public synchronized void increment() {  //если вместо этого метода использовать count++
		count++;							//прямо в потоках, то будут ошибки
	}
	
	public static void main(String[] args) {
		M1 app = new M1();
		app.doWork();
	}
	
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i=0; i<10000; i++) {
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<10000; i++) {
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count is: " + count);
	}

}

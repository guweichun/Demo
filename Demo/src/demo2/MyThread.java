package demo2;

public class MyThread implements Runnable {

	int count= 1, number;

	public MyThread(int num) {

		number = num;
	
		System.out.println("�����߳� " + number);
	
	}

	public void run() {
	
	
	
	
		while(true) {
		
			System.out.println("�߳� " + number + ":���� " + count);
			
			if(++count== 6) return;
		
		}
	
	}

	public static void main(String args[]) {

		for(int i = 0; i < 5; i++){
			MyThread h = new MyThread(i+1);
			
			new Thread(h).start();
			int a = new Thread(h).getPriority();
			System.out.println("a="+a);
		}
		
//		int count=1;
//		int a=count++;
//		System.out.println(count);
//		int b=++count;
//		
//		System.out.println(b);
	
	}

}


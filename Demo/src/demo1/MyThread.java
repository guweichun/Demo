package demo1;

class MyThread implements Runnable{
	 
    private int ticket = 5;  //5��Ʊ
 
    public void run() {
        for (int i=0; i<=20; i++) {
            if (this.ticket > 0) {
                System.out.println(Thread.currentThread().getName()+ "������Ʊ"+this.ticket--);
            }
        }
    }
    
    public static void main(String [] args) {
        MyThread my = new MyThread();
        new Thread(my, "1�Ŵ���").start();
        new Thread(my, "2�Ŵ���").start();
        new Thread(my, "3�Ŵ���").start();
        new Thread(my, "4�Ŵ���").start();
    }
}

package demo1;

class LX3 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 3; i++) {
//        	try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
	
//	public void run() {
//        System.out.println("执行run方法");
//        try {
//            Thread.sleep(10000);
//            System.out.println("线程完成休眠");
//        } catch (Exception e) {
//            System.out.println("休眠被打断");
//            return;  //返回到程序的调用处
//        }
//        System.out.println("线程正常终止");
//    }
	
//	 public void run() {
//	        while (true) {
//	            System.out.println(Thread.currentThread().getName() + "在运行");
//	        }
//	    }
	
	 public void run() {
	        for(int i=0;i<5;++i){
	            System.out.println(Thread.currentThread().getName()+"运行"+i);
	        }
	    }
 
//    public static void main(String[] args) {
//    	LX3 he = new LX3();
//  //    new Thread(he,"A").start();
//  //    new Thread(he,"B").start();
//  //    new Thread(he).start();
//    	
//    	Thread demo = new Thread(he);
//        System.out.println("线程启动之前---》" + demo.isAlive());
//        demo.start();
//        System.out.println("线程启动之后---》" + demo.isAlive());
//        
//    }
   
    //线程的强制执行：
//    public static void main(String[] args) {
//    	LX3 he = new LX3();
//        Thread demo = new Thread(he,"线程");
//        demo.start();
//        for(int i=0;i<50;++i){
//            if(i>10){
//                try{
//                    demo.join();  //强制执行demo
//                }catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("main 线程执行-->"+i);
//        }
//    }
    
    //线程的休眠：
//    public static void main(String[] args) {
//    	LX3 he = new LX3();
//    	new Thread(he,"线程").start();
//	}
	
	//线程的中断：
//	public static void main(String[] args) {
//		LX3 he = new LX3();
//        Thread demo = new Thread(he, "线程");
//        demo.start();
//        try{
//            Thread.sleep(8000);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        demo.interrupt(); //8s后中断线程
//    }
	 
	 //在java程序中，只要前台有一个线程在运行，整个java程序进程不会小时，所以此时可以设置一个后台线程，这样即使java进程小时了，此后台线程依然能够继续运行。
//	 public static void main(String[] args) {
//		LX3 he = new LX3();
//        Thread demo = new Thread(he, "线程");
//        demo.setDaemon(true);
//        demo.start();
//    }
	 
	 public static void main(String[] args) {
	        Thread h1=new Thread(new LX3(),"A");
	        Thread h2=new Thread(new LX3(),"B");
	        Thread h3=new Thread(new LX3(),"C");
	        h1.setPriority(8);
	        h2.setPriority(2);
	        h3.setPriority(6);
	        h1.start();
	        h2.start();
	        h3.start();
	         
	    }
}

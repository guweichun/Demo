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
//        System.out.println("ִ��run����");
//        try {
//            Thread.sleep(10000);
//            System.out.println("�߳��������");
//        } catch (Exception e) {
//            System.out.println("���߱����");
//            return;  //���ص�����ĵ��ô�
//        }
//        System.out.println("�߳�������ֹ");
//    }
	
//	 public void run() {
//	        while (true) {
//	            System.out.println(Thread.currentThread().getName() + "������");
//	        }
//	    }
	
	 public void run() {
	        for(int i=0;i<5;++i){
	            System.out.println(Thread.currentThread().getName()+"����"+i);
	        }
	    }
 
//    public static void main(String[] args) {
//    	LX3 he = new LX3();
//  //    new Thread(he,"A").start();
//  //    new Thread(he,"B").start();
//  //    new Thread(he).start();
//    	
//    	Thread demo = new Thread(he);
//        System.out.println("�߳�����֮ǰ---��" + demo.isAlive());
//        demo.start();
//        System.out.println("�߳�����֮��---��" + demo.isAlive());
//        
//    }
   
    //�̵߳�ǿ��ִ�У�
//    public static void main(String[] args) {
//    	LX3 he = new LX3();
//        Thread demo = new Thread(he,"�߳�");
//        demo.start();
//        for(int i=0;i<50;++i){
//            if(i>10){
//                try{
//                    demo.join();  //ǿ��ִ��demo
//                }catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("main �߳�ִ��-->"+i);
//        }
//    }
    
    //�̵߳����ߣ�
//    public static void main(String[] args) {
//    	LX3 he = new LX3();
//    	new Thread(he,"�߳�").start();
//	}
	
	//�̵߳��жϣ�
//	public static void main(String[] args) {
//		LX3 he = new LX3();
//        Thread demo = new Thread(he, "�߳�");
//        demo.start();
//        try{
//            Thread.sleep(8000);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        demo.interrupt(); //8s���ж��߳�
//    }
	 
	 //��java�����У�ֻҪǰ̨��һ���߳������У�����java������̲���Сʱ�����Դ�ʱ��������һ����̨�̣߳�������ʹjava����Сʱ�ˣ��˺�̨�߳���Ȼ�ܹ��������С�
//	 public static void main(String[] args) {
//		LX3 he = new LX3();
//        Thread demo = new Thread(he, "�߳�");
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

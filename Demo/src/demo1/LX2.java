package demo1;

public class LX2 implements Runnable{
	
	private String name;
	
	public LX2(){
		
	}
	
	public LX2(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(name+"运行"+i);
		}
	}

	public static void main(String[] args) {
		LX2 h1 = new LX2("线程1");
		Thread demo1= new Thread(h1);
		LX2 h2 = new LX2("线程2");
		Thread demo2= new Thread(h2);
		LX2 h3 = new LX2("线程3");
		Thread demo3= new Thread(h3);
		LX2 h4 = new LX2("线程4");
		Thread demo4= new Thread(h4);
		demo1.start();
		demo2.start();
		demo3.start();
		demo4.start();
	}
}

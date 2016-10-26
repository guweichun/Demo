package demo1;

public class LX1 extends Thread{
	
	private String name;
	
	public LX1(){
		
	}
	
	public LX1(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name+"ÔËÐÐ"+i);
		}
	}
	
	public static void main(String[] args) {
		LX1 h1 = new LX1("A");
		LX1 h2 = new LX1("B");
		LX1 h3 = new LX1("C");
		LX1 h4 = new LX1("D");
	//	h1.run();
	//	h2.run();
		h1.start();
		h2.start();
		h3.start();
		h4.start();
	}
}

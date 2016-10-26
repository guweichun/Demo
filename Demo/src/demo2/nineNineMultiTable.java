package demo2;

public class nineNineMultiTable {

	public static void FUN(){
		for(int i=1,j=1;j<=9;i++){
			System.out.print(i+"*"+j+"="+i*j+" ");
			if(i==j){
				i=0;
				j++;
				System.out.println();
			}
		}
	}
	
	public static void chengDemo(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		chengDemo();
	}
}

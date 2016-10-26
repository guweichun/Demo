package demo1;

class hello extends Thread {
    public void run() {
        for (int i = 0; i < 7; i++) {
            if (count > 0) {
                System.out.println("count= " + count--);
            }
        }
    }
 
    public static void main(String[] args) {
        hello h1 = new hello();
        hello h2 = new hello();
        hello h3 = new hello();
        h1.start();
        h2.start();
        h3.start();
    }
 
    private int count = 5;
}

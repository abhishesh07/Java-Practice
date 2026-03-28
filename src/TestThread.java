class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("My thread 1 is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<40){
            System.out.println("My thread2 is running");
            System.out.println("i am sad");
            i++;
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}

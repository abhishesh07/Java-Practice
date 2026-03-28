class MyTable2 implements Runnable{
    public void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n +" * "+i+" = "+(n*i));
        }
    }
    int n;
    public MyTable2(int n) {
        this.n = n;
    }
    public void run(){
        printTable(n);
    }
}
public class TestThread2 {
    public static void main(String[] args) {
        MyTable2 table1 = new MyTable2(5);
        Thread t1=new Thread(table1);
        MyTable2 table2 = new MyTable2(9);
        Thread t2=new Thread(table2);
        t1.start();
        t2.start();

    }
}

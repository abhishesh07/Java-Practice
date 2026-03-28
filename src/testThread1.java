class MyTable{
    public void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n +" * "+i+" = "+n*i);
        }
    }
}
class Mythread3 extends Thread{
    MyTable t1=new MyTable();
    int n;

    public void setN(int n) {
        this.n = n;
    }

    public Mythread3(MyTable t1, int n) {
        this.t1 = t1;
        this.n = n;
    }
    public void run(){
        t1.printTable(n);
    }
}
public class testThread1 {
    public static void main(String[] args) {
        MyTable t2=new MyTable();
        Mythread3 t3=new Mythread3(t2,5);
        Mythread3 t4=new Mythread3(t2,8);
        t3.start();
        t4.start();
    }
}

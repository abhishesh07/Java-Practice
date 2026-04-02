package basicProgram;

import java.util.Scanner;

public class Fibonacci {
    //recursive method
    public static int fib1(int n){
        if(n<=1) return n;
        return fib1(n-1)+fib1(n-2);
    }
    //iterative method
    public static int fib2(int n){
        if(n<=1) return n;
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println(fib1(n));
        System.out.println(fib2(n));
    }
}

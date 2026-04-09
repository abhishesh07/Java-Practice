package basicProgram;

import java.util.Scanner;

public class RoundingOff {
    public static double roundOff(double num){
        long intNum=(long)num;
        if(num>=0)
            return ((long)((num*100)+0.5))/100.0;
        else
            return ((long)((num*100)-0.5))/100.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floating point number: ");
        double num=sc.nextDouble();
        //you can use this as well
        //System.out.println(Math.round(num*100.0)/100.0);
        System.out.println(roundOff(num));



    }
}

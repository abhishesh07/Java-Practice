package ClassesAndObject;
import java.util.*;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle[] rect=new Rectangle[3];
        getRectangle(rect);
        System.out.println("The rectangles are: ");
        printRectangle(rect);
    }
    public static void printRectangle(Rectangle rect[]){
        for(int i=0;i<rect.length;i++)
            System.out.println(
                    "Rectangle: "+(i+1)+
                            ": width: "+rect[i].getWidth() +
                            " , height: "+rect[i].getHeight());
    }
    public static void getRectangle(Rectangle rect[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<rect.length;i++){
            System.out.println("Do you want to enter the width and height?(y/n)");
            char ch=sc.next().charAt(0);
            if(ch=='y')
                rect[i]=new Rectangle(sc.nextDouble(),sc.nextDouble());
            else
                rect[i]=new Rectangle();
        }
    }
}

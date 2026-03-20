import java.util.*;
public class Letter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word =sc.nextLine();
        if(isCapital(word)||isSmall(word)||isSmall(word.substring(1)))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static  boolean isCapital(String word){
        for(char ch : word.toCharArray()){
            if(ch<'A'||ch>'Z')
                return false;
        }
        return true;
    }
    public static boolean isSmall(String word){
        for(char ch : word.toCharArray()){
            if(ch<'a'||ch>'z')
                return false;
        }
        return true;
    }
}

package basicProgram;

import java.util.Scanner;

public class Palindrome {

    //palindrome string
    public static void palindromeString(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(rev.equals(str))
            System.out.println(str+" is a Palindrome String");
        else
            System.out.println(str+" is not a Palindrome String");
    }

    //palindrome number
    public static void palindromeNumber(int num){
        int rev=0;
        int tmp=num;
        while(num>0){
            int digit=num%10;
            rev = rev *10 + digit;
            num=num/10;
        }
        if(tmp==rev)
            System.out.println(tmp+" is a Palindrome Number");
        else
            System.out.println(tmp+" is not a Palindrome Number");
    }

    //optimized program work for both string and number
    public static boolean isPalindrome(String str){
        int left =0, right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
//        palindromeString(str);
//        int n = sc.nextInt();
//        palindromeNumber(n);
        if(isPalindrome(str))
            System.out.println(str + "  is a Palindrome");


    }
}

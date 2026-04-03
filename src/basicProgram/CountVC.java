package basicProgram;

import java.util.Scanner;

public class CountVC {
    //count vowels and consonants
    public static void count(String str){
        int vowels =0,consonants=0;
        for(char ch:str.toLowerCase().toCharArray()){
            if(Character.isLetter(ch))
                if("aeiou".indexOf(ch)!=-1)
                    vowels++;
                else
                    consonants++;
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        count(str);
    }
}

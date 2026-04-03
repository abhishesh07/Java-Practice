package basicProgram;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void findDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        Set<Integer> dpc = new HashSet<>();
        for(int n:arr){
            if(!set.add(n)){
                dpc.add(n);
            }
        }
        System.out.println("Duplicate elements are : "+dpc );
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,1,2,8,9,2};
        findDuplicate(arr);
    }
}

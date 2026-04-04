package basicProgram;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        int[] arr3 =new int [arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        Arrays.sort(arr3);
        return arr3;
    }
        public static int[] merge(int[] a, int[] b) {
            int[] res = new int[a.length + b.length];
            int i = 0, j = 0, k = 0;

            while (i < a.length && j < b.length) {
                if (a[i] < b[j])
                    res[k++] = a[i++];
                else
                    res[k++] = b[j++];
            }

            while (i < a.length) res[k++] = a[i++];
            while (j < b.length) res[k++] = b[j++];

            return res;
        }

    public static void main(String[] args) {
        int[] arr1={2,4,6,8};
        int[] arr2={1,3,5,7};
        System.out.println(Arrays.toString(mergeTwoSortedArray(arr1,arr2)));
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}

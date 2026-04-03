package basicProgram;

public class Kadane {
    public static int maxSubArray(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
                //max=Math.max(sum,max);
            }
        }
        return max;
    }
    //optimised kadane's algorithm
    public static int maxSubArray2(int[] arr){
        int max=arr[0],sum=arr[0];
        for(int n:arr){
            sum=Math.max(sum+n,n);
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr= {-1,-2,3,50,-20,-2};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray2(arr));

    }
}

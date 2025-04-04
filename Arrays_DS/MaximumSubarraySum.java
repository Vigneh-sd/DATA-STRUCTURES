

public class MaximumSubarraySum{

    public static int solution(int arr[])
    {
        int sum=0;
        int maxlen=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
        sum+=arr[i];
        maxlen=Math.max(sum, maxlen);
        if(sum<0)
        {
            sum=0;
        }
       }
       return maxlen;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{-2,-3,4,-1,-2,1,5,-3};
        int ans=solution(arr);
        System.out.println(ans);
    }
}
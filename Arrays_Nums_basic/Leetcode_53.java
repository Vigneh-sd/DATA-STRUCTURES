public class MaximumSubarraySum{

    public static int solution(int arr[], int n)
    {
      int max=arr[0], res=arr[0];
      for(int i=1;i<arr.length;i++)
      {
        max = Math.max(max+arr[i], arr[i]);
        res = Math.max(max, res);
      }
      return res;

    }
    public static void main(String[] args) {
        int arr[] = new int []{1,-3};
        int n = 6;

        int ans = solution(arr,n);
        System.out.println(ans);
    }
}
public class LargestElement{

    public static int solution(int arr[],int n)
    {
       int max=arr[0];
       for(int i=1;i<n;i++)
       {
        if(max<arr[i])
        {
            max=arr[i];
        }
       }
       return max;
    }
    public static void main(String[] args) {
        int n=7;
        int arr[]=new int[]{3,7,4,6,0,39,6};
        int ans=solution(arr,n);
        System.out.println(ans);
    }
}
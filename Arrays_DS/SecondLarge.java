public class SecondLarge{

    public static int solution(int arr[],int n)
    {
       int max=arr[0];
       int sec=Integer.MIN_VALUE;
       for(int i=1;i<n;i++)
       {
        if(max<arr[i])
        {
            sec=max;
            max=arr[i];
        }
        else if(arr[i]>sec && arr[i]!=max)
        {
            sec=arr[i];
        }
       }
       return sec;
    }
    public static void main(String[] args) {
        int n=7;
        int arr[]=new int[]{3,7,4,6,0,39,6};
        int ans=solution(arr,n);
        System.out.println(ans);
    }
}
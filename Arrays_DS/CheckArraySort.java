public class CheckArraySort{

    public static boolean solution(int arr[])
    {
       for(int i=1;i<arr.length;i++)
       {
        if(arr[i]<arr[i-1])
        {
            return false;
        }
       }
       return true;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,7,14,26,30,399,46};
        boolean ans=solution(arr);
        System.out.println(ans);
    }
}
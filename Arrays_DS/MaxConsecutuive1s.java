
public class MaxConsecutuive1s{
    

    public static int movezero(int[] arr) {
     int c=0,pos=0;
     for(int i=0;i<arr.length-1;i++)
     {
        if(arr[i]==1)
        {
            c++;
            pos=Math.max(c,pos);
        }
        else
        {
            c=0;
        }
     }
    return pos;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        int ans = movezero(arr);
        System.out.println(ans);
    }
}
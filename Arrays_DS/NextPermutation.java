import java.util.Arrays;

public class NextPermutation {
    

    public static int[] nextperm(int[] arr) {
    int pos=-1;
    for(int i=arr.length-2;i>=0;i--)
    {
        if(arr[i]<arr[i+1])
        {
            pos=i;
            break;
        }
    }
    if(pos==-1)
    {
        reverse(arr,0,arr.length-1);
        return arr;
    }
    for(int i=arr.length-1;i>pos;i--)
    {
        if(arr[i]>arr[pos])
        {
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
            break;
        }
    }
    reverse(arr,pos+1,arr.length-1);

    return arr;
    }

    public static void reverse(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        int ans[] = nextperm(arr);
        System.out.println(Arrays.toString(ans));
    }
}
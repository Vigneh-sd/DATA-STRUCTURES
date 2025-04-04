import java.util.Arrays;

public class MoveZeroLast {
    

    public static int[] movezero(int[] arr) {
    int c=0;
    if(arr.length==0){
    return arr;}

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]!=0)
        {
            int temp = arr[c];
            arr[c]=arr[i];
            arr[i]=temp;
            c++;
        }
    }
    return arr;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0, 7, 2, 1};
        int ans[] = movezero(arr);
        System.out.println(Arrays.toString(ans));
    }
}

import java.util.Arrays;

public class LeftrRotateArrayOnce{


     public static int[] solution(int[] arr) {
        int left=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=left;

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2};
        int ans[] = solution(arr);

        System.out.println(Arrays.toString(ans));
    }
     
       
}


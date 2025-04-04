
import java.util.Arrays;

public class RemoveDupSortedArray{


     public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int c = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[c - 1]) {
                arr[c] = arr[i];
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2};
        int uniqueCount = removeDuplicates(arr);

        System.out.println("Unique Count: " + uniqueCount);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOfRange(arr, 0, uniqueCount)));
    }
     
       
}


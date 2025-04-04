import java.util.Arrays;

public class LeftRotateArrayDtimes {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 2, 1};
        int d = 3;
        leftRotate(arr, d);

        System.out.println(Arrays.toString(arr));
    }
}
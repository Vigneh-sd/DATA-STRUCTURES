public class MissingNum {
    public static int solution(int arr[], int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10}; 
        int ans = solution(arr, n);
        System.out.println(ans);
    }
}

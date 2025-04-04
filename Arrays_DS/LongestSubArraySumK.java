public class LongestSubArraySumK {
    public static int solution(int a[], int k) {
        int maxLen = 0, sum = 0;
        int i = 0, j = 0;

        while (j < a.length) {
            sum += a[j];

            while (sum > k && i <= j) {
                sum -= a[i];
                i++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            j++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 1, 1}; 
        int k = 3;
        int ans = solution(arr, k);
        System.out.println(ans);
    }
}

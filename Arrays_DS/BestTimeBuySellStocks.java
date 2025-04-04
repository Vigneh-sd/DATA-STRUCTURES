public class BestTimeBuySellStocks {
    public static int solution(int arr[]) {
        int minPrice = arr[0], maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);  
            minPrice = Math.min(minPrice, arr[i]);  
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int ans = solution(arr);
        System.out.println(ans); // Output: 5
    }
}

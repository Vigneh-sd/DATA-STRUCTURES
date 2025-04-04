public class PeakElement2DArrays {
    
    public static int solution(int a[][], int mid) {
        int max = Integer.MIN_VALUE;
        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i][mid] > max) {
                max = a[i][mid];
                pos = i;
            }
        }
        return pos;
    }


    public static int peakelement(int a[][]) {
        int low = 0;
        int m = a[0].length;
        int high = m - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = solution(a, mid); 

            int left = (mid - 1 >= 0) ? a[row][mid - 1] : Integer.MIN_VALUE;

            int right = (mid + 1 < m) ? a[row][mid + 1] : Integer.MIN_VALUE;

            if (a[row][mid] > left && a[row][mid] > right) {
                return a[row][mid];
            }

            else if (a[row][mid] < right) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int a[][] = {
            {4, 2, 5, 1, 4, 5},
            {2, 9, 3, 2, 3, 2},
            {1, 7, 6, 0, 1, 3},
            {3, 6, 2, 3, 7, 2}
        };

        int ans = peakelement(a);
        System.out.println(ans);   
    }
}

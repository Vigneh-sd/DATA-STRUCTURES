public class AppearOnce {
    public static int solution(int arr[]) {
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            x^=arr[i];
        }
        return x;
    }

    public static void main(String[] args) {
        int arr[] = {10,6,9,8,3,5,10,9,6,3,8}; 
        int ans = solution(arr );
        System.out.println(ans);
    }
}

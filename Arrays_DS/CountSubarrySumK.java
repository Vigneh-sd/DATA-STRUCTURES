import java.util.*;
public class CountSubarrySumK {

     public static int solution(int arr[],int k)
     {
         int n = arr.length;
        Map<Integer,Integer> mpp = new HashMap();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); 
        for (int i = 0; i < n; i++) {
        
            preSum += arr[i];

            int total = preSum - k;

            cnt += mpp.getOrDefault(total, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        
      return cnt;
     }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        int ans=solution(arr,k);
        System.out.println(ans);
        
    }
}

//brute force approach

// public class CountSubarrySumK {

//      public static int solution(int arr[],int k)
//      {
//         int cnt=0;
//         int sum;
//         for(int i=0;i<arr.length;i++)
//         {
//             sum=0;
//             for(int j=i;j<arr.length;j++)
//             {
//                 sum+=arr[j];
//                 if(sum==k)
//                 {
//                     cnt++;
//                 }
//             }
//         }

//       return cnt;
//      }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
//         int k=3;
//         int ans=solution(arr,k);
//         System.out.println(ans);
        
//     }
// }
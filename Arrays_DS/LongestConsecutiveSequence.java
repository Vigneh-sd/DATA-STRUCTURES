
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int solution(int arr[]) {
       
        int maxlen = 1;  
        HashSet <Integer> set = new HashSet<Integer>();
       for(int i=0;i<arr.length;i++)
       {
         set.add(arr[i]);
       }
       for(int num : set)
       {
        int it=num, cnt=0;
        if(!set.contains(it-1))
        {
            while(set.contains(it))
            {
                cnt++;
                it++;
            }
        }
        maxlen = Math.max(cnt, maxlen);

       }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = {100,101, 200, 1, 3, 2};
        System.out.println(solution(arr)); 
    }
}


// Brute force
// public class LongestConsecutiveSequence{
//     public static boolean search(int []arr, int x)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             if(x==arr[i]){
//             return true;
//             }          
//         }
//         return false;
//     }

//      public static int solution(int arr[])
//      {
//         int maxlen=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++)
//        {
//           int pos=arr[i];
//          int cnt=1;
//             while(search(arr, pos+1)==true)
//             {
//               cnt++;
//               pos=pos+1;
//             }
//             maxlen=Math.max(cnt, maxlen);  
//        }
//        return maxlen;
//      }
//     public static void main(String[] args) {
        
//     }
// }

// Better soln
// import java.util.Arrays;

// public class LongestConsecutiveSequence {

//     public static int solution(int arr[]) {
//         Arrays.sort(arr);
//         int cnt = 1, maxlen = 1;  
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i - 1] + 1 == arr[i]) {
//                 cnt++;
//             } else if (arr[i - 1] != arr[i]) {  
//                 cnt = 1;
//             }
//             maxlen = Math.max(cnt, maxlen);
//         }
//         return maxlen;
//     }

//     public static void main(String[] args) {
//         int arr[] = {100, 4, 200, 1, 3, 2};
//         System.out.println(solution(arr)); 
//     }
// }

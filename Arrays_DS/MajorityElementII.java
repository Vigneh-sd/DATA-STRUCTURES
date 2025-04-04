import java.util.*;


public class MajorityElementII {

    public static List<Integer> solution(int arr[]) {
         List<Integer> lst = new ArrayList<>();
         int cnt1=1,cnt2=1;
         int can1=0, can2=0;
         for(int i=0;i<arr.length;i++ )
         {
            if(can1==arr[i])
            {
                cnt1++;
            }
             else if(can2==arr[i])
            {
                cnt2++;
            }
            else if(cnt1==0 && arr[i]!=can2)
                {
                    can1=arr[i];
                    cnt1=1;
                } 

                  else if(cnt2==0 && arr[i]!=can1)
                {
                    can2=arr[i];
                    cnt2=1;
                }
                else
                {
                cnt1--;
                cnt2--;  
              
            }
         }
         lst.add(can1);
         lst.add(can2);
       return lst;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 2, 3, 1, 2};
        List<Integer> ans = solution(arr);
        System.out.println(ans);
    }
}

// better soln
// import java.util.*;

// public class MajorityElementII {

//     public static List<Integer> solution(int arr[]) {
//         List<Integer> lst = new ArrayList<>();
//         int ans = arr.length / 3;
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < arr.length; i++) {
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }

//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > ans) {
//                 lst.add(entry.getKey());
//             }
//         }
//         return lst;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 3, 2, 1, 2, 3, 1, 2};
//         List<Integer> ans = solution(arr);
//         System.out.println(ans);
//     }
// }

    public static void main(String[] args) {
        int arr[] = {1,3,2,1,2,3,1,2};
        List ans=solution(arr);
        System.out.println(ans);
        
    }
}


//brute force
// import java.util.*;
// public class MajorityElementII {

//      public static List<Integer> solution(int arr[])
//      {
//         List<Integer> lst=new ArrayList<Integer>();
//         int ans=(arr.length/3);
//         int cnt;
//         for(int i=0;i<arr.length;i++)
//         {
//             cnt=0;
//             if(!lst.contains(arr[i]) ){
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(arr[i]==arr[j])
//                {
//                 cnt++;
//                }
//             }
//             if(cnt>ans)
//             {
//                 lst.add(arr[i]);
//             }
//         }
//         }
//         return lst;
//      }
//     public static void main(String[] args) {
//         int arr[] = {1,3,2,1,2,3,1,2};
//         List ans=solution(arr);
//         System.out.println(ans);
        
//     }
// }
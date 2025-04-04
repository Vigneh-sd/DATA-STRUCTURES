
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum{
    public static int[] solution( int[] arr, int target){
        HashMap <Integer,Integer> map = new HashMap<>();

    for(int i=0;i<arr.length;i++)
    {
        int comp = target - arr[i];
        if(map.containsKey(comp))
        {
            return new int[]{map.get(comp),i};
        }
        map.put(arr[i], i);
    }
    return new int[] {};
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{7,6,4,3,2,8};
        int target = 15;
        int ans[] = solution(arr,target);
       System.out.println(Arrays.toString(ans));
        
    }

}
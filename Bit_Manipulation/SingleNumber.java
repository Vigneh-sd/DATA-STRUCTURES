
public class SingleNumber {
    public static void main (String[] args) {
        int nums[]= {1,2,3,2,1};
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
          ans^=nums[i];
        }
       
       System.out.println(ans);
    }
}
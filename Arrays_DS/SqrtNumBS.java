
public class SqrtNumBS {
    public static int solution(int num) {
        int low=1, high=num, ans=1;
        if(num==0 || num==1) return num;
    
        while(low<=high)
        {
            int mid=low+((high-low)/2);
            if(((long)mid*mid) <=num)
            {
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
          
        }
      return ans;
    }

    public static void main(String[] args) {
        int k=99;
        int ans = solution(k);
        System.out.println(ans);
    }
}

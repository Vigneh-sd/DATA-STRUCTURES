class LongestOnesLL {
    public int solution(int[] a, int k) {
       int l=0, r=0, max=0, zeros=0;
       while(r<a.length)
       {
         if(a[r]==0) zeros++;

         if(zeros>k)
         {
            if(a[l]==0) zeros--;
            l=l+1;
            
         }
         
         if(zeros<=k){
            max=Math.max(max,r-l+1);
         } 
         r++;
       }
       return max;
    }
}
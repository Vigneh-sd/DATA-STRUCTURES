class MaxPointCards{
    public int solution(int[] a, int k) {
       int max=0, sum=0;
       for(int i=0;i<k;i++)
       {
         sum+=a[i];
       }
       max=Math.max(sum,max);
       int l=k-1, j=a.length-1;
       while(k!=0)
       {
          sum-=a[l];
          sum+=a[j];
          max=Math.max(sum,max);
          j--;
          l--;
          k--;
       }
       return max;
    }
}
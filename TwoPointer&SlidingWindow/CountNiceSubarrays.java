class CountNiceSubarrays{
    public int Solution(int[] nums, int goal) {
        if(goal<0) return 0;
        int r=0, l=0, sum=0, max=0;
        while(r<nums.length)
        {
            sum+=nums[r]&1;
            while(sum>goal)
            {
                sum-=nums[l]&1;
                l++;
            }
           max=max+(r-l+1);
           r++;
        }
        return max-solve(nums,goal-1);
    }
     public int solve(int[] nums, int goal) {
        if(goal<0) return 0;
        int r=0, l=0, sum=0, max=0;
        while(r<nums.length)
        {
            sum+=nums[r]&1;
            while(sum>goal)
            {
                sum-=nums[l]&1;
                l++;
            }
           max=max+(r-l+1);
           r++;
        }
        return max;
    }
}
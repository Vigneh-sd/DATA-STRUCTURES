class BinarySubarraySum {
    public int solution(int[] nums, int goal) {
        if(goal<0) return 0;
        int r=0, l=0, sum=0, max=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>goal)
            {
                sum-=nums[l];
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
            sum+=nums[r];
            while(sum>goal)
            {
                sum-=nums[l];
                l++;
            }
           max=max+(r-l+1);
           r++;
        }
        return max;
    }
}
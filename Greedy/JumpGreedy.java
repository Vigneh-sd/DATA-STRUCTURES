class JumpGreedy {
    public boolean canJump(int[] nums) {
        int maxlen=0;
        for(int i=0;i<nums.length;i++)
        {
           if(i!=0 && i>maxlen)
           {
            return false;
           }
           if(maxlen>=nums.length-1) return true;
            maxlen=Math.max(maxlen, nums[i]+i);
        }
        return false;
    }
}
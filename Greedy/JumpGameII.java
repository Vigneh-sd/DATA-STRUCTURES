class JumpGameII {
    public int soln(int[] a) {
        int l=0,r=0,jump=0,far;

        while(r<a.length-1)
        {
            far=0;
            for(int i=l;i<=r;i++)
            {
                far=Math.max(far,i+a[i]);
            }
            l=r+1;
            r=far;
            jump++;
        }

        return jump;
    }
}
class TrappingRainWater {
    public int trap(int[] a) {
        int leftmax=0, rightmax=0, l=0, r=a.length-1, total=0;
        while(l<r)
        {
            if(a[l]<=a[r])
            {
                if(a[l]<leftmax)
                {
                    total+=leftmax-a[l];
                }
                else
                {
                    leftmax=a[l];
                }
                l=l+1;
            }
              else
            {
                if(a[r]<rightmax)
                {
                    total+=rightmax-a[r];
                }
                else
                {
                    rightmax=a[r];
                }
                r=r-1;
            }
        }
        return total;
    }
}
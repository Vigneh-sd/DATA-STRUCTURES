class LemonadeChange {
    public boolean soln(int[] bills) {
        int five=0, ten=0, twenty=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                five++;
            }
            else if(bills[i]==10)
            {
                ten++;
                if(five>=1)
                {
                    five--;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                twenty++;
                 if(ten>=1 && five>=1)
                {
                    five--;
                    ten--;
                }
                else if(five>=3)
                {
                    five-=3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
import java.util.*;
class FindCelebrity {
    public int solution(int[] []a) {
        int top=0, low=a.length-1;
        while(top<low)
        {
            if(a[top][low]==1)
            {
                top++;
            }
            else
            {
                low--;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if((i!=top) && (a[top][i]!=0 || a[i][top]!=1))
            return -1;
        }
        return top;
    }
}

import java.util.Arrays;

class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) ->  (a[1]-b[1]));
        int cnt=0, prevint=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(start>=prevint)
            {
                prevint=end;
            }
            else
            {
                cnt++;
            }
           
        }
        return cnt;
        
    }
}
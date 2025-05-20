import java.util.*;

class Pair{
    int r;
    int c;
    int time;

    Pair(int r, int c, int time)
    {
        this.r=r;
        this.c=c;
        this.time=time;
    }
}


class orangeRotting {
    public int orangesRotting(int[][] grid) {
        
        int n=grid.length;
        int m= grid[0].length;
        int vis[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int countfresh=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else
                {
                    vis[i][j]=0;
                }

                if(grid[i][j]==1) countfresh++;
            }
        }

        int tm=0;
        int cnt=0;
        int nrow[]={-1,0,1,0};
        int ncol[]={0,1,0,-1};
        while(!q.isEmpty())
        {
          int r=q.peek().r;
          int c=q.peek().c;
          int t=q.peek().time;
          q.poll();

          tm = Math.max(tm,t);
          for(int i=0;i<4;i++)
          {
            int row=r+nrow[i];
            int col=c+ncol[i];

            if(row<n && row>=0 && col<m && col>=0 && vis[row][col]==0 && grid[row][col]==1)
            {
                q.add(new Pair(row, col, t+1));
                vis[row][col]=2;
                cnt++;
            }
          }

        }
        if(cnt!= countfresh) return -1;
        return tm;
    }
}
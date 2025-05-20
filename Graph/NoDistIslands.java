import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class NoDistIslands{

    public static void dfs(int row, int col,List<String> temp,int grid[][],int vis[][], int row0, int col0)
    {
       vis[row][col]=1;
       temp.add(toString(row-row0,col-col0));
       int n= grid.length;
       int m= grid[0].length;
       int nrow[]={-1,0,1,0};
       int ncol[]={0,-1,0,1};

       for(int i=0;i<4;i++)
       {
         int r=row+nrow[i];
         int c=col+ncol[i];

         if(r>=0 && r<n && c>=0 && c<m && vis[r][c]==0 && grid[r][c]==1)
         {
            dfs(r, c, temp, grid, vis, row0, col0);
         }
       }

    }

    public static String toString(int r, int c)
    {
        return Integer.toString(r)+" "+ Integer.toString(c);
    }

    public static int distislands(int grid[][])
    {
        int n= grid.length;
        int m= grid[0].length;
        int vis[][] = new int[n][m];
       Set<List<String>> st = new HashSet<>();

       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
           if( grid[i][j]==1 && vis[i][j]==0 )
           {
             List<String> temp = new ArrayList<>();
             dfs(i,j,temp,grid,vis,i,j);
             st.add(temp);
           }
        }
       }
       return st.size();
    }

    
}
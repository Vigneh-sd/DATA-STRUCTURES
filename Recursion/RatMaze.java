import java.util.ArrayList;
import java.util.List;

public class RatMaze {
	
	public static void solve(int i, int j, int n, int maze[][], int vis[][], int di[], int dj[], String res, List<String> ans)
	{
		if(i==n-1 && j==n-1)
		{
		  ans.add(res);
		  return;
		}
		String dir="DLRU";
		for(int ind=0;ind<n;ind++)
		{
			int nexti=i+di[ind];
			int nextj=j+dj[ind];
			if(nexti>=0 && nextj>=0 && nexti<n && nextj<n && vis[nexti][nextj]==0 && maze[nexti][nextj]==1)
			{
				vis[nexti][nextj]=1;
				solve(nexti, nextj, n, maze, vis, di, dj, res+dir.charAt(ind), ans);
				vis[nexti][nextj]=0;
			}
		}
	}
	
	public static List<String> solution(int maze[][], int n)
	{
		int vis[][]= new int[n][n];
		int di[]= {1,0,0,-1};
		int dj[]= {0,-1,1,0};
		List<String> ans = new ArrayList<String>();
        solve(0,0,n,maze,vis,di,dj,"",ans);
        return ans;
	}

	public static void main(String[] args) {
		 int n=4;
		 int[][] maze = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
		 System.out.println(solution(maze,n));

	}

}

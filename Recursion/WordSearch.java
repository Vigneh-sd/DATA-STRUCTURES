class WordSearch {
    public static boolean solve(int i, int j, int ind, char[][] a, String word, int vis[][])
	{
		if(ind==word.length())
        {
            return true;
        }
        int n=a.length;
        int m=a[0].length;

        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] == 1 || a[i][j]!=word.charAt(ind))
        {
            return false;
        }

        int row[]={1,0,0,-1};
        int col[]={0,-1,1,0};
        vis[i][j] = 1;
        for(int d=0;d<4;d++)
        {
            int nexti=i+row[d];
            int nextj=j+col[d];
            if(solve(nexti,nextj,ind+1,a,word,vis)) return true;
        }
		vis[i][j] = 0;
        return false;
	}
	
    public boolean exist(char[][] a, String word) {
        int n=a.length;
        int m=a[0].length;
        int vis[][]= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(solve(i,j,0,a,word,vis)) return true;
            }
        }
        return false;
    }
}
import java.util.ArrayList;
import java.util.List;
public class NQueen {
    public List<List<String>> solveNQueens(int n) {
        char [][] board= new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList <List<String>>();
        int leftrow[] = new int[n];
        int lower[] = new int[2*n-1];
        int upper[] = new int[2*n-1];
        nqueenmethod(0,board,ans,leftrow,lower,upper);
        return ans;
    }
    public static void nqueenmethod(int col, char[][] board, List<List<String>> ans, int leftrow[], int lower[], int upper[] ){
        if(col==board.length)
        {
            ans.add(convert(board));
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            if(leftrow[i]==0 && upper[board.length-1 + col - i]==0 && lower[i+col]==0)
            {
                board[i][col]='Q';
                leftrow[i]=1;
                upper[board.length-1 + col - i]=1;
                lower[i+col]=1;
                nqueenmethod(col+1, board, ans, leftrow, lower, upper);
                board[i][col]='.';
                leftrow[i]=0;
                upper[board.length-1 + col - i]=0;
                lower[i+col]=0;
            }
        }
    }
    public static List<String> convert(char [][] board)
    {
        List<String> lst=new ArrayList();
        for(int i=0;i<board.length;i++)
        {
            String s = new String(board[i]);
            lst.add(s);
        }
        return lst;
    }
}

// brute force 
// import java.util.*;
// class TUF {
//     public static List < List < String >> solveNQueens(int n) {
//         char[][] board = new char[n][n];
//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++)
//                 board[i][j] = '.';
//         List < List < String >> res = new ArrayList < List < String >> ();
//         dfs(0, board, res);
//         return res;
//     }

//     static boolean validate(char[][] board, int row, int col) {
//         int duprow = row;
//         int dupcol = col;
//         while (row >= 0 && col >= 0) {
//             if (board[row][col] == 'Q') return false;
//             row--;
//             col--;
//         }

//         row = duprow;
//         col = dupcol;
//         while (col >= 0) {
//             if (board[row][col] == 'Q') return false;
//             col--;
//         }

//         row = duprow;
//         col = dupcol;
//         while (col >= 0 && row < board.length) {
//             if (board[row][col] == 'Q') return false;
//             col--;
//             row++;
//         }
//         return true;
//     }

//     static void dfs(int col, char[][] board, List < List < String >> res) {
//         if (col == board.length) {
//             res.add(construct(board));
//             return;
//         }

//         for (int row = 0; row < board.length; row++) {
//             if (validate(board, row, col)) {
//                 board[row][col] = 'Q';
//                 dfs(col + 1, board, res);
//                 board[row][col] = '.';
//             }
//         }
//     }



//     static List < String > construct(char[][] board) {
//         List < String > res = new LinkedList < String > ();
//         for (int i = 0; i < board.length; i++) {
//             String s = new String(board[i]);
//             res.add(s);
//         }
//         return res;
//     }
//     public static void main(String args[]) {
//         int N = 4;
//         List < List < String >> queen = solveNQueens(N);
//         int i = 1;
//         for (List < String > it: queen) {
//             System.out.println("Arrangement " + i);
//             for (String s: it) {
//                 System.out.println(s);
//             }
//             System.out.println();
//             i += 1;
//         }
        
//     }
// }
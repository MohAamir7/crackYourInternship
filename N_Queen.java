package arsh_dsa_sheet;

import java.util.ArrayList;
import java.util.List;

public class N_Queen {
	List<List<String>> ll = new ArrayList<>();
	 public List<List<String>> solveNQueens(int n) {
	        // List<String> list = new ArrayList<>();
	        char[][] board = new char[n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                board[i][j] = '.';
	            }
	        }
	        printBoard(board, n, 0);
	        return ll;
	    }
	 public void printBoard(char[][] board, int n, int row) {
	        if (n == 0) {
	            ll.add(construct(board));
	            return;
	        }

	        for (int col = 0; col < board.length; col++) {
	            if (isitsafe(board, row, col)) {
	                board[row][col] = 'Q';
	                printBoard(board, n - 1, row + 1);
	                board[row][col] = '.';

	            }
	        }
	    }
	 public List<String> construct(char[][] board) {
	        List<String> res = new ArrayList<>();
	        for (int i = 0; i < board.length; i++) {
	            res.add(new String(board[i]));
	        }
	        return res;
	    }
	 public boolean isitsafe(char[][] board, int row, int col) {
	        int n = board.length;
	        // check the row
	        for (int i = 0; i < n; i++) {
	            if (board[row][i] == 'Q')
	                return false;
	        }
	        // check the columns
	        for (int i = 0; i < n; i++) {
	            if (board[i][col] == 'Q')
	                return false;
	        }
	        int i = row;
	        int j = col;
	        while (i >= 0 && j < n) {
	            if (board[i][j] == 'Q')
	                return false;
	            i--;
	            j++;
	        }
	        i = row;
	        j = col;
	        while (i < n && j < n) {
	            if (board[i][j] == 'Q')
	                return false;
	            i++;
	            j++;
	        }
	        i = row;
	        j = col;
	        while (j >= 0 && i < n) {
	            if (board[i][j] == 'Q')
	                return false;
	            i++;
	            j--;
	        }

	        // north west:
	        i = row;
	        j = col;
	        while (i >= 0 && j >= 0) {
	            if (board[i][j] == 'Q')
	                return false;
	            i--;
	            j--;
	        }
	        return true;

	    }


}

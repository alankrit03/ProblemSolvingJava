package problemSolvingJava;

import java.util.ArrayList;
import java.util.List;

class Pos{
	int x, y;
	public Pos(int x,int y) {
		this.x = x;
		this.y = y;
	}
}


public class SudokuSolver {
	
	private void printBoard(char[][] board) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.printf("%c ",board[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char[][] board = {"53..7....".toCharArray(),
							"6..195...".toCharArray(),
							".98....6.".toCharArray(),
							"8...6...3".toCharArray(),
							"4..8.3..1".toCharArray(),
							"7...2...6".toCharArray(),
							".6....28.".toCharArray(),
							"...419..5".toCharArray(),
							"....8..79".toCharArray()};
		SudokuSolver obj = new SudokuSolver();
		obj.solveSudoku(board);
		obj.printBoard(board);

	}
	
	
    public void solveSudoku(char[][] board) {
        List<Pos> temp = new ArrayList<Pos>();
        int tempSize=0;
        for(int i=0;i<9;i++) {
        	for(int j=0;j<9;j++) {
        		if(board[i][j]=='.') {
        			temp.add(new Pos(i,j));
        			tempSize++;
        		}
        	}
        }
        System.out.println("here");
        dfs(board,temp,tempSize,0);
    }
    
    static boolean dfs(char[][] board, List<Pos> temp, int tempSize, int i) {
    	if(i==tempSize) {
    		return true;
    	}
    	System.out.println("Here");
    	Pos ob = temp.get(i);
    	for(int num=1;num<=9;num++) {
    		if(board[ob.x][ob.y]=='.' && canPlaceNumber(num,board,ob)) {
    			board[ob.x][ob.y] = Integer.toString(num).charAt(0);
    			if(dfs(board,temp,tempSize,i+1)) {
    				return true;
    			}
    			board[ob.x][ob.y] = '.';
    		}
    	}
    	return false;
    }
    
    static boolean canPlaceNumber(int num, char[][] board, Pos ob) {
    	char temp = Integer.toString(num).charAt(0);
    	for(int i=0;i<9;i++) {
    		if(board[i][ob.y]==temp)
    			return false;
    		if(board[ob.x][i]==temp)
    			return false;
    	}
    	
    	int row= 3*(ob.x/3);
    	int col = 3*(ob.y/3);
    	for(int i=row;i<row+3;i++) {
    		for(int j=col;j<col+3;j++) {
    			if(board[i][j]==temp)
    				return false;
    		}
    	}
    	return true;
    }

}

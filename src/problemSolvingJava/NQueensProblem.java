package problemSolvingJava;

import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public List<List<String>> solveNQueens(int n){
		
		
		List<List<String>> ans = new ArrayList<List<String>>();
		if(n==2 || n==3) {
			return ans;
		}
		int[] temp = new int[n];
		for(int i=0;i<n;i++) {
			temp[i] = -1;
		}
		
		
		dfs(ans,temp,0,n);
		return ans;
	}
	
	static void dfs(List<List<String>> ans, int[] temp, int row, int n) {
		if(row==n) {
			ans.add(createStringList(temp,n));
			return;
		}
		
		for(int col=0;col<n;col++) {
			if(canPlaceQueen(temp, row, col, n)) {
				temp[row] = col;
				dfs(ans,temp,row+1,n);
			}
		}
		temp[row] = -1;
	}
	
	static boolean canPlaceQueen(int[] temp,int x, int y,int n) {
		int left = y-1;
		int right = y+1;
		for(int i=x-1;i>=0;i--) {
			if(temp[i]==y) {
				return false;
			}
			if(left>=0 && temp[i]==left) {
				return false;
				
			}
			if(right<n && temp[i]==right) {
				return false;
			}
			left--;
			right++;
		}
		return true;
	}
	
	static List<String> createStringList(int[] temp,int n){
		List<String> t = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			String s = "";
			for(int j=0;j<n;j++) {
				if(temp[i]==j) {
					s += "Q";
				}
				else
					s += ".";
			}
			t.add(new String(s));
		}
		return t;
	}

}

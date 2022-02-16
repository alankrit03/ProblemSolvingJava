package problemSolvingJava;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
	
	static int[] drow = {1,0,0,-1};
	static int[] dcol = {0,-1,1,0};
	static String[] step = {"D","L","R","U"};

	public static void main(String[] args) {
		
	}
	
	public static ArrayList<String> findPath(int[][] m, int n) {
		ArrayList<String> ans = new ArrayList<String>();
		dfs(ans,"",m,0,0,n);
		return ans;
    }
	
	public static void dfs(List<String> ans, String temp, int[][] m, int x, int y, int n) {
		if(x==n-1 && y==n-1 && m[x][y]==1) {
			ans.add(temp);
			return;
		}
		if(x==n || y==n || x==-1 || y==-1 || m[x][y]==0)
			return;
		
		for(int i=0;i<4;i++) {
			m[x][y]=0;
			dfs(ans, temp+step[i], m, x+drow[i], y+dcol[i], n);
		}
		m[x][y] = 1;
	}
}

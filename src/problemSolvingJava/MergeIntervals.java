package problemSolvingJava;

import java.util.Arrays;
import java.util.ArrayList;

public class MergeIntervals {

	public static void main(String[] args) {
		MergeIntervals obj = new MergeIntervals();
		int[][] intervals = {{8,10},{1,3},{15,18},{2,6}};
		int[][] ans = obj.merge(intervals);
		displayGrid(ans);

	}
	
	public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a1,a2) -> (a1[0]-a2[0]));
        
        ArrayList<int[]> result =  new ArrayList<int[]>();
        int n = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];
        int newSize = 0;
        for(int i=1; i<n; i++) {
        	if (end>=intervals[i][0])
        		end = Math.max(end, intervals[i][1]);
        	else {
        		result.add(new int[]{start,end});
        		start = intervals[i][0];
        		end = intervals[i][1];
        		newSize++;
        	}
        }
        newSize++;
        result.add(new int[] {start,end});
        
        int[][] ans = new int[newSize][2];
        for(int i=0; i<newSize; i++) {
        	ans[i][0] = result.get(i)[0];
        	ans[i][1] = result.get(i)[1];
        }
        
        return ans;
    }
	
	private static void displayGrid(int[][] matrix) {
		for(int i=0;i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	private static void displayGrid(ArrayList<int[]> matrix) {
		for(int i=0;i<matrix.size(); i++) {
			for(int j=0; j<matrix.get(0).length; j++) {
				System.out.print(matrix.get(i)[j]+"\t");
			}
			System.out.println();
		}
	}
	
	

}

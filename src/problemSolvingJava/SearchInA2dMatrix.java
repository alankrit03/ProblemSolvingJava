package problemSolvingJava;

public class SearchInA2dMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean searchMatrix(int[][] matrix, int target) {
    	int row = matrix.length;
    	int column = matrix[0].length;
    	int elements = row*column;
    	int lo = 0,hi = elements;
    	int i,j;
    	while(hi-lo>1) {
    		int mid = lo + (hi-lo)/2;
    		i = mid/column;
    		j = mid%column;
    		if(matrix[i][j]>target) {
    			hi = mid;
    		}
    		else {
    			lo = mid;
    		}
    	}
    	i = lo/column;
    	j = lo%column;
    	if(matrix[i][j]==target) {
    		return true;
    	}
    	return false;
    }
}

package problemSolvingJava;

public class MColoringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String graphColoring(int[][] mat, int m) {
		return recurse(mat,new int[mat.length], 0, m) ? "YES" : "NO";
	}
    
    public static boolean recurse(int[][] matrix, int[] color, int i, int m) {
    	if(i==color.length) {
    		return true;
    	}
    	
    	for(int cl=1;cl<=m;cl++) {
    		if(canPutColor(matrix,color,i,cl)) {
    			color[i] = cl;
    			if(recurse(matrix,color,i+1,m))
    				return true;
    		}
    	}
    	color[i] = 0;
    	return false;
    }
    
    public static boolean canPutColor(int[][] matrix, int[] color, int i, int cl) {
    	for(int j=0;j<matrix.length;j++) {
    		if(matrix[i][j]==1) {
    			if(color[j] == cl)
    				return false;
    		}
    	}
    	return true;
    }

}

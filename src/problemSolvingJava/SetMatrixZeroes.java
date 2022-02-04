package problemSolvingJava;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		int matrix[][] = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
		setZeroes(matrix);

	}
	
	
	
	public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
//		boolean rowChange[] = new boolean[matrix.length];
        boolean columnChange = false;
        // displayGrid(matrix);
        // System.out.println();
        
        
//        Storing positions of zeroes;
        for(int i=0; i<row; i++) {
        	for(int j=0; j<column; j++) {
        		if (matrix[i][j]==0) {
        			if(j==0)
        				columnChange = true;
        			else {
        				matrix[i][0] = 0;
        				matrix[0][j] = 0;
        			}
        		}
        	}
        }
        
        // displayGrid(matrix);
//        Setting zeroes at required places
        for(int i=1; i<row; i++) {
        	for(int j=1; j<column; j++) {
        		if (matrix[i][0]==0 || matrix[0][j]==0) {
        			matrix[i][j]=0;
        		}
        	}
        }
        // System.out.println();
        // displayGrid(matrix);
        if(matrix[0][0]==0){
            for(int j=0; j<column; j++)
                matrix[0][j]=0;
        }
        if(columnChange){
            for(int i=0; i<row; i++)
                matrix[i][0]=0;
        }
    }
	
	private static void displayGrid(int[][] matrix) {
		for(int i=0;i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

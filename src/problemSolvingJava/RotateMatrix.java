package problemSolvingJava;

public class RotateMatrix {

	public static void main(String[] args) {
		RotateMatrix obj = new RotateMatrix();
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		obj.displayGrid(matrix);
		obj.rotate(matrix);
		System.out.println();
		obj.displayGrid(matrix);

	}
	
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int x,y;
        
        for(int sum=1; sum<2*(n-1); sum++) {
        	x = Math.min(n-1, sum);
        	y = sum-x;
        	while(x>y) {
        		swap(matrix, x, y, y, x);
        		x--;
        		y++;
        	}
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n/2; j++) {
        		swap(matrix, i, j, i, n-j-1);
        	}
        }
    }
    
    public void swap(int[][] matrix,int x1,int y1,int x2,int y2) {
    	int temp = matrix[x1][y1];
    	matrix[x1][y1] = matrix[x2][y2];
    	matrix[x2][y2] = temp;
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

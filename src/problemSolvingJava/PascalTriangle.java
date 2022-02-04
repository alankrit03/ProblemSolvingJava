package problemSolvingJava;
import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {
		PascalTriangle ob = new PascalTriangle();
		ob.generate(5);

	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascal = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		
		for(int i=0;i<numRows; i++) {
			for(int j=row.size()-1; j>0; j--) {
				row.set(j, row.get(j)+row.get(j-1));
			}
			row.add(1);
			pascal.add(new ArrayList<Integer>(row));
		}
		
        return pascal;
    }

}

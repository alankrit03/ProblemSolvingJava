package problemSolvingJava;
import java.util.ArrayList;

public class RepeatAndMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        boolean[] seen = new boolean[A.size()];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int item:A){
            if (seen[item-1]){
                ans.add(item);
            }
            else{
                seen[item-1] = true;
            }
        }
        for (int i=0; i<seen.length; i++){
            if(!seen[i]){
                ans.add(i+1);
                break;
            }
        }
        return ans;
    }
}
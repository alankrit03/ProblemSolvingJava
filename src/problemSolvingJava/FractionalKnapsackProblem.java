package problemSolvingJava;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class MyComparator implements Comparator<Item>{
	@Override
	public int compare(Item o1, Item o2) {
		double ratio1 = (double)o1.value / (double)o1.weight;
		double ratio2 = (double)o2.value / (double)o2.weight;
		if(ratio2>ratio1){
		    return 1;
		}
		return -1;
	}
}

public class FractionalKnapsackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    double fractionalKnapsack(int W, Item arr[], int n) {
    	MyComparator comp = new MyComparator();
        Arrays.sort(arr, comp);
        double ans = 0;
        for(Item curr:arr) {
        	if (W>=curr.weight) {
        		ans += curr.value;
        		W -= curr.weight;
        	}
        	else {
        		double temp = curr.value*((double)W/(double)curr.weight);
        		ans += temp;
        		break;
        	}
        }
        return ans;
    }

}



package problemSolvingJava;

import java.util.Arrays;

class Job{
	int id,profit,deadline;
	public Job(int id, int deadline, int profit){
		this.id = id;
		this.profit = profit;
		this.deadline = deadline;
	}
}

public class JobSequencingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int[] JobScheduling(Job arr[], int n) {
		Arrays.sort(arr, (ob1,ob2) -> (ob2.profit - ob1.profit));
		boolean[] jobsDone = new boolean[101];
		int count = 0, totalProfit=0;
		
		for(Job curr:arr) {
			int i=curr.deadline;
			while(i>0) {
				if(jobsDone[i]==false) {
					jobsDone[i]=true;
					count++;
					totalProfit += curr.profit;
					break;
				}
				i--;
			}
		}
		return new int[] {count,totalProfit};
	}

}

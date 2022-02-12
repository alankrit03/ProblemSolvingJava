package problemSolvingJava;

import java.util.Arrays;

public class FindMinimumCoins {

	public static void main(String[] args) {
	}
	
	public int minCoins(int coins[], int M, int V){
		int[] dp = new int[V+1];
		for(int i=1;i<=V;i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		Arrays.sort(coins);
		for(int i=0;i<M;i++) {
			int coin = coins[i];
			for(int j=coin;j<=V;j++) {
			    if(dp[j-coin]!=Integer.MAX_VALUE){
				    dp[j] = Math.min(dp[j], dp[j-coin]+1);
			    }
			}
		}
		if(dp[V]==Integer.MAX_VALUE)
		    return -1;
		return dp[V];
	}

}

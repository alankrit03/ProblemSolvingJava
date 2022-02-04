package problemSolvingJava;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Only one day buy and one day Sell allowed
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        int curMaxPrice = prices[n-1];
        
        for(int i=n-2;i>=0; i--) {
        	ans = Math.max(curMaxPrice-prices[i], ans);
        	curMaxPrice = Math.max(curMaxPrice, prices[i]);
        }
        
        return ans;
    }

}

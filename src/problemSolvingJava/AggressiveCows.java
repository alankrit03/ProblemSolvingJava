package problemSolvingJava;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int n,cows;
		while(t>0) {
			n = scan.nextInt();
			cows = scan.nextInt();
			int[] stalls = new int[n];
			for(int i=0;i<n;i++) {
				stalls[i] = scan.nextInt();
			}
			System.out.println(MaxMinimumDistance(stalls,n,cows));
		}
	}
	
	public static int MaxMinimumDistance(int[] stalls, int n, int cows) {
		Arrays.sort(stalls);
		int lo=stalls[n-1],hi=stalls[n-1]-stalls[0]+1,mid;
		for(int i=1;i<n;i++) {
			lo = Math.min(lo, stalls[i]-stalls[i-1]);
		}
//		hi is pointing to number which cannnot be the answer.
		while(hi-lo>1) {
			mid = (hi+lo)/2;
			if(isConfigPossible(stalls,n,cows,mid))
				lo = mid;
			else
				hi = mid;
		}
		return lo;
	}
	
	public static boolean isConfigPossible(int[] stalls, int n, int cows, int distance) {
		int prevCow = 0;
		cows--;
		for(int i=1;i<n;i++) {
			if(cows>(n-i))
				return false;
			if(stalls[i]-stalls[prevCow] >= distance) {
				prevCow = i;
				cows--;
			}
            if(cows==0)
                return true;
		}
        if(cows>0)
            return false;
		return true;
	}
}

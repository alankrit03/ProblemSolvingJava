package problemSolvingJava;

import java.util.Arrays;

public class MinimumNumberOfPlatformsRequiredForARailway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    static int findPlatform(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int station = 0;
        int ans = 0;
        int i=0,j=0;
        while(i<n) {
        	if(arr[i]<=dep[j]) {
        		station++;
        		ans = Math.max(station, ans);
        		i++;
        	}
        	else {
        		station--;
        		j++;
        	}
        }
        return ans;
    }

}

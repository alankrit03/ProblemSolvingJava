package hackerEarth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

class MaximizeTheSum {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            long[] array = new long[n];
            
//            Create a hahmap and add up the same values and store as values in 
//            hashmap with key correspondng to actual value
            HashMap<Long, Long> cache = new HashMap<Long, Long>();
            for(int i=0; i<n; i++){
                array[i] = scan.nextInt();
                if (array[i]>0){
                    cache.put(array[i],cache.getOrDefault(array[i],(long)0)+array[i]);
                }
            }
            long[] values = new long[n];
            int temp = 0;
            for(long item:cache.values()) {
            	values[temp++] = item;
            }
            Arrays.sort(values);
            long result = 0;
            for(int i=n-1; i>-1 && k>0; i--){
                if (values[i]<=0){
                    break;
                }
                result += values[i];
                k--;
            }

            System.out.println(result);
            t--;
        }
    }
}

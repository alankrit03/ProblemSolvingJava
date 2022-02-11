package problemSolvingJava;

import java.util.Arrays;

class Meeting{
	int start,end,pos;
	
	public Meeting(int start, int end, int pos) {
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
}


public class N_MeetingsInOneRoom {
	
	
	
	

	public static void main(String[] args) {
		int s[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924}, 
				f[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };
		maxMeetings(s,f,8);

	}
	
    public static int maxMeetings(int start[], int end[], int n){
        Meeting[] arr = new Meeting[n];
        for(int i=0;i<n;i++) {
        	arr[i] = new Meeting(start[i],end[i],i);
        }
        int ans = 0;
        int prevEnd = -1;
        Arrays.sort(arr, (ob1, ob2) -> (ob1.end-ob2.end));
        for(Meeting ob:arr) {
//        	System.out.println(ob.start+" "+ob.end+" "+ob.pos);
        	if(ob.start>prevEnd) {
        		ans++;
        		prevEnd = ob.end;
        	}
        }
        return ans;
    }

}

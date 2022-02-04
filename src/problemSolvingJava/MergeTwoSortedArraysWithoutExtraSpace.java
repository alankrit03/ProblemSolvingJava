package problemSolvingJava;

public class MergeTwoSortedArraysWithoutExtraSpace {

	public static void main(String[] args) {
		MergeTwoSortedArraysWithoutExtraSpace obj = new MergeTwoSortedArraysWithoutExtraSpace();
		
	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int idx = m-- +n-- -1;
		while (idx>=0 && m>=0 && n>=0) {
			if(nums1[m]>=nums2[n]) {
				nums1[idx] = nums1[m];
				m--;
			}
			else {
				nums1[idx] = nums2[n];
				n--;
			}
			idx--;
		}
		
		while(n>=0) {
			nums1[idx] = nums2[n];
			idx--;
			n--;
		}
    }

}

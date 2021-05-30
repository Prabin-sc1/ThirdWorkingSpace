import java.util.HashSet;
import java.util.Set;

/*
 * Given an array, find if there exists a subarray with sum equals to zero.
 * n< 10^5
 */
public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] p = {2,1,3,-4,2};
		boolean flag = false;
//		for(int i = 0; i < p.length; i++) {
//			int sum = 0;
//			for(int j = i; j < p.length; j++) {
//				sum += p[j];
//				if(sum == 0) {
//					flag = true;
//					break;
//				}
//				
//			}
//			if(flag) break;
//		}
//		System.out.println("Found "+flag);
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int data : p) {
			set.add(sum);
			sum += data;
			if(set.contains(sum)) {
				flag = true; break;
			}
		}
		System.out.println("Found "+flag);
	}
	

}


/**
 * 
 * @author Rishabh Katyal
 * Leet Code Problem Number 1: Two Sum Problem
 *
 */
import java.util.stream.IntStream;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		/* Java 6 Code
		 * int sum=0; int arr[]=new int[2]; for(int i=0;i<(nums.length-1);i++){ for(int
		 * j=i+1;j<nums.length;j++){ sum=nums[i]+nums[j]; if(target==sum){ arr[0]=i;
		 * arr[1]=j; } } } return arr; }
		 */
		int arr[] = new int[2];

		IntStream.range(0, nums.length - 1).forEach(i -> {
			IntStream.range(i + 1, nums.length).forEach(j -> {
				if ((nums[i] + nums[j]) == target) {
					arr[0] = i;
					arr[1] = j;

				}
			});
		});
		return arr;
	}

	public static void main(String[] args) {
	
		int a[] = { 5, 17, 8, 9, 11, 14 };
		int array[] = new int[2];
		array =new TwoSum().twoSum(a, 25);
		System.out.println("Array is: [" + array[0] + "," + array[1] + "]");
	}

}

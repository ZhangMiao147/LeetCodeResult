package RemoveDuplicatesFromSortedArray;
/**
 * 题目内容
 * 
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 * Example 1:

 * Given nums = [1,1,2],

 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

 * It doesn't matter what you leave beyond the returned length.
 * Example 2:

 * Given nums = [0,0,1,1,1,2,2,3,3,4],

 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

 * It doesn't matter what values are set beyond the returned length.
 * Clarification:

 * Confused why the returned value is an integer but your answer is an array?

 * Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

 * Internally you can think of this:

 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeDuplicates(nums);

 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 *    print(nums[i]);
 * }
 * 
 * @author zhangmiao
 * 
 * email:1006299425@qq.com
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//测试
		int[] test1 = new int[]{1,1,2};
		int[] test2 = new int[]{0,0,1,1,1,2,2,3,3,4};
		System.out.println("test removeDuplicates:"+removeDuplicates(test1)+","+showArray(test1));
		System.out.println("test removeDuplicates:"+removeDuplicates(test2)+","+showArray(test2));
		
	}
	
	public static int removeDuplicates(int[] nums){
		int start = 1;//标记数组取出重复数据的长度
		if (nums != null && nums.length>0) {
			int currentNum = nums[0]; //当前的数字
			for (int i = 0; i<nums.length;i++){
				//如果数组的数字不是当前的数字，则是下一个不同的数字
				if (nums[i] != currentNum){
					nums[start] = nums[i];//将不同的数字前移
					start++;
					currentNum = nums[i]; //更换当前的数字
				}
			}
		}
		return start;
	}
	/**
	 * 实现数组内容
	 * @param nums
	 * @return
	 */
	public static String showArray(int[] nums){
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i< nums.length; i++){
			buffer.append(nums[i]+"=>");
		}
		return buffer.toString();
	}

}

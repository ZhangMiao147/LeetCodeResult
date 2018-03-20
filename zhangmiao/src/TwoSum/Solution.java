package TwoSum;

/**
 * 题目内容
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 * You may assume that each input would have exactly one solution, and you may not use the same element twice.

 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,

 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
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
		// TODO Auto-generated method stub
		//测试
		int[] nums1 = {2,7,11,15};
		int target1 = 9;
		int[] result1 = twoSum(nums1,target1);
		System.out.println("result1 0:"+result1[0]+",1:"+result1[1]);
		
		int[] nums2 = {12,17,1,5,6,8};
		int target2 = 9;
		int[] result2 = twoSum(nums2,target2);
		System.out.println("result2 0:"+result2[0]+",1:"+result2[1]);
		
		int[] nums3 = {12,17,1,5,6,8};
		int target3 = 6;
		int[] result3 = twoSum(nums3,target3);
		System.out.println("result3 0:"+result3[0]+",1:"+result3[1]);
		
		
		int[] nums4 = {-1,-2,-3,-4,-5};
		int target4 = -8;
		int[] result4 = twoSum(nums4,target4);
		System.out.println("result4 0:"+result4[0]+",1:"+result4[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1,-1}; //存储结果的数组
        int length = nums.length; //数字的个数
        for (int i = 0; i< length;i++) {
        	result[0] = i;
        	for (int j = i+1; j < length;j++) {
        		//循环后面的数字，看是否有符合要求的数字
        		if (nums[i] + nums[j] == target) {
        			result[1] = j;
        			break;
        		}
        	}
        	//已经有答案了
        	if (result[1] != -1 && result[1] != length){
        		break;
        	}
        }
        return result;
    }

}

package ArrayPartitionI561;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * ��Ŀ����
 * 
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) 
 * which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

 * Example 1:
 * Input: [1,4,3,2]

 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * Note:
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
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
		//����
		int[] test1 = new int[]{1,4,3,2};
		System.out.println("test1 arrayPairSum:"+arrayPairSum(test1));
		int[] test2 = new int[]{0,0,0,0};
		System.out.println("test2 arrayPairSum:"+arrayPairSum(test2));

	}
	/**
	 * ����˼·���������ϣ�Ȼ����������Сֵ�ĺͣ�Ҫ��;����Ĵ󣬾���ÿ���������СֵҪ��
	 * ���Ծ��ǽ�����������У����ڵ�����������Сֵ���õ�����Сֵ֮�;������ġ�
	 * @param nums
	 * @return
	 */
	public static int arrayPairSum(int[] nums) {
        int result = 0;
        if (nums != null) {
        	//1.������
        	Arrays.sort(nums);
        	//����������������������
        	for (int i = 0; i<nums.length;i+=2){
        		result += nums[i];
        	}
        }
        return result;
    }
	
}

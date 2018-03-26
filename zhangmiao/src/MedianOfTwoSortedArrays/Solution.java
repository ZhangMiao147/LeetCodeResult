package MedianOfTwoSortedArrays;
/**
 * /**
 * 题目内容
 * 
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]

 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]

 * The median is (2 + 3)/2 = 2.5
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
		int[] nums11 = {1,3};
		int[] nums12 = {2};
		System.out.println("result 1 : "+findMedianSortedArrays(nums11,nums12));

		int[] nums21 = {1,2};
		int[] nums22 = {3,4};
		System.out.println("result 2 : "+findMedianSortedArrays(nums21,nums22));

		int[] nums31 = {1};
		int[] nums32 = null;
		System.out.println("result 3 : "+findMedianSortedArrays(nums31,nums32));

		int[] nums41 = {1};
		int[] nums42 = {1};
		System.out.println("result 4 : "+findMedianSortedArrays(nums41,nums42));

		
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int[] sort;
        if (nums1 == null && nums2 == null) {
        	return 0;
        }else if (nums1 == null) {
        	sort = nums2;
        } else if (nums2 == null) {
        	sort = nums1;
        } else {
        	int length1 = nums1.length;
        	int length2 = nums2.length;
        	
        	//对nums1与nums2进行排序，sort是排序后的结果
        	sort = new int[length1+length2];
        	int i = 0,j = 0;
        	int n =0;
        	for (; n < sort.length && i < length1 && j < length2; n++ ) {
        		if (nums1[i] < nums2[j]) {
        			sort[n] = nums1[i];
        			i++;
        		} else {
        			sort[n] = nums2[j];
        			j++;
        		}
        	}
        	
        	if (i < length1) {
        		for(; n < sort.length; n++ ) {
        			sort[n] = nums1[i];
        			i++;
        		}
        	}
        	
        	if (j < length2) {
        		for(; n < sort.length; n++ ) {
        			sort[n] = nums2[j];
        			j++;
        		}
        	}
        	
        }
        for (int i = 0; i< sort.length;i++) {
        	System.out.println("i:"+i+",sort[i]:"+sort[i]);
        }
        
        int sLength = sort.length;
        if (sLength == 1) {
        	//只有一个数字
        	result = sort[0];
        } else if (sLength %2 == 0) {
        	//排序后的结果是偶数
        	int first = sort[sLength/2-1];
        	int second = sort[sLength/2];
        	result = (double)(first+second)/2;
        } else {
        	//排序后的结果是奇数
        	result = sort[sLength/2];
        }
        
        return result;
    }

}

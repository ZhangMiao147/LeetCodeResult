package ReverseInteger;
/**
 *  题目内容
 * 
 * Given a 32-bit signed integer, reverse digits of an integer.

 * Example 1:

 * Input: 123
 * Output:  321
 * Example 2:

 * Input: -123
 * Output: -321
 * Example 3:

 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

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
		
		System.out.println("123 reverse:"+reverse(123));
		System.out.println("-123 reverse:"+reverse(-123));
		System.out.println("120 reverse:"+reverse(120));
		System.out.println("1534236469 reverse:"+reverse(1534236469));
		System.out.println("2147483647 reverse:"+reverse(2147483647));
		System.out.println("-2147483648 reverse:"+reverse(-2147483648));
	}
	
	public static int reverse(int x) {
		double result = 0.0; //存储翻转之后的答案
		Integer max = Integer.MAX_VALUE;
		Integer min = Integer.MIN_VALUE;
		int value = x;
		//获取数字上每个位的值
		int[] valueArray = new int[10]; //int的最大值是10位数
		for (int i = 0;i<10;i++) {
			valueArray[i] = value%10;
			value = value / 10;
		}
		//获取数字的位数
		int emptySize = 0;
		for(int i = 9;i>=0;i--){
			if (valueArray[i] == 0){
				emptySize ++;
			} else {
				break;
			}
		}
		int valueSize = 10-emptySize; //数值是几位数
	
		for (int i = 0; i < valueSize;i++){
			 result += valueArray[i]*Math.pow(10, valueSize-i-1);
		}
		//如果翻转之后的数组越界，则返回0
		if (result > max || result < min) {
			return 0;
		} else {
			return (int)result;
		}
	}

}

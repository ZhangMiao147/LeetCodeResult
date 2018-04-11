package ReverseInteger;
/**
 *  ��Ŀ����
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
		//����
		
		System.out.println("123 reverse:"+reverse(123));
		System.out.println("-123 reverse:"+reverse(-123));
		System.out.println("120 reverse:"+reverse(120));
		System.out.println("1534236469 reverse:"+reverse(1534236469));
		System.out.println("2147483647 reverse:"+reverse(2147483647));
		System.out.println("-2147483648 reverse:"+reverse(-2147483648));
	}
	
	public static int reverse(int x) {
		double result = 0.0; //�洢��ת֮��Ĵ�
		Integer max = Integer.MAX_VALUE;
		Integer min = Integer.MIN_VALUE;
		int value = x;
		//��ȡ������ÿ��λ��ֵ
		int[] valueArray = new int[10]; //int�����ֵ��10λ��
		for (int i = 0;i<10;i++) {
			valueArray[i] = value%10;
			value = value / 10;
		}
		//��ȡ���ֵ�λ��
		int emptySize = 0;
		for(int i = 9;i>=0;i--){
			if (valueArray[i] == 0){
				emptySize ++;
			} else {
				break;
			}
		}
		int valueSize = 10-emptySize; //��ֵ�Ǽ�λ��
	
		for (int i = 0; i < valueSize;i++){
			 result += valueArray[i]*Math.pow(10, valueSize-i-1);
		}
		//�����ת֮�������Խ�磬�򷵻�0
		if (result > max || result < min) {
			return 0;
		} else {
			return (int)result;
		}
	}

}

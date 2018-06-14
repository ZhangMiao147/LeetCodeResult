package NumberComplement;
/**
 * /**
 * ��Ŀ����
 * 
 * Given a positive integer, output its complement number. 
 * The complement strategy is to flip the bits of its binary representation.

 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer��s binary representation.
 * Example 1:
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), 
 * and its complement is 010. So you need to output 2.
 * Example 2:
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), 
 * and its complement is 0. So you need to output 0.
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
	
		System.out.println("findComplement(1) : "+findComplement(1));
		System.out.println("findComplement(5) : "+findComplement(5));
		System.out.println("findComplement(4) : "+findComplement(4));
		System.out.println("findComplement(8) : "+findComplement(8));
	}
	
	/**
	 * ����˼·��һ�������䲹����֮����2��n����-1,�����ȵõ�n��ֵ��Ȼ����2��n���ݼ�1���ټ�ȥ������ɵõ��䲹������
	 * @param num
	 * @return
	 */
	 public static int findComplement(int num) {
	     double s = Math.log((double)num)/Math.log((double)2);   
	     int i = (int)s + 1;
	     return (int)(Math.pow(2, i)-1 - num);
	   }
}

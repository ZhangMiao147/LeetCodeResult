package PalindromeNumber;

/**
 *  题目内容 : 判断字符是否是回文字符
 * 
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

 * Example 1:

 * Input: 121
 * Output: true
 * Example 2:

 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:

 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:

 * Coud you solve it without converting the integer to a string?
 * 
 * @author zhangmiao
 * 
 * email:1006299425@qq.com
 *
 *
 */

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试
		System.out.println("121 isPalindrome:"+isPalindrome(121));
		System.out.println("-121 isPalindrome:"+isPalindrome(-121));
		System.out.println("10 isPalindrome:"+isPalindrome(10));
		System.out.println("0 isPalindrome:"+isPalindrome(0));
		System.out.println("-0 isPalindrome:"+isPalindrome(-0));
		System.out.println(Integer.MAX_VALUE + " isPalindrome:"+isPalindrome(Integer.MAX_VALUE));
		System.out.println(Integer.MIN_VALUE + " isPalindrome:"+isPalindrome(Integer.MIN_VALUE));
	}
	
	public static boolean isPalindrome(int x) {
		boolean result = false;
		String a = x+"";
		StringBuffer buffer = new StringBuffer();
		char[] aCharArray = a.toCharArray();
		//反转数字字符
		for (int i = aCharArray.length-1; i>= 0; i--) {
			buffer.append(aCharArray[i]);
		}
		//如果正向字符与反转之后的字符相等，则说明是回文字符
		if (a.equals(buffer.toString())) {
			result = true;
		}
		return result;
        
    }

}

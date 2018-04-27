package StringToInteger;
/**
 * 
 * 题目内容
 * 
 * 取出字符中的数字，仅限非空字符的第一个字符串.
 * 
 * Implement atoi which converts a string to an integer.

 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

 * If no valid conversion could be performed, a zero value is returned.

 * Note:
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:[-2^31,2^31-1]. If the numerical value is out of the range of representable values, INT_MAX(2^31-1) orINT_MIN(-2^31) is returned.
 
 * Example 1:
 * Input: "42"
 * Output: 42
 * Example 2:

 * Input: "   -42"
 * Output: -42
 * Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.
 * Example 3:

 * Input: "4193 with words"
 * Output: 4193
 * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
 * Example 4:

 * Input: "words and 987"
 * Output: 0
 * Explanation: The first non-whitespace character is 'w', which is not a numerical 
             digit or a +/- sign. Therefore no valid conversion could be performed.
 * Example 5:
 * Input: "-91283472332"
 * Output: -2147483648
 * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (-2^31) is returned.
 * @author 123
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("42 myAtoi:"+myAtoi("42"));
		System.out.println("    -42 myAtoi:"+myAtoi("   -42"));
		System.out.println("4193 with words myAtoi:"+myAtoi("4193 with words"));
		System.out.println("words and 987 myAtoi:"+myAtoi("words and 987"));
		System.out.println("-91283472332 myAtoi:"+myAtoi("-91283472332"));
		System.out.println("- myAtoi:"+myAtoi("-"));
		System.out.println("+ myAtoi:"+myAtoi("+"));
		System.out.println("20000000000000000000 myAtoi:"+myAtoi("20000000000000000000"));
		System.out.println("  0000000000012345678 myAtoi:"+myAtoi("  0000000000012345678"));
		System.out.println("-000000000000001 myAtoi:"+myAtoi("-000000000000001"));
		System.out.println("000000000000001 myAtoi:"+myAtoi("000000000000001"));
		System.out.println("   +0 123 myAtoi:"+myAtoi("   +0 123"));
		System.out.println("  -0 451 myAtoi:"+myAtoi("  -0 451"));
		System.out.println("3.14159 myAtoi:"+myAtoi("3.14159"));
	
		
	}
	
	
	public static int myAtoi(String str){
		int result = 0;
		int start = 0;//第一个非空字符字符串的起始位置
		int end = 0;//第一个非空字符串的终止位置
		for (int i = 0; i<str.length(); i++){
			char c = str.charAt(i);
			if (c == ' ' && start==end){
				start++;
				end++;
			} else {
				if (c >= '0' && c <= '9'){
					end++;
				} else {
					if (end == start){
						if (c == '+' || c == '-'){
							end++;
						} else {
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		str = str.substring(start,end);
		System.out.println("start:"+start+",end:"+end+",str:"+str);
		if (str.length() > 0){
			char c = str.charAt(0);
			int index = 0;
			boolean isPositive = true; //是否是正数
			if (c == '+'){
				index  = 1;
				isPositive = true;
			}else if (c == '-'){
				index  = 1;
				isPositive = false;
			}
			//剔除数字前面的0
			for (int i = index;i<str.length();i++){
				if (str.charAt(i) == '0'){
					index++;
				}else {
					break;
				}
			}
			
			str = str.substring(index, str.length());
			if (!isPositive){
				str = '-'+str;
			}
			
			if (str.equals("+") || str.equals("-")){
				result = 0;
			} else {
				//整数的字符长度不超过11
				if (str.length() > 11){
					if (isPositive){
						result = Integer.MAX_VALUE;
					} else {
						result = Integer.MIN_VALUE;
					}
				} else {
					if (str != null && !str.equals("")){
					//将字符转为long型数字
					Long l = Long.parseLong(str);
					if (l > Integer.MAX_VALUE){
						//大于整数的最大值，返回整数最大值
						result = Integer.MAX_VALUE;
					} else if (l < Integer.MIN_VALUE){
						//小于整数最小值，返回整数最小值
						result = Integer.MIN_VALUE;
					}else {
						//返回数字
						result = l.intValue();
					}
					}
				}
			}
			
			
		}
		return result;
	}
	
	

}

package ReverseString;
/**
 *  ÌâÄ¿ÄÚÈÝ
 * 
 * Write a function that takes a string as input and returns the string reversed.

 * Example:
 * Given s = "hello", return "olleh".

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
		//²âÊÔ
		
		System.out.println("reverseString(hello):"+reverseString("hello"));
	}
	
	public static String reverseString(String s) {
        StringBuffer buffer = new StringBuffer();
        if (s != null){
        	for (int i = s.length()-1;i>=0;i--){
        		buffer.append(s.charAt(i));
        	}
        }
        return buffer.toString();
    }

}

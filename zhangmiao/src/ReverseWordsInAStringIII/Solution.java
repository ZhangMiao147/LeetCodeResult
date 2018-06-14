package ReverseWordsInAStringIII;
/**
 *  Ã‚ƒøƒ⁄»›
 * 
 * Given a string, you need to reverse the order of characters in each word 
 * within a sentence while still preserving whitespace and initial word order.

 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will 
 * not be any extra space in the string.

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
		//≤‚ ‘
		
		System.out.println("reverseWords(hello):"+reverseWords("Let's take LeetCode contest")+"....");
	}
	
	public static String reverseWords(String s) {
        StringBuffer buffer = new StringBuffer();
        if (s != null) {
        	String[] sArray = s.split(" ");
        	if (sArray != null) {
        		for (int i = 0; i<sArray.length;i++){
        			String string = sArray[i];
        			StringBuffer b = new StringBuffer(string);
        			buffer.append(b.reverse());
        			if (i != sArray.length-1){
        				buffer.append(" ");
        			}
        		}
        	}
        }
        
        return buffer.toString();
    }

}

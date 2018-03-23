package LongestSubstringWithoutRepeatingCharacters;
/**
 * 题目内容
 * 
 * Given a string, find the length of the longest substring without repeating characters.

 * Examples:

 * Given "abcabcbb", the answer is "abc", which the length is 3.

 * Given "bbbbb", the answer is "b", with the length of 1.

 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
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
		//test
		
		String s1 = "abcabcbb";
		System.out.println("s1 result:"+lengthOfLongestSubstring(s1));
		System.out.println("s1 result 2 :"+lengthOfLongestSubstring2(s1));

		
		String s2 = "bbbbb";
		System.out.println("s2 result:"+lengthOfLongestSubstring(s2));
		System.out.println("s2 result 2 :"+lengthOfLongestSubstring2(s2));
		
		String s3 = "pwwkew";
		System.out.println("s3 result:"+lengthOfLongestSubstring(s3));
		System.out.println("s3 result 2 :"+lengthOfLongestSubstring2(s3));
		
		String s4 = "vbjksdbvjkfsabjkfjkasjnvjjrigjuerijgijfirjfirjfrijfrijfrijri";
		System.out.println("s4 result:"+lengthOfLongestSubstring(s4));
		System.out.println("s4 result 2 :"+lengthOfLongestSubstring2(s4));
		
		String s5 = "v";
		System.out.println("s5 result:"+lengthOfLongestSubstring(s5));
		System.out.println("s5 result 2 :"+lengthOfLongestSubstring2(s5));
		
		String s6 = "au";
		System.out.println("s6 result:"+lengthOfLongestSubstring(s6));
		System.out.println("s6 result 2 :"+lengthOfLongestSubstring2(s6));
		
		String s7 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789aaacscscscssc\"";
		System.out.println("s7 result:"+lengthOfLongestSubstring(s7));
		System.out.println("s7 result 2 :"+lengthOfLongestSubstring2(s7));
		
		
	}
	
	//有双层循环，太耗时
	public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
        	return 0;
        }
        char[] charArray = s.toCharArray();
        int resultLength = 0;
        String result = "";;
       
        if (charArray != null) {
        	for (int i = 0; i < charArray.length; i++) {
        		StringBuffer buffer = new StringBuffer();
        		buffer.append(charArray[i]);
        		for (int j = i+1; j<charArray.length;j++) {
        			String a = buffer.toString();
        			if (a.contains(charArray[j]+"")) {
        				String b = s.substring(i,j);
        				if (b.length() > result.length()) {
        					result = b;
        				}
        				break;
        			} else {
        				buffer.append(charArray[j]);
        			}
        		}
        		if (buffer.length() > result.length()) {
                	result = buffer.toString();
                }
        	}
        }
        
        System.out.println("result:"+result);
        
        resultLength = result.length();
        return resultLength;
    }
	
	//一层循环，耗时少
	public static int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
        	return 0;
        }
        char[] charArray = s.toCharArray();
        String result = "";;
       
        if (charArray != null) {
        	StringBuffer buffer = new StringBuffer();
        	for (int i = 0; i < charArray.length; i++) {
        		String b = buffer.toString();
        		int bLength = buffer.length();
        		char c = charArray[i];
        		if (b.contains(c+"")) {
    				if (bLength > result.length()) {
    					result = b;
    				}
    				int index = b.indexOf(c);
    				buffer.delete(0, index+1);
    			}
        		buffer.append(c);
        		
        	}
        	if (buffer.length() > result.length()) {
            	result = buffer.toString();
            }
        }
        
        System.out.println("result:"+result);
        
        return result.length();
    }
	
	
}

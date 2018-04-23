package LongestCommonPrefix;
/**
 * 题目内容 寻找数组公共的前缀字符串
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.

 * If there is no common prefix, return an empty string "".

 * Example 1:

 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:

 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:

 * All given inputs are in lowercase letters a-z.
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
		String[] strs1 = new String[]{"dog","racecar","car"};
		String[] strs2 = new String[]{"flower","flow","flight"};
		String[] strs3 = new String[]{"ca","a"};
		String[] strs4 = new String[]{"a","a"};
		
		
		System.out.println("strs1 longestCommonPrefix:"+longestCommonPrefix(strs1));
		System.out.println("strs2 longestCommonPrefix:"+longestCommonPrefix(strs2));
		System.out.println("strs3 longestCommonPrefix:"+longestCommonPrefix(strs3));
		System.out.println("strs4 longestCommonPrefix:"+longestCommonPrefix(strs4));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String result = "";
		if (strs.length == 0) {
			return "";
		}
        if (strs.length == 1) {
        	return strs[0];
        }
        String lestString = strs[0];
      
        for (int n =1;n<strs.length;n++) {
        	String str = strs[n];
        	if (str.length() < lestString.length()) {
        		lestString = str;
        	}
        }
        int length = lestString.length();
        for (int i = length; i> 0;i--){
        	String sub = lestString.substring(0,i);
        	boolean isContains = true;
        	for (int n = 0; n<strs.length;n++){
    			String str = strs[n];
    			if (!str.startsWith(sub)) {
    				isContains = false;
    				break;
    			}
    		}
    		if (isContains){
    			if (sub.length() > result.length()) {
    				result = sub;
    			}
    		}
        } 
        
        return result;
    }

}

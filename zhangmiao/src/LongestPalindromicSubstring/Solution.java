package LongestPalindromicSubstring;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//寻找左右对称的字串（回环字串）
		System.out.println("babad longestPalindrome:"+longestPalindrome("babad"));
		System.out.println("cbbd longestPalindrome:"+longestPalindrome("cbbd"));
		System.out.println("a longestPalindrome:"+longestPalindrome("a"));
		System.out.println("aaaaa longestPalindrome:"+longestPalindrome("aaaaa"));
		System.out.println("abcda longestPalindrome:"+longestPalindrome("abcda"));
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
				" longestPalindrome:"+longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
	}
	
	//时间太长
	public static String longestPalindrome(String s){
		String result="";
		if (s != null && !s.isEmpty()){
			char[] charArray = s.toCharArray();
			result = charArray[0]+"";
			for (int i = 0; i< charArray.length;i++) {
				for (int j = charArray.length-1;j>=i;j--){
					
					if (charArray[j] == charArray[i]){
						String string = s.substring(i,j+1);
						boolean isFind = false;
						if(string.length() > 1) {
							char[] stringCharArray = string.toCharArray();
							int length = stringCharArray.length;
							boolean isEqual = true;
							for (int n = 0; n<= length/2;n++) {
								if (stringCharArray[n] != stringCharArray[length-n-1]){
									isEqual = false;
									break;
								}
							}
							if (isEqual) {
								if (length > result.length()) {
									result = string;
									isFind = true;
									break;
								}
							}
						}
						if(isFind){
							break;
						}
					}
				}
			}
		}
		return result;
	}
	
	
	//减少时长
	public static String longestPalindrome2(String s){
		String result="";
		if (s != null && !s.isEmpty()){
			char[] charArray = s.toCharArray();
			result = charArray[0]+"";
			
		}
		return result;
	}
	

}

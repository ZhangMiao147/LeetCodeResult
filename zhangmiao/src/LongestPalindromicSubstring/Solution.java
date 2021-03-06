package LongestPalindromicSubstring;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//寻找左右对称的字串（回环字串）
//		System.out.println("babad longestPalindrome:"+longestPalindrome("babad"));
//		System.out.println("cbbd longestPalindrome:"+longestPalindrome("cbbd"));
//		System.out.println("a longestPalindrome:"+longestPalindrome("a"));
//		System.out.println("aaaaa longestPalindrome:"+longestPalindrome("aaaaa"));
//		System.out.println("abcda longestPalindrome:"+longestPalindrome("abcda"));
//		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
//				" longestPalindrome:"+longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
//	
//		
//		
//		System.out.println("babad longestPalindrome:"+longestPalindrome2("babad"));
//		System.out.println("cbbd longestPalindrome:"+longestPalindrome2("cbbd"));
//		System.out.println("a longestPalindrome:"+longestPalindrome2("a"));
//		System.out.println("aaaaa longestPalindrome:"+longestPalindrome2("aaaaa"));
//		System.out.println("abcda longestPalindrome:"+longestPalindrome2("abcda"));
//		System.out.println("babadada longestPalindrome:"+longestPalindrome2("babadada"));
//		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
//				" longestPalindrome:"+longestPalindrome2("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

		
		

		System.out.println("babad longestPalindrome:"+longestPalindrome3("babad"));
		System.out.println("cbbd longestPalindrome:"+longestPalindrome3("cbbd"));
		System.out.println("a longestPalindrome:"+longestPalindrome3("a"));
		System.out.println("aaaaa longestPalindrome:"+longestPalindrome3("aaaaa"));
		System.out.println("abcda longestPalindrome:"+longestPalindrome3("abcda"));
		System.out.println("babadada longestPalindrome:"+longestPalindrome3("babadada"));
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
				" longestPalindrome:"+longestPalindrome3("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

		
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
	
	
	//减少时长(失败)
	public static String longestPalindrome2(String s){
		String result="";
		if (s != null && !s.isEmpty()){
			result = s.substring(0,1);
			int length = s.length();
			for (int i = 0; i< length-1;i++) {
				for (int j = length;j>i;j--) {
					//获取子字符串
					String sub = s.substring(i, j);
					char[] charArraySub = sub.toCharArray();
					StringBuffer subPalindrome = new StringBuffer();
					//反转子字符串
					for (int n = charArraySub.length-1; n>=0 ; n--){
						subPalindrome.append(charArraySub[n]);
					}
					//子字符串与反转子字符串相灯，则说明是反转字符
					if (sub.equals(subPalindrome.toString())){
						if (sub.length() > result.length()){
							result = sub;
							break;
						}
					}
				}
			}
			
		}
		return result;
	}
	
	
	//昨天查看答案之后的方法
	public static String longestPalindrome3(String s){
		String result="";
		if (s != null && !s.isEmpty()){
			result = s.substring(0,1);
			int length = s.length();
			for (int i = 0; i< length;i++) {
				//以i为中心点（回文字符是长度是单数），向两边扩展，如果两边的字符对应相同，则继续是回文字符
				int start = i;
				int end = i;
				int n = start;
				int m = end;
				String sub = "";
				while(n >= 0 && m < length){
					if (s.charAt(n) != s.charAt(m)){
						break;
					} else {
						n--;
						m++;
					}
				}
				sub = s.substring(n+1, m);
				if (result.length() < sub.length()){
					result = sub;
				}
				//以i与i+1为中心点（回文字符是长度是双数），向两边扩展，如果两边的字符对应相同，则继续是回文字符
				end = i+1;
				n = start;
				m = end;
				while(n >= 0 && m < length){
					if (s.charAt(n) != s.charAt(m)){
						break;
					} else {
						n--;
						m++;
					}
				}
				sub = s.substring(n+1, m);
				if (result.length() < sub.length()){
					result = sub;
				}
				
			}
			
		}
		return result;
	}
	

}

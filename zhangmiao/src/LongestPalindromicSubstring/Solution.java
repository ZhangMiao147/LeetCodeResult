package LongestPalindromicSubstring;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ѱ�����ҶԳƵ��ִ����ػ��ִ���
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
	
	//ʱ��̫��
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
	
	
	//����ʱ��(ʧ��)
	public static String longestPalindrome2(String s){
		String result="";
		if (s != null && !s.isEmpty()){
			result = s.substring(0,1);
			int length = s.length();
			for (int i = 0; i< length-1;i++) {
				for (int j = length;j>i;j--) {
					//��ȡ���ַ���
					String sub = s.substring(i, j);
					char[] charArraySub = sub.toCharArray();
					StringBuffer subPalindrome = new StringBuffer();
					//��ת���ַ���
					for (int n = charArraySub.length-1; n>=0 ; n--){
						subPalindrome.append(charArraySub[n]);
					}
					//���ַ����뷴ת���ַ�����ƣ���˵���Ƿ�ת�ַ�
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
	
	
	//����鿴��֮��ķ���
	public static String longestPalindrome3(String s){
		String result="";
		if (s != null && !s.isEmpty()){
			result = s.substring(0,1);
			int length = s.length();
			for (int i = 0; i< length;i++) {
				//��iΪ���ĵ㣨�����ַ��ǳ����ǵ���������������չ��������ߵ��ַ���Ӧ��ͬ��������ǻ����ַ�
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
				//��i��i+1Ϊ���ĵ㣨�����ַ��ǳ�����˫��������������չ��������ߵ��ַ���Ӧ��ͬ��������ǻ����ַ�
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

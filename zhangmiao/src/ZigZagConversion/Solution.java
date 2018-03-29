package ZigZagConversion;

/**
 * ��Ŀ����
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:

 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
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
		//����
//		System.out.println("(PAYPALISHIRING,3) result : " + convert("PAYPALISHIRING", 3));
//		System.out.println("(PAYPALISHIRINGA,3) result : " + convert("PAYPALISHIRINGA", 3));
//		
//		System.out.println("(P,3) result : " + convert("P", 3));
		System.out.println("(PAYPALISHIRINGA,5) result : " + convert("PAYPALISHIRINGA", 5));
//
		System.out.println("(ABC,2) result : " + convert("ABC", 2));
		System.out.println("(ABCD,3) result : " + convert("ABCD", 3));
		
		String text = "PAYPALISHIRINGA";
		
//		for (int i = 0; i<= text.length();i++) {
//			String sub = text.substring(0,i);
//			for (int j = 1; j <= sub.length(); j++) {
//				System.out.println("("+sub+","+j+") result : " + convert(sub, j));
//			}
//		}
		
	}
	
	public static String convert(String s,int numRows) {
		if (s == null || s.length() == 0 || numRows <= 1) {  
            return s;  
        }  
        StringBuilder res = new StringBuilder();  
         /*                                                                                  
         * a   e 
         * b d f 
         * c   g 
         * ��a��dΪһ��zig��size: һ��zig�Ĵ�С 
         */  
        int size = 2 * numRows - 2;  
        for (int i = 0; i < numRows; i++) {  
            // ���ѭ��i��ʾ�ڼ��У���0��ʼ��  
            // �ڲ����j��ʾ�ڼ���zig����0��ʼ��  
            for (int j = i; j < s.length(); j += size) {  
                res.append(s.charAt(j));  
                // zig�ĵ�һ�к����һ���м����  
                // ÿһ��zig������Ԫ����ͬһ�У��磺b��d��ͬһ��  
                // ͬһ���е�����Ԫ��֮��ľ����ǣ�size-2*i(sizeһ��zig�Ĵ�С��i��ǰ�ǵڼ��У���0��ʼ��  
                // ͬһ��zig�еĵ�һ��Ԫ����s�е�λ����j���ڶ���Ԫ����s�е�λ���ǣ�j+size-2*i  
                if (i > 0 && i < numRows - 1) {  
                    int mid = j + size - 2 * i;  //�м��ַ�������(d������)
                    if (mid < s.length()) {                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                        res.append(s.charAt(mid));  
                    }  
                }  
            }  
        }  
        return res.toString();  
	}

}

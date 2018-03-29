package ZigZagConversion;

/**
 * 题目内容
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
		//测试
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
         * 从a到d为一个zig，size: 一个zig的大小 
         */  
        int size = 2 * numRows - 2;  
        for (int i = 0; i < numRows; i++) {  
            // 外层循环i表示第几行（从0开始）  
            // 内层序号j表示第几个zig（从0开始）  
            for (int j = i; j < s.length(); j += size) {  
                res.append(s.charAt(j));  
                // zig的第一行和最后一行中间的行  
                // 每一个zig有两个元素在同一行，如：b和d在同一行  
                // 同一行中的两个元素之间的距离是：size-2*i(size一个zig的大小，i当前是第几行，从0开始）  
                // 同一个zig中的第一个元素在s中的位置是j，第二个元素在s中的位置是：j+size-2*i  
                if (i > 0 && i < numRows - 1) {  
                    int mid = j + size - 2 * i;  //中间字符的坐标(d的坐标)
                    if (mid < s.length()) {                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                        res.append(s.charAt(mid));  
                    }  
                }  
            }  
        }  
        return res.toString();  
	}

}

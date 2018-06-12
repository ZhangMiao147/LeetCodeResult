package FlippingAnImage;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目内容
 * 
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

 * Example 1:

 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2:

 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Notes:

 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 * Seen this question in a real interview before
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
		//测试
		int[][] test1 = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
		System.out.println("test1 flipAndInvertImage:");
		show(flipAndInvertImage(test1));
		int[][] test2 = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		System.out.println("test2 flipAndInvertImage:");
		show(flipAndInvertImage(test2));
	}
	
	public static int[][] flipAndInvertImage(int[][] A) {
		if (A == null){
			return null;
		}
        for (int i=0;i<A.length;i++){
        	for (int n =0 ,m = A[i].length-1;n <= m;n++,m--){
        		System.out.println("n:"+n+",m:"+m+",A[i][n]:"+A[i][n]+",A[i][m]:"+A[i][m]);
        		//反转
        		int t = A[i][n];
        		A[i][n] = A[i][m];
        		A[i][m] = t;
        		//取反
        		if (n != m) {
        		if (A[i][n] == 0){
        			A[i][n] = 1;
        		} else {
        			A[i][n] = 0;
        		}
        		}
        		if (A[i][m] == 0){
        			A[i][m] = 1;
        		} else {
        			A[i][m] = 0;
        		}
        	}
        }
        return A;
    }

	
	public static void show(int[][] A){
		StringBuffer out = new StringBuffer();
		for (int i=0;i<A.length;i++){
        	for (int n =0;n < A[i].length;n++){
        		out.append(A[i][n]+",");
        	}
        	out.append("\n");
        }
		System.out.print(out.toString());
	}
	
}

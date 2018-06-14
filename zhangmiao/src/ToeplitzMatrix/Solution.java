package ToeplitzMatrix;

/**
 * 题目内容
 * 
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 

 * Example 1:

 * Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 * Output: True
 * Explanation:
 * 1234
 * 5123
 * 9512

 * In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]", and in each diagonal all elements are the same, so the answer is True.
 * Example 2:

 * Input: matrix = [[1,2],[2,2]]
 * Output: False
 * Explanation:
 * The diagonal "[1, 2]" has different elements.
 * Note:

 * matrix will be a 2D array of integers.
 * matrix will have a number of rows and columns in range [1, 20].
 * matrix[i][j] will be integers in range [0, 99].
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
		int[][] nums1 = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		System.out.println("isToeplitzMatrix 1:"+isToeplitzMatrix(nums1));
		int[][] nums2 = new int[][]{{1,2},{2,2}};
		System.out.println("isToeplitzMatrix 2:"+isToeplitzMatrix(nums2));
	}
	
	public static boolean isToeplitzMatrix(int[][] matrix) {
		if (matrix != null){
			int l = matrix.length;
			int h = matrix[0].length;
			System.out.println("l:"+l+",h:"+h);
			//从中间到右上判断
			for (int i = 0; i<h;i++){
				int n = 0; 
				int m = i;
				int num = matrix[0][i];
				for (;n<l&&m<h;n++,m++){
					if (matrix[n][m] != num){
						return false;
					}
				}
			}
			//从中间到左下判断
			for (int i = 0; i<l;i++){
				int n = i; 
				int m = 0;
				int num = matrix[i][0];
				for (;n<l&&m<h;n++,m++){
					if (matrix[n][m] != num){
						return false;
					}
				}
			}
		}
		return true;
        
    }

}

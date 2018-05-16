package JewelsAndStones;

/**
 * 771.题目内容 得到石头中宝石的个数
 * 
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

 * Example 1:

 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:

 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:

 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
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
		System.out.println("numJewelsInStones(\"aA\",\"aAAbbbb\"):"+numJewelsInStones("aA","aAAbbbb"));
		System.out.println("numJewelsInStones(\"z\",\"ZZ\"):"+numJewelsInStones("z","ZZ"));
	}
	
	public static int numJewelsInStones(String J,String S){
		 int num = 0;
		 if (S == null || S.isEmpty()){
			 return 0;
		 }
		 if (J == null || J.isEmpty()){
			 return 0;
		 }
		 char[] charArray = S.toCharArray();
		 for (int i = 0; i< charArray.length;i++){
			 char a = charArray[i];
			 if (J.contains(a+"")){
				 num++;
			 }
		 }
		 
		 return num;
	}

}

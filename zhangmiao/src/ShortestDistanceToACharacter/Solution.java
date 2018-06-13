package ShortestDistanceToACharacter;
/**
 *  题目内容
 * 
 * Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

 * Example 1:

 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

 * Note:

 * S string length is in [1, 10000].
 * C is a single character, and guaranteed to be in string S.
 * All letters in S and C are lowercase.
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
//		String S = "loveleetcode";
//		char C = 'e';
//		System.out.println("shortestToChar:"+shortestToChar(S,C));
		String S1 = "aaba";
		char C1 = 'b';
		System.out.println("shortestToChar:"+shortestToChar(S1,C1));

	}
	
	public static int[] shortestToChar(String S, char C) {
		
		if (S != null){
            int[] result = new int[S.length()];
            String[] splits = S.split(C+"");
    
            for (int i = 0; i<S.length();i++){
            	//找到字符前面和后面的C字符的位置
            	int beforeIndex = S.lastIndexOf(C+"", i);
            	int afterIndex = S.indexOf(C+"", i);
            	int dis = 0;
            	System.out.println("i:"+i+",beforeIndex:"+beforeIndex+",afterIndex:"+afterIndex);
            	//前面没找到，就算后面的
            	if (beforeIndex < 0){
            		dis = afterIndex - i;
            	} else if(afterIndex < 0){
            		//后面没找到，算前面的
            		dis = i - beforeIndex;
            	}else {
            		//前后都有，算最小值
            		int beforeDis = i - beforeIndex;
            		int afterDis = afterIndex - i;
            		if (beforeDis <= afterDis){
            			dis = beforeDis;
            		} else {
            			dis = afterDis;
            		}
            	}
            	result[i] = dis;
            }
            for (int i = 0;i<result.length;i++){
            	System.out.println("i:"+i+"==="+result[i]);
            }
            return result;
        } else {
        	return null;
        }
    }

}

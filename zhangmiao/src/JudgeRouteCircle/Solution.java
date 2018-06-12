package JudgeRouteCircle;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 题目内容
 * 
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

 * Example 1:
 * Input: "UD"
 * Output: true
 * Example 2:
 * Input: "LL"
 * Output: false
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
		System.out.println("judgeCircle(UD):"+judgeCircle("UD"));
		System.out.println("judgeCircle(LL):"+judgeCircle("LL"));
		System.out.println("judgeCircle(RLUURDDDLU):"+judgeCircle("RLUURDDDLU"));
	}
	
	public static boolean judgeCircle(String moves) {
		//解题思路：如果向左的个数与向右的个数相同，向上与向下的个数相同，则判断是回环。
        boolean result = true;
        if (moves != null){
        	int uCount=0,dCount=0,lCount=0,rCount=0;
        	int i = 0;
        	for (; i< moves.length();i++){
        		char c = moves.charAt(i);
        		if (c == 'U'){
        			uCount++;
        		}
        		if (c == 'D'){
        			dCount++;
        		}
        		if (c == 'L'){
        			lCount++;
        		}
        		if (c=='R'){
        			rCount++;
        		}
       
        	}
        	if (uCount == dCount && lCount == rCount){
        		result = true;
        	} else {
        		result = false;
        	}
      
        }
        return result;
    }
	
}

package BaseballGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * 题目内容
 * 
 * You're now a baseball game point recorder.

 * Given a list of strings, each string can be one of the 4 following types:

 * Integer (one round's score): Directly represents the number of points you get in this round. 如果是数值，则直接是本次的数值得分。
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.  +表示这次是前面最近两次数值之和。
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points. D表示这次是前面最近一次数值的2倍。
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed. C表示前面最近一次的得分取消。
 * Each round's operation is permanent and could have an impact on the round before and the round after.

 * You need to return the sum of the points you could get in all the rounds.

 * Example 1:
 * Input: ["5","2","C","D","+"]
 * Output: 30
 * Explanation: 
 * Round 1: You could get 5 points. The sum is: 5.
 * Round 2: You could get 2 points. The sum is: 7.
 * Operation 1: The round 2's data was invalid. The sum is: 5.  
 * Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
 * Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
 * Example 2:
 * Input: ["5","-2","4","C","D","9","+","+"]
 * Output: 27
 * Explanation: 
 * Round 1: You could get 5 points. The sum is: 5.
 * Round 2: You could get -2 points. The sum is: 3.
 * Round 3: You could get 4 points. The sum is: 7.
 * Operation 1: The round 3's data is invalid. The sum is: 3.  
 * Round 4: You could get -4 points (the round 3's data has been removed). The sum is: -1.
 * Round 5: You could get 9 points. The sum is: 8.
 * Round 6: You could get -4 + 9 = 5 points. The sum is 13.
 * Round 7: You could get 9 + 5 = 14 points. The sum is 27.
 * Note:
 * The size of the input list will be between 1 and 1000.
 * Every integer represented in the list will be between -30000 and 30000.
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
		String[] test1 = new String[]{"5","2","C","D","+"};
		System.out.println("test1 calPoints:"+calPoints(test1));
		String[] test2 = new String[]{"5","-2","4","C","D","9","+","+"};
		System.out.println("test2 calPoints:"+calPoints(test2));
		String[] test3 = new String[]{"-60","D","-36","30","13","C","C","-33","53","79"};
		System.out.println("test3 calPoints:"+calPoints(test3));
		String[] test4 = new String[]{"11482","C","-16664","-8297","+","D","19136","D","-10145","D","21701","+","20987","C","D","C","-17917","17151","273","C","19619","18087","D","-2040","-28447","-16785","-29805","C","C","D","-534","5898","-19769","13074","-17065","22139","28093","D","+","-22768","9116","C","C","-2035","D","25271","-8145","16575","+","-17996"};
		System.out.println("test4 calPoints:"+calPoints(test4));//126305
	}

    public static int calPoints(String[] ops) {
        int result = 0;
        if (ops != null) {
        	int[] nums = new int[ops.length];
  
        	for (int i = 0 ; i<ops.length;i++){
        		String s = ops[i];
        		if (s.equals("+")){
        			//如果是+号，当前得分为前面最近两个有效数字（非0数值）之和
        			int oneNum = 0;
        			int twoNum = 0;
        			for (int n = i-1;n>=0;n--){
        				if (nums[n] != 0) {
        					if (oneNum == 0){
        						oneNum = nums[n];
        					} else if (twoNum == 0){
        						twoNum = nums[n];
        					} else {
        						break;
        					}
        				}
        			}
        			nums[i] = oneNum+twoNum;
        		} else if (s.equals("C")){
        			//如果是C，则清除前面最近的有效数字（非0数值）
        			int m = 0;
        			for (int n = i-1;n>=0;n--){
        				if (nums[n] != 0) {
        					m = n;
        					break;
        				}
        			}
        			if (m >= 0){
        				nums[i] = 0;
        				nums[m] = 0;
        			}
        		} else if (s.equals("D")){
        			//如果是D，则当前得分是前面最近的有效数字（非0数值）的2倍
        			if (i-1 >= 0){
        				int m = 0;
            			for (int n = i-1;n>=0;n--){
            				if (nums[n] != 0) {
            					m = n;
            					break;
            				}
            			}
            			if (m >= 0){
            				nums[i] = nums[m]*2;
            			}        
        			}
        		} else {
        			//如果是数值，则当前得分就是数值
        			nums[i] = Integer.parseInt(s);
        		}
        	}
        	for (int i = 0; i<nums.length;i++){
        		System.out.println("i:"+i+",nums:"+nums[i]);
        		result += nums[i];
        	}
        	
        }
        return result;
    }
	
}





















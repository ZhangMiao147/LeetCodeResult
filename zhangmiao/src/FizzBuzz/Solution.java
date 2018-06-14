package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ŀ����
 * 
 * Write a program that outputs the string representation of numbers from 1 to n.

 * But for multiples of three it should output ��Fizz�� instead of the number and for the multiples of five output ��Buzz��. For numbers which are multiples of both three and five output ��FizzBuzz��.

 * Example:

 * n = 15,

 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
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
		//����
		System.out.println("test1 fizzBuzz(15):"+fizzBuzz(15));
	}
	
	public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList();
        if (n>0){
        	for (int i = 1;i<=n;i++){
        		if (i % 3 == 0 && i % 5 == 0){
        			result.add("FizzBuzz");
        		} else if (i % 3 == 0){
        			result.add("Fizz");
        		} else if (i % 5 == 0) {
        			result.add("Buzz");
        		} else {
        			result.add(i + "");
        		}
        	}
        }
        return result;
    }
	
}

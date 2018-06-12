package UniqueMorseCodeWords;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目内容
 * 
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

 * For convenience, the full table for the 26 letters of the English alphabet is given below:

 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

 * Return the number of different transformations among all words we have.

 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation: 
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."

 * There are 2 different transformations, "--...-." and "--...--.".
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
		String[] test1 = new String[]{"gin", "zen", "gig", "msg"};
		System.out.println("test1 uniqueMorseRepresentations:"+uniqueMorseRepresentations(test1));
	}
	
	 public static int uniqueMorseRepresentations(String[] words) {
       String[] code = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       List<String> wordCodes = new ArrayList<String>();

       if (words != null){
    	   for(int i = 0; i<words.length;i++){
    		   String s = words[i];
    		   char[] sChar = s.toCharArray();
    		   StringBuffer sCode = new StringBuffer();
    		   //得到每个字符串的编码
    		   for (int j = 0; j<sChar.length;j++){
    			   char c = sChar[j];
    			   sCode.append(code[c-'a']);
    		   }
    		   //如果答案没有这个编码则添加
    		   if (!wordCodes.contains(sCode.toString())){
    			   wordCodes.add(sCode.toString());
    		   }
    	   }
       }
       
       
       return wordCodes.size();
    }

}

package AddTwoNumbers;


/**
 * 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 * Example

 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
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
		ListNode l1 = new ListNode(2);
		ListNode l11 = new ListNode(4);
		l1.next = l11;
		ListNode l12 = new ListNode(3);
		l11.next = l12;


		ListNode l2 = new ListNode(5);
		ListNode l21 = new ListNode(6);
		l2.next = l21;
		ListNode l22 = new ListNode(4);
		l21.next = l22;
//		ListNode l23 = new ListNode(9);
//		l22.next = l23;
		
		
		ListNode resultNode = addTwoNumbers(l1,l2);
		StringBuffer resultString = new StringBuffer(resultNode.val+"->");
		ListNode nextNode= resultNode.next;
		while(nextNode != null) {
			resultString.append(nextNode.val+"->");
			nextNode = nextNode.next;
		}
		System.out.println("result:"+resultString.toString());
	}
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int val = l1.val + l2.val;
        ListNode resultNode = new ListNode(val%10);
        ListNode nextNode = new ListNode(val/10); //下一位数字
        resultNode.next = nextNode;
        ListNode preNode = resultNode; //最后一个数字之前的数字
      
        //将相同长度的数据进行相加
        while(l1.next != null && l2.next != null) {
        	l1 = l1.next;
        	l2 = l2.next;
        	int v = l1.val + l2.val + nextNode.val;
        	nextNode.val = v%10;
        	ListNode node = new ListNode(v/10);
        	nextNode.next = node;
        	preNode = nextNode;
        	nextNode = node;
        }
        
        ListNode surplusNode = null;
        if (l1.next != null) {
        	surplusNode = l1;
        }
        
        if (l2.next != null) {
        	surplusNode = l2;
        }
        
        //将l1或者l2剩余的数字添加
        if (surplusNode != null) {
        	while (surplusNode.next != null) {
        		surplusNode = surplusNode.next;
        		int v = surplusNode.val+ nextNode.val;
        		nextNode.val = v%10;
        		ListNode node = new ListNode(v/10);
        		nextNode.next = node;
        		preNode = nextNode;
        		nextNode = node;
        	}
        }
   
        //如果最后一个数字为0，则删除
        if (nextNode.val == 0) {
        	preNode.next = null;
        }
        return resultNode;
    }
}

package MergeTwoSortedLists;
/**
 * 题目内容：将两个有序链表组合成一个有序链表
 * 
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

 * Example:

 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
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
		
		// 测试
		ListNode node11 = new ListNode(1);
//		ListNode node12 = new ListNode(2);
//		ListNode node13 = new ListNode(4);
//		node11.next = node12;
//		node12.next = node13;
		
		ListNode node21 = new ListNode(2);
//		ListNode node22 = new ListNode(3);
//		ListNode node23 = new ListNode(4);
//		node21.next = node22;
//		node22.next = node23;
		System.out.println("node11:"+showListNode(node11));
		System.out.println("node21:"+showListNode(node21));
		ListNode result = mergeTwoLists(node11,node21);
		System.out.println("result:"+showListNode(result));
		
			
	}

	public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
       
        ListNode lastNode = result;
        result.next = lastNode;
        if (l1 == null && l2== null){
        	return null;
        } else {
        	while(l1 != null && l2!= null) {
        		if (l1.val < l2.val){
        			ListNode node = new ListNode(l1.val);
        			lastNode.next = node;
        			lastNode = node;
        			l1 = l1.next;
        		} else {
        			ListNode node = new ListNode(l2.val);
        			lastNode.next = node;
        			lastNode = node;
        			l2 = l2.next;
        		}
        	}
        	ListNode node = null;
        	
        	if (l1 != null) {
        		node = l1;
        	}
        	if (l2 != null) {
        		node = l2;
        	}
        	lastNode.next = node;
        }
        return result.next;
    }	
	
	/**
	 * 显示链表内容
	 * @param node
	 * @return
	 */
	public static String showListNode(ListNode node) {
		StringBuffer buffer = new StringBuffer();
		while (node != null) {
			buffer.append(node.val+"=>");
			node = node.next;
		}
		return buffer.toString();
	}
	
}

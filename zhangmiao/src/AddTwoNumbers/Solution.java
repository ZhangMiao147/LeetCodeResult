package AddTwoNumbers;

public class Solution {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//≤‚ ‘
		}
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int val = l1.val + l2.val;
        ListNode resultNode = new ListNode(val%10);
        ListNode nextNode = new ListNode(val/10);
        resultNode.next = nextNode;
        while(l1.next != null && l2.next != null) {
        	l1 = l1.next;
        	l2 = l2.next;
        	int v = l1.val + l2.val + nextNode.val;
        	nextNode.val = v%10;
        	ListNode node = new ListNode(v/10);
        	nextNode.next = node;
        	nextNode = node;
        }
        
        if (l1.next != null) {
        	l1 = l1.next;
        	int v = l1.val+ nextNode.val;
        	nextNode.val = v%10;
        	ListNode node = new ListNode(v/10);
        	nextNode.next = node;
        	nextNode = node;
        }
        
        if (l2.next != null) {
        	l2 = l2.next;
        	int v = l2.val+ nextNode.val;
        	nextNode.val = v%10;
        	ListNode node = new ListNode(v/10);
        	nextNode.next = node;
        	nextNode = node;
        }
        return resultNode;
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) 
            return head;

        ListNode  dummyNode = new ListNode(), prevNode = dummyNode ,currNode = head;

        while(currNode != null && currNode.next != null){

            prevNode.next = currNode.next;
            currNode.next =  prevNode.next.next;
            prevNode.next.next = currNode;

            prevNode = currNode;
            currNode = currNode.next;            

        }

        return dummyNode.next;
        
    }
}

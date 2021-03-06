package main.com.kv.leetcode.medium;

import main.com.kv.leetcode.ListNode;

public class MergeTwoSortedLists21 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        ListNode res = mergeTwoLists(node1, node2);
        System.out.println(res);
    }


    /**
     *
     * @param l1
     * @param l2
     * @return return merge sorted list
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p=head;
        ListNode p1=l1;
        ListNode p2=l2;
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            }else{
                p.next = p2;
                p2 = p2.next;
            }
            p=p.next;
        }

        if(p1!=null){
            p.next = p1;
        }

        if(p2!=null){
            p.next = p2;
        }
        return head.next;
    }
}

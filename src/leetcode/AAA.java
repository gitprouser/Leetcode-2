package leetcode;

import java.util.*;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : AAA
 * Creator : Edward
 * Date : Aug, 2017
 * Description : TODO
 */
public class AAA {

    private static ListNode findMiddle (ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        ListNode p = head;
        ListNode q = reverse(head);
        while (q != null) {
            //if(p.val!=q.val) System.out.println("dfd");
            System.out.println(q.val);
            q = q.next;
        }

        System.out.println("dfsafds");
    }
}

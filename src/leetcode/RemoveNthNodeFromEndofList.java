package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndofList {
    /**
     *Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     */
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;

        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        list.remove(list.size() - n);

        ListNode tmp = new ListNode();
        ListNode result = tmp;
        for (int i : list) {
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }

        result = result.next;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

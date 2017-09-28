# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        carry = 0
        dummy_head = prev = ListNode(0)
        while carry or l1 or l2:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            cur = ListNode((val1 + val2 + carry) % 10)
            prev.next = cur
            prev = cur
            carry = (val1 + val2 + carry) / 10
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        return dummy_head.next

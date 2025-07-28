# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        # Dummy heads for the two partitions
        less_head = ListNode(0)
        greater_head = ListNode(0)
        
        # Tails to build the new lists
        less = less_head
        greater = greater_head

        # Traverse the original list
        current = head
        while current:
            if current.val < x:
                # Append to the 'less' list
                less.next = current
                less = less.next
            else:
                # Append to the 'greater or equal' list
                greater.next = current
                greater = greater.next
            current = current.next

        # Terminate the greater list
        greater.next = None
        
        # Connect the two partitions
        less.next = greater_head.next

        return less_head.next

        
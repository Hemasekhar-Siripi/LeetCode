import heapq

class MedianFinder(object):

    def __init__(self):
        self.small = []  # max-heap (invert values)
        self.large = []  # min-heap

    def addNum(self, num):
        # Add to max-heap (as -num)
        heapq.heappush(self.small, -num)

        # Balance: move the largest from small to large
        heapq.heappush(self.large, -heapq.heappop(self.small))

        # Maintain size property
        if len(self.small) < len(self.large):
            heapq.heappush(self.small, -heapq.heappop(self.large))

    def findMedian(self):
        if len(self.small) > len(self.large):
            return float(-self.small[0])
        else:
            return (-self.small[0] + self.large[0]) / 2.0

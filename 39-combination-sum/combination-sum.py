class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        result = []

        def backtrack(start, path, remaining):
            if remaining == 0:
                result.append(list(path))
                return
            elif remaining < 0:
                return

            for i in range(start, len(candidates)):
                path.append(candidates[i])
                backtrack(i, path, remaining - candidates[i])  # not i+1 because we can reuse
                path.pop()  # backtrack

        backtrack(0, [], target)
        return result

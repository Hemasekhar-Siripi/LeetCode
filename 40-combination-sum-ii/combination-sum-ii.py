class Solution(object):
    def combinationSum2(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        candidates.sort()  # Step 1: Sort to handle duplicates easily

        def backtrack(start, path, remaining):
            if remaining == 0:
                # Found valid combination
                res.append(list(path))
                return
            for i in range(start, len(candidates)):
                # Step 2: Skip duplicates
                if i > start and candidates[i] == candidates[i - 1]:
                    continue
                # Step 3: Break if current number exceeds remaining
                if candidates[i] > remaining:
                    break
                # Step 4: Choose candidates[i] and move to next index
                path.append(candidates[i])
                backtrack(i + 1, path, remaining - candidates[i])  # i+1: use number only once
                path.pop()  # Backtrack

        backtrack(0, [], target)
        return res

class Solution(object):
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: List[str]
        """
        wordSet = set(wordDict)
        memo = {}

        def dfs(start):
            if start in memo:
                return memo[start]
            if start == len(s):
                return [""]

            res = []
            for end in range(start + 1, len(s) + 1):
                word = s[start:end]
                if word in wordSet:
                    rest_sentences = dfs(end)
                    for sentence in rest_sentences:
                        space = "" if sentence == "" else " "
                        res.append(word + space + sentence)

            memo[start] = res
            return res

        return dfs(0)



class Solution:
    def letterCombinations(self, digits):
        if not digits:
            return []

        digit_to_char = {
            "2": "abc", "3": "def", "4": "ghi", "5": "jkl",
            "6": "mno", "7": "pqrs", "8": "tuv", "9": "wxyz"
        }

        result = []

        def backtrack(index, path):
            if index == len(digits):
                result.append(path)
                return
            for char in digit_to_char[digits[index]]:
                backtrack(index + 1, path + char)

        backtrack(0, "")
        return result

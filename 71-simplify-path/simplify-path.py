class Solution(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        stack = []  # Used to keep valid directory names

        # Split path by "/" to process each part
        parts = path.split('/')

        for part in parts:
            if part == '' or part == '.':
                # Ignore empty and current directory (.)
                continue
            elif part == '..':
                # Go one level up (if possible)
                if stack:
                    stack.pop()
            else:
                # Valid directory name
                stack.append(part)

        # Join the stack with "/" and add root slash at beginning
        return '/' + '/'.join(stack)

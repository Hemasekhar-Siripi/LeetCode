class Solution(object):
    def fullJustify(self, words, maxWidth):
        """
        :type words: List[str]
        :type maxWidth: int
        :rtype: List[str]
        """
        res = []           # Final result list
        line = []          # Stores words for the current line
        line_len = 0       # Total length of words in the current line (excluding spaces)

        i = 0
        while i < len(words):
            word = words[i]

            # Check if current word can fit in the line
            # line_len + len(line) gives total length with minimum spaces
            if line_len + len(line) + len(word) > maxWidth:
                total_spaces = maxWidth - line_len  # Total spaces to distribute

                if len(line) == 1:
                    # If only one word, left-justify
                    res.append(line[0] + ' ' * total_spaces)
                else:
                    # Distribute spaces evenly
                    space_between = total_spaces // (len(line) - 1)
                    extra_spaces = total_spaces % (len(line) - 1)
                    line_str = ''

                    for j in range(len(line) - 1):
                        line_str += line[j]
                        # Add space_between + 1 if j < extra_spaces (leftmost gaps get more)
                        line_str += ' ' * (space_between + (1 if j < extra_spaces else 0))

                    line_str += line[-1]  # Add the last word
                    res.append(line_str)

                # Reset for next line
                line = []
                line_len = 0
            else:
                line.append(word)
                line_len += len(word)
                i += 1

        # Handle the last line: left-justify
        last_line = ' '.join(line)
        last_line += ' ' * (maxWidth - len(last_line))  # Pad with spaces to the right
        res.append(last_line)

        return res

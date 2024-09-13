Let’s take an example to make it clearer: Suppose left = 5 and right = 7.
​
Initial values:
​
left = 5 (binary: 101)
right = 7 (binary: 111)
First iteration of the while loop:
​
left becomes 2 (101 >> 1 → 10)
right becomes 3 (111 >> 1 → 11)
count becomes 1.
Second iteration:
​
left becomes 1 (10 >> 1 → 1)
right becomes 1 (11 >> 1 → 1)
count becomes 2.
Now, left == right (both are 1), so the loop terminates.
​
After the loop, we left-shift left by count positions (1 << 2), which gives us 100 in binary, or 4 in decimal.
​
Thus, the bitwise AND of numbers between 5 and 7 is 4
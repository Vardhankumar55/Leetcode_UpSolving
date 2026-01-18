\# Bi Weekly Contest

\## Leetcode 3810:

\### Key Idea: We Count the no of operations where we try to change the nums\[i] to target\[i] where there is a maximal contiguous segment means the number in nums\[i] might repeat so we need to change the same numbers at once and find the minimum no of operations to solve and make nums to target.



\### Approach :Traverse the array and check where nums\[i]!=target\[i]  and push that value into an set so that repeated values will be considered as one operation only to make the ans as minimum



\### Complexity :

* Time: O(n)
* Space: O(1)




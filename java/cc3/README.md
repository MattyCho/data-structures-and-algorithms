# Code Challenge 3 - Binary Search

- Create a method that takes in a sorted array and a target value. If the array contains the target value, it returns the index at which that value is located. Otherwise it will return -1.

## Whiteboard Process
![Whiteboard](./java/cc3/cc3Whiteboard.png)

## Approach & Efficiency

- First set up the search boundary as being the first and last index of the array.
- Compare the middle index of the array to the target value.
- If the target value is greater than the middle value, update the left search boundary to be one index higher than the middle.
- If the target value is less than the middle value, update the right search boundary to be one index lower than the middle value.
- Repeat this process until the middle index equals the target value and return that index.
- Make sure to update the middle index after each loop as long the left search boundary is less or equal to the right search boundary.
- Return -1 if the loop completes and no index is found.
- Binary search time = O(log n)
- Space - O(1)

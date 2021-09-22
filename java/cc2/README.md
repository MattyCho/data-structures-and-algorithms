# Code Challenge 2 - Insert to Middle of an Array

- Create a method that takes in an array/value and returns the array with the value inserted in the middle.

## Whiteboard Process
![Whiteboard](/cc2/cc2Whiteboard.png)

## Approach & Efficiency
- Middle index is found by dividing the length of the array by 2.
- Create a new array with length +1 to the original array.
- Loop through the original array and insert the corresponding values.
- Big O - time is increased as the input increase, larger array to loop through = O(n).
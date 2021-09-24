# Code Challenges

## Code Challenge 5
### Singly Linked List
This code challenge was to help get familiarized with Node and Linked Lists.

### Challenge
Create a Node class which has the properties for a value and the next Node in the list.
Create a LinkedList class which has a head property and 3 methods; insert, include, toString.

### Approach & Efficiency
Big O:
  - insert; time = O(1), space = O(1)
  - includes; time = O(n), space = O(1)
  - toString; time = O(n), space = O(1)

### API
3 Methods:
1. insert() - takes in a value and returns nothing. This method will insert the value at the head of the list.
2. includes() - takes in a search value and returns a boolean. This method will traverse through the list and return a true if the search value exists in the list. Otherwise it will return false.
3. toString() - No arguments and returns a String. Traverses through the list and will return the entirety of the list in a String. List always ends with "NULL"

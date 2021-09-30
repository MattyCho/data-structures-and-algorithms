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
2. includes() - takes in a search value and returns boolean. This method will traverse through the list and return a true if the search value exists in the list. Otherwise, it will return false.
3. toString() - No arguments and returns a String. Traverses through the list and will return the entirety of the list in a String. List always ends with "NULL"

## Code Challenge 6
### Challenge Summary
Create 3 more methods for the LinkedList class.
1. append() - takes in a target value and adds it the end of the list.
2. insertBefore() - takes in a target value and a new value and will insert the new value **BEFORE** the target value in the list.
3. insertAfter() - takes in a target value and a new value and will insert the new value **AFTER** the target value in the list.

### Whiteboard Process
I started by writing out the problem domain and understanding what each method will take in as an argument and what the final list should look like.
All 3 methods would have the same basic layout:
- create a new node with the new value.
- traverse through the list.
- insert new node at the correct location
- reassign the next nodes for all affected nodes to maintain the proper list order.

![whiteboard](/java/codechallenges/cc6whiteboard.png)

### Approach & Efficiency
Each method is dependent on the length of the list because it must traverse to the correct location to insert/append a node.
Time = O(n)
Space = O(1)

## Code Challenge 7

### Challenge Summary
Create a method in the LinkedList class that takes in a integer, K, and returns the value of the node K spots
from the end of the list.
### Whiteboard Process
Originally I was thinking about writing a method to reverse the linked list and then traverse through the list to
the correct index.
I ended up instead using a method that returns the size of the list as an int and then subtracting K to find the
appropriate index.
![whiteboard](/java/codechallenges/cc7whiteboard.png)

### Approach & Efficiency
Big O:
Time = O(n)
Space = O(1)
KthFromEnd method requires the program to traverse through the list.

## Code Challenge 8

### Challenge Summary
- Zip two linked lists.
- Create a method that will take in two Linked Lists and zip them together so that the nodes will be alternating from
one list to the next.
- Example:
{1}->{2}->{3} + {4}->{5}->{6}->{7} = {1}->{4}->{2}->{5}->{3}->{6}->{7}
### Whiteboard Process
- Originally I wanted to just rearrange the next pointer for each node in both lists to alternate between themselves
but it was easier for me to just create a new list and alternate between both lists as I appended the nodes to the end
of the new list.
![whiteboard](/java/codechallenges/cc8whiteboard.png)

### Approach & Efficiency
Big O:
- Time = O(n)
- Additional Space = O(2n)

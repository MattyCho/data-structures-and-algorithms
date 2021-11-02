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

## Code Challenge 10
### Stacks and Queues
A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not
reference its previous. Think of it like a physical stack of dishes, or a deck of cards. It's easy to access and remove
the top most item in the stack. A stack operates under the LIFO concept, Last In First Out. That means that new items
are added to the top of the stack and removed from the top of the stack.
A Queue is similar to a stack but instead operates under the FIFO concept, First In First Out. Think of it like a line
of people. New people join the back of the line and the people who joined first are the first to leave.

### Challenge
- `Stack` has the methods `push`, `pop`, `peek`, and `isEmpty`.
- `Queue` has the methods `enqueue`, `dequeue`, `peek`, and `isEmpty`.

### Approach & Efficiency
Big O for every method is O(1) for both time and additional space.

### API
- `Stack` methods:
  - `push` - takes in a value and adds a node with that value to the top of the stack.
  - `pop` - removes the top node from the stack. Returns the value of that node.
  - `peek` - returns the value of the top node.
  - `isEmpty` - returns true if the stack is empty or false if it is not.
- `Queue` methods:
  - `enqueue` - takes a value and adds a node with that value to the back of the queue.
  - `dequeue` - removes the front node from the queue. Returns the value of that node.
  - `peek` - returns the value of the front node.
  - `isEmpty` - returns true if the queue is empty or false if it is not.

## Code Challenge 11
#### Challenge Summary
- Implement a Queue using two Stacks.
- Queue should have an enqueue and dequeue method.

### Whiteboard Process
The main challenge was finding a way to maintain the FIFO layout of queues using stacks.
I designated one stack to hold the values in the order they are inputted. In other words, stack one would have the top
of the stack represent the back of the queue. This makes it easy to implement the enqueue method because adding to the
back of the queue would be the same as pushing to the top of stack one. Stack two would be reversed. The top of stack
two represents the front of the queue. That way I can pop and push all the nodes from stack one to stack two and they
would be in reverse order. This makes it easy to dequeue by popping from stack 2 and returning that value.
![whiteboard](/java/codechallenges/cc11whiteboard.png)

### Approach & Efficiency
Big O:
  - Enqueue time: O(1)
  - Dequeue time: O(n)
  - Additional space: O(n)

## Code Challenge 13

### Challenge Summary
Multi-bracket Validation
Create a function that takes in a string and returns a boolean.
The program will return true if all brackets and parentheses in the string are properly closed.
If not, it will return false.

### Whiteboard Process
I used a stack to push all open brackets/parentheses as the program iterates through the string.
If it comes across a closing bracket/parenthesis, it will peek at the stack and compare if they match.
If the stack is empty, it will return false.
If the top of the stack matches the current character, it will pop from the stack.
If they don't it will return false.
If at the end the stack still has values inside, it will return false.
Otherwise it will return true.
![whiteboard](/java/codechallenges/cc13whiteboard.png)

### Approach & Efficiency
Time = O(n), it traverses the string once.
Additional Space = O(n), creates a new stack that holds characters from the inputted string.

## Code Challenge 15
### Trees
Create a `Binary Tree` Class with a method for `pre-order`, `in-order`, and `post-order` traversal. Each method should return
an array in the appropriate order.
Create a `Binary Search Tree` (BST) Class with an add method and a contains method. The `add` method should take in a value and
add it to the appropriate spot in the BST. The `contains` method should take in a value and return a boolean indicating
whether that value appears in the BST at least once.

### Challenge
Binary Tree methods:
- `pre-order`
- `in-order`
- `post-order`

Binary Search Tree methods:
- `add`
- `contains`

### Approach & Efficiency
Big O:
Time = O(n)
Additional Space = O(1)

## Code Challenge 17
### Challenge Summary
Create a function that takes in a binary tree and uses breadth first traversal to output a list of all the values in the tree.

### Whiteboard Process
The breadth first traversal uses a queue to keep track of nodes and as they are dequeued their children nodes are added
to the queue and the parent node's value is added to the output array list.
![whiteboard](/java/codechallenges/cc17whiteboard.png)

### Approach & Efficiency
Big O:
Time = O(n), time is dependent on the size/height of the input tree.
Additional Space = O(n), the function creates a separate queue that will be dependent on the size/height of the tree.

## Code Challenge 31
### Challenge Summary
Write a function called repeated word that takes in a String and returns the first word to occur more than once in that String.

### Whiteboard Process
Converted the String to an array. Removed the punctuation and converted to lowercase using regex. Create a HashMap and
iterate through the array checking to see if the current word is contained in the HashMap. If not add the word to the
HashMap. If the HashMap does contain the word, return the word.
![whiteboard](/java/codechallenges/cc31whiteboard.png)

### Approach & Efficiency
Time: O(n)
Additional Space: O(n)
The bigger the input the longer it will take to iterate through the array and the greater the size of the array and HashMap.

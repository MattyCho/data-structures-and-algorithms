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

## Code Challenge 32
### Challenge Summary
Write a function called `tree_intersection` that takes two binary trees as parameters and returns an ArrayList of the
values that can be found in both trees.

### Whiteboard Process
Traversed through both Binary Tree's and store their values in an array.
Add one array of values to a HashMap.
Use the HashMap to check if any of the second array's values are contained within.
If they are store them in a new output array.
return the output array.

### Approach & Efficiency
Time: O(m + n)
Additional Space: O(m + n)
I have to traverse through both Binary Trees and traverse through each array once as well.
For additional space, I'm creating 2 new arrays based on the size of the inputted Binary Trees.

## Code Challenge 33
### Challenge Summary
Write a function, leftJoin(), that takes in two HashMaps as arguments and returns a list with both HashMaps *Left Joined*.
The first HashMap contains a Key and a Value which is a synonym of the Key.
The second HashMap contains a Key and a Value which is an antonym of the Key.
### Whiteboard Process
Loop through the first HashMap using KeySet.
For each key in the first HashMap add it to a output list.
For each key in the first HashMap also "get" the key for the second HashMap, which will return null if the key is not in the second HashMap.
### Approach & Efficiency
Time: O(n)
Additional Space: O(n)
Only need to loop through the one HashMap.
Creates a new data structure to hold the return values.

## Code Challenge 35
### Challenge Summary
Create a Graph with the following methods:
  - addNode - takes in a value, adds it to the graph, and returns the add node.
  - addEdge - takes in 2 nodes, and a weight, returns nothing. Creates an edge between the nodes with the assigned weight.
  - getNodes - returns all nodes in the graph as a collection.
  - getNeighbors - takes in a node and returns all neighboring nodes in a list.
  - size - returns the total number of nodes in the graph.

## Code Challenge 36
### Challenge Summary
Write the following method for the Graph class:
  - breadth first
  - Arguments: Node
  - Return: A collection of nodes in the order they were visited.
  - Display the collection

### Whiteboard Process

- Pseudocode:
```Java
ALGORITHM BreadthFirst(vertex)
    DECLARE nodes <-- new List()
    DECLARE breadth <-- new Queue()
    DECLARE visited <-- new Set()

    breadth.Enqueue(vertex)
    visited.Add(vertex)

    while (breadth is not empty)
        DECLARE front <-- breadth.Dequeue()
        nodes.Add(front)

        for each child in front.Children
            if(child is not visited)
                visited.Add(child)
                breadth.Enqueue(child)

    return nodes;
```

1. We have declared that our starting node (or root) is going to be `Node A`.
2. The first thing we want to do is `Enqueue` the root.
3. We also need to add the root to the `visited` set.
4. Next, we enter a while loop. We want this loop to keep running until there are no more nodes in our queue.
5. Once we are in the while loop, we want to `Dequeue` the front node and then check to see if it has any children.
6. if there are children of the node we are currently looking at, we want to add them to `visited` set. This will help us know that we have already seen that node before, and won’t accidently push us into an infinite loop if the graph was cyclic. In addition to tracking each child node as visited, we want to place any of its children that have not yet been visited into the queue.
7. The process will complete until the queue is empty.
8. Once the while loop breaks, we can then return the list of nodes. This list will contain, in order, all the nodes that were traversed.

### Approach & Efficiency
Big O:
  - Time: O(n)
  - Additional Space: O(n)
Breadth first traversal will visit each vertex only once which leads to O(n) for time.
Although my code is creating multiple data structures (List, Queue, HashMap) the additional space complexity is going
to be O(n) as well. For example, if my graph had 10 vertices, the List, Queue, and HashMap would only ever hold at
most 10 as well. So in total there might be an extra 30 vertices (10 for each data structure) but it doesn't come close
to the 100 vertices an O(n^2) space complexity would have.

## Code Challenge 37
### Challenge Summary
Write a function called business trip
  - Arguments: graph, array of city names
  - Return: cost or null
Determine whether the trip is possible with direct flights, and how much it would cost.
### Whiteboard Process
  ![Visual Graph](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-37/GraphDay27.PNG)
First I wanted to loop through the array of city names and see if they were contained within the graph.
If a vertex has the same city name as the array then I loop through the edges and check if an edge has the same destination name as the next value in the array.
If they do, I add the weight to the `totalCost` variable and change the `isDirectFlight` boolean to true.
If an edge or vertex does not contain the correct city name from the array then `totalCost` and `isDirectFlight` remain as 0 and false.
### Approach & Efficiency
Big O
  - Time: O(n * m * e)
  - Additional Space: O(1)
Time was a bit difficult to figure out because I had 3 loops all nested. For each element in the array (n), I'm looping
through every vertex (m) in the graph and for each vertex, I'm looping through their edges(e).
Space also took some research (from Ed) because I was making a new Set from Java's built in keySet() method which, it
turns out, doesn't create new data points.

## Code Challenge 38
### Challenge Summary
Write the following method for the Graph class:
  - Name: Depth first
  - Arguments: Node (Starting point of search)
  - Return: A collection of nodes in their pre-order depth-first traversal order
  - Program output: Display the collection
### Whiteboard Process
  ![Graph Diagram](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-38/Day28Example.PNG)
> The algorithm for a depth first traversal is as follows:
> 1. `Push` the root node into the stack
> 2. Start a while loop while the stack is not empty
> 3. `Peek` at the top node in the stack
> 4. If the top node has unvisited children, mark the top node as visited, and then `Push` any unvisited children back into the stack.
> 5. If the top node does not have any unvisited children, `Pop` that node off the stack.
> 6. Repeat until the stack is empty.
### Approach & Efficiency
Big O
  - Time - O(n * m), n = number of vertices, m = number of edges.
  - Additional Space - O(n), created a list and a hashmap to hold every visited vertex.


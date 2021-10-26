# Code Challenge 25 - Insertion Sort Big 0

## Pseudocode
```Java
  InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```
Basically we want to iterate through the array and compare the current value with the value before.
If the current value is smaller, the larger value is moved up one index and we continue comparing with the value before it.

## Step Through

Input:
`[8, 4, 23, 42, 16, 15]`

Output:
`[4, 8, 15, 16, 23, 42]`

### Step 1
![step1](java/codechallenges/lib/src/main/java/codechallenges/cc26/images/Step1.png)
In the first pass through, we enter the for loop and want to compare if the current value at index i is less than the value of the previous index, j.
In this case it is true, (4 < 8), and so we move the value one index higher to make room for our insertion, i.e. 8 which was originally at index 0 is now moved to arr[1].
Then to move backwards through the array we subtract one from j which makes j equal to -1 and breaks us out of the while loop.
Now we know the index to insert our value is going to be j+1 (-1 + 1), so arr[0]=4.

### Step 2
![step2](/java/codechallenges/lib/src/main/java/codechallenges/cc26/images/Step2.png)
On the second pass through, we now have an array like `[4, 8, 23, 42, 16, 15]`.
i starts at 2 and j starts at a value of 1.
We do not enter the while loop because temp < arr[j], 23 < 8.
Therefore, we insert the value of 23 at arr[j+1] (which is also just arr[i] in this case, i.e. 23 does not move inside the array).

### Step 3
![step3](lib/src/main/java/codechallenges/cc26/images/Step3.png)
Similar to the previous step.
i starts at 3 and j starts at 2.
42 is not less than 23, so 42 is "inserted" exactly where it is.

### Step 4
![step4](lib/src/main/java/codechallenges/cc26/images/Step4.png)
i starts at 4 and j starts at 3.
We enter the while loop because 3 is greater than 0 (j >= 0) and 16 is less than 42 (temp < arr[j]).
And so move 42 one index higher and subtract one from j.
Now j is equal to 2 and 16 is still less than 23.
Once again 23 is moved one index higher, and we subtract from j.
Now j is 1 and 16 is not less than 8, so we break out of the while loop.
We insert 16 at the index of j+1.

### Step 5
![step5](lib/src/main/java/codechallenges/cc26/images/Step5.png)
The array now looks like `[4, 8, 16, 23, 42, 15]`
i starts at 5 and j starts at 4.
We enter the while loop because 4 is greater than 0 and 15 is less than 42
42 is moved one index higher and subtract one from j.
Now j is 3 and 15 is still less than 23
23 is moved one index higher and subtract one from j.
j is 2 and 15 is still less than 16.
16 is moved one index higher and subtract one from j.
j is 1 and 15 is NOT less than 8, so we break out of the while loop.
15 is inserted after 8.

### Step 6
![step6](lib/src/main/java/codechallenges/cc26/images/Step6.png)
i is 6, and we break out of the for loop because that exceeds the length of the array.
So in the end we get an array of `[4, 8, 15, 16, 23, 42]`

## BIG O
For an insertion sort, the worst case scenario is if the array is in a completely reverse order.
That would mean the function would have to traverse through both the inner and outer loop for every single value within the array. The longer the input array, the time complexity would grow exponentially.
Which would make it an O(n^2) for the time complexity.
For additional space it would be O(1). The size remains constant and does not depend on the input.

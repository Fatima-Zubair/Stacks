# Stacks
- This repository contains Java code for implementing a stack using an array and a linked list, along with various operations and functionalities associated with stacks.
## Stack Interface (stack)
- The stack interface defines the basic operations that a stack should support. 

## Stack Principles
- The stack follows the Last In, First Out (LIFO) principle, where the last element added is the first one to be removed.

## Operations
- Peek: Returns the top element if the stack is not empty.
- Pop: Deletes and returns the top element if the stack is not empty.
- Push: Inserts a new element on top of the stack.
- Size: Returns the number of elements in the stack.
# ArrayStack Implementation
The ArrayStack class implements the stack interface using an array. It includes additional functionalities such as resizing, merging two stacks, displaying elements, checking for equality, converting to a linked stack, and more.

## Additional Operations
- Resize: Doubles the array capacity when the stack is full.
- Display: Prints the elements of the stack.
- MergeTo: Merges the elements of another stack into the current stack.
- EqualsTo: Checks if two stacks are equal.
- ToLinkedStack: Converts the array stack to a linked stack (LLStack).
- RemoveBottomElement: Removes the bottom element of the stack.
- Search: Searches for an element in the stack.

# LLStack Implementation
The LLStack class implements the stack interface using a linked list. It provides similar functionalities to the ArrayStack class.

## Additional Operations
- Display: Prints the elements of the linked stack.
- Equals: Checks if two linked stacks are equal.
- RemoveBottomElement: Removes the bottom element of the linked stack.
- ToArrayStack: Converts the linked stack to an array stack (ArrayStack).
- Search: Searches for an element in the linked stack.

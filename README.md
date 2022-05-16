# Generic Sorted Linked List
## Deadline: 16.05.2022 8:00
## Implementation
Your task is to implement a sorted linked list. The elements must
be inserted at the correct position. Inserting at the last position
and sorting afterwards **is not** allowed.

A basic skeleton is already provided. The generic interface
`SortedList` is the base of your implementation. Therefore, 
`SortedLinkedList` must implement it. Do not use raw types.
`SortedLinkedList` should also implement a good-looking `toString()`
method.

An output example could be:
~~~
| a | ->| b | ->| g | ->| x | ->| z | 
~~~

The goal is to have a list which can work with all comparable
objects.

## Testing
Test your implementation intensively. Try out corner cases. 
Test all your methods = 100% code coverage.
Your implementation must care of error handling. Moreover, test
it with at least three different classes.
* One of them should be String.
* Two self written classes which are comparable. Small classes are
totally fine.
  
## Questions
* How can you change the ordering of the list? From ascending 
to descending. Name at least two different methods.
~~~java

~~~
* Can the inner Node class be static? Justify your answer.
* Can you name the generic placeholder `Placeholder` instead of
`T`? If yes should you, do it?
* Which benefits does this data structure have?
* Which drawbacks does it have? Name a use case.
* Will the following class compile? If not, why?

~~~java
public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}
~~~

* If the compiler erases all type parameters at compile time, why should you use generics?
* Consider this class:

~~~java
class Node<T> implements Comparable<T> {
    public int compareTo(T obj) { /* ... */ }
    // ...
}
~~~

Will the following code compile? If not, why?

~~~java
Node<String> node = new Node<>();
Comparable<String> comp = node;
~~~

* Write a generic method to exchange the positions of two different elements in an array

---
> **NOTES:**
Write readable and good code. Do not repeate yourself use final,
static and access modifiers accordingly. Do not forget equals methods
for your own classes.

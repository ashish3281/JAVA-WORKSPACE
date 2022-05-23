# JAVA-WORKSPACE
ALL THE BASIC PROGRAM OF DSA with JAVA HERE ....
<h2>What is a Data Structure?<h2>
Data Structure is a way to organized data in such a way that it can be used efficiently. Following terms are foundation terms of a data structure.
<br>
  <b>Interface</b> − Each data strucure has an interface. Interface represents the set of operations that a datastructure supports.An interface only provides the list of supported operations, type of parameters they can accept and return type of these operations.
<br>
  <b>Implementation </b>− Implementation provides the internal representation of a data structure. Implementation also provides the defination of the alogrithms used in the opreations of the data structure.
<br>
  <h2>Characteristics of a Data Structure</h2>
  <br>
  <pre>
Correctness − Data Structure implementation should implement its interface correctly.

Time Complexity − Running time or execution time of operations of data structure must be as small as possible.

Space Complexity − Memory usage of a data structure operation should be as little as possible.
</pre>
  <br>
  <h2>Need for Data Structure</h2>
  <br>
  <pre>


Data Search − Consider an inventory of 1 million(106) items of a store. If application is to search an item. It has to search item in 1 million(106) items every time slowing down the search. As data grows, search will become slower.

Processor speed − Processor speed although being very high, falls limited if data grows to billon records.

Multiple requests − As thousands of users can search data simultaneously on a web server,even very fast server fails while searching the data.

</pre>
  <br.
       <h2>Execution Time Cases</h2>
  <br>
  <p>
There are three cases which are usual used to compare various data structure's execution time in relative manner.
  </p>
  <br>
  <pre>
Worst Case − This is the scenario where a particular data structure operation takes maximum time it can take. If a operation's worst case time is ƒ(n) then this operation will not take time more than ƒ(n) time where ƒ(n) represents function of n.

Average Case − This is the scenario depicting the average execution time of an operation of a data structure. If a operation takes ƒ(n) time in execution then m operations will take mƒ(n) time.

Best Case − This is the scenario depicting the least possible execution time of an operation of a data structure. If a operation takes ƒ(n) time in execution then actual operation may take time as random number which would be maximum as ƒ(n).
</pre>
 <br>
<h2>Flowcharts and pseudocode<h2>
<p>How do you represent an algorithm? Writing code before fully understanding its underlying algorithm can lead to bugs, so what's a better alternative? Two options are flowcharts and pseudocode.
<br>
 <b> Using flowcharts to represent algorithms</b>
A flowchart is a visual representation of an algorithm's control flow. This representation illustrates statements that need to be executed, decisions that need to be made, logic flow (for iteration and other purposes), and terminals that indicate start and end points. Figure 1 reveals the various symbols that flowcharts use to visualize algorithms.</p>
  <pre>
A flowchart's simplicity and its ability to present an algorithm's control flow visually (so that it's is easy to follow) are its major advantages. Flowcharts also have several disadvantages, however:

It's easy to introduce errors or inaccuracies into highly-detailed flowcharts because of the tedium associated with drawing them.
It takes time to position, label, and connect a flowchart's symbols, even using tools to speed up this process. This delay might slow your understanding of an algorithm.
Flowcharts belong to the structured programming era and aren't as useful in an object-oriented context. In contrast, the Unified Modeling Language (UML) is more appropriate for creating object-oriented visual representations.
</pre>
Array in Data Structure
In this article, we will discuss the array in data structure. Arrays are defined as the collection of similar types of data items stored at contiguous memory locations. It is one of the simplest data structures where each data element can be randomly accessed by using its index number.

In C programming, they are the derived data types that can store the primitive type of data such as int, char, double, float, etc. For example, if we want to store the marks of a student in 6 subjects, then we don't need to define a different variable for the marks in different subjects. Instead, we can define an array that can store the marks in each subject at the contiguous memory locations.

Properties of array
There are some of the properties of an array that are listed as follows -

Each element in an array is of the same data type and carries the same size that is 4 bytes.
Elements in the array are stored at contiguous memory locations from which the first element is stored at the smallest memory location.
Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element.
Representation of an array
We can represent an array in various ways in different programming languages. As an illustration, let's see the declaration of array in C language -


  <h2>Array in DS</h2>
<PRE>

Index starts with 0.
The array's length is 10, which means we can store 10 elements.
Each element in the array can be accessed via its index.
  </PRE>
<H6>
  Arrays are useful because -</h6>
<ul>
  <li>Sorting and searching a value in an array is easier.</li>
  <li>Arrays are best to process multiple values quickly and easily.</li>
<li>Arrays are good for storing multiple values in a single variable - In computer programming, most cases require storing a large number of data of a similar type. To store such an amount of data, we need to define a large number of variables. It would be very difficult to remember the names of all the variables while writing the programs. Instead of naming all the variables with a different name, it is better to define an array and store all the elements into it.</li>
  </ul>
  <h6>Basic operations</h6>
<p>Now, let's discuss the basic operations supported in the array -
  </p>
  <pre>
Traversal - This operation is used to print the elements of the array.
Insertion - It is used to add an element at a particular index.
Deletion - It is used to delete an element from a particular index.
Search - It is used to search an element using the given index or by the value.
Update - It updates an element at a particular index.
<pre>
<hr>
<h4>Traversal operation</h4>
<p>This operation is performed to traverse through the array elements. It prints all array elements one after another. We can understand it with the below program -
<pre>
#include <stdio.h>  
void main() {  
   int Arr[5] = {18, 30, 15, 70, 12};  
int i;  
   printf("Elements of the array are:\n");  
   for(i = 0; i<5; i++) {  
      printf("Arr[%d] = %d,  ", i, Arr[i]);  
   }  
}  </pre>
<b>Similarly all the operation code are given above</b>

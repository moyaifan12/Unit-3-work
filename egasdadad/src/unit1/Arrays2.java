package unit1;

public class Arrays2 {
  public static void main(String[] args) {
    /**
      Introduction

     What is the difference between creating 10 different variables and
     creating one array? At first, we might think that there are no
     differences, as we have typically named variables name1, name2. 
     However, the key difference is that the index of an array is a value
      - that means we can also use variables in the index.
    */

    /**
      Using a variable for the index
    */
    System.out.println("------------------------------");
    System.out.println("Using a variable for the index");
    System.out.println("------------------------------");

    // declare and initialize an array to store 5 costs
    double[] costs = {10.5, 20.0, 30.75, 40.0, 50.25};
    // declare and initialize an int called index to 2
    int index = 2;

    // Uncomment the following line:
    System.out.println(costs[index]);

    // What did you see?
    // It prints the value at index 2, which is 30.75.

    // increase index by 1, and print it again.
    index++;
    System.out.println(costs[index]); // 40.0

    /**
      Using a loop for going through an array, and length
    */
    System.out.println();
    System.out.println("---------------------------------------------------");
    System.out.println("Using a loop for going through an array, and length");
    System.out.println("---------------------------------------------------");

    // Since we know that the indices are integer values, and they are
    // in numerical order, we can use a loop
    double[] mySizes = new double[10];
    index = 0;
    while (index < mySizes.length) {
      mySizes[index] = index + 1;
      index++;
    }

    // What do you think is the .length of an array?
    // The .length of an array is the number of elements it can hold.
    // In this case, it is 10.

    // How is finding the length of an array different from a String?
    // For arrays, we use the .length property, while for Strings, we use the .length() method.

    // What values were stored in the array?
    // The values stored are 1.0, 2.0, 3.0, ..., 10.0.

    // This time, use a for loop to add 15 to each even-indexed value. 
    // Print out all the values.
    for (int i = 0; i < mySizes.length; i += 2) {
      mySizes[i] += 15;
    }

    for (double size : mySizes) {
      System.out.println(size);
    }

    /**
      Using a for-each loop for going through an array
    */
    System.out.println();
    System.out.println("------------------------------------------------");
    System.out.println("Using a for-each loop for going through an array");
    System.out.println("------------------------------------------------");
    // we can also use a loop to repeat an action for each element
    // Instead of referencing the element by its index, we can use a variable
    // Note: this is a different kind of for loop, it is called a for-each loop. The syntax is 
    //      completely different.
    for (double currentVal : mySizes) {
      System.out.println(currentVal);
      currentVal -= 30;
    }

    // use the for-each loop to print out mySizes again. What do you notice?
    // Why do you think this is called a for-each loop?
    // The values in the array did not change because the for-each loop works on a copy of the array elements.
    // This is called a for-each loop because it iterates over each element in the array.

    for (double size : mySizes) {
      System.out.println(size);
    }

    /**
      Questions
    */
    // 1. What are the would be something a regular loop could do with arrays that a for-each loop could not?
    // Answer: A regular loop allows access to the index, which can be useful for modifying elements, accessing elements by index, or working with multiple arrays at the same time.

    // 2. What would be some ways we could use arrays?
    // Answer: Arrays can be used to store collections of data such as marks, names, prices, or any list of items where we need to store multiple values of the same type.

    // 3. Considering that arrays are typically used with loops,
    //    what might be inappropriate ways to use arrays? (Think about 
    //    what loops are supposed to do)
    // Answer: It might be inappropriate to use arrays when the size of the collection can change frequently (use ArrayList instead), or when the data structure needs to store heterogeneous types of data.
  }
}

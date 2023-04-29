Assignment-2
Part1: Write a Java program that declares two arrays named ‘even’ and ‘odd’. Accept numbers from the user and move them to respective arrays depending on whether they are even or odd.
Part2: Implement a java function that finds 2 neighboring numbers in an array with the smallest distance to each. The function should return the index of the 1st number.
Part 3: Write a Java program to convert an array into ArrayList and vice versa.

The Smallest_distance class contains a method called smallest_distance which prompts the user to enter ten numbers and then calculates and prints the smallest difference between any two adjacent numbers in the array.

The Array_List class contains a method called arraylist which prompts the user to enter ten numbers and then creates an ArrayList of those numbers and prints the list.

The main class ArrayEvenOdd prompts the user to select one of the three options and executes the appropriate method based on the user's input.

For the third option, the program creates two arrays - one for odd numbers and one for even numbers. It then prompts the user to input a series of numbers, each of which is added to the appropriate array depending on whether it is even or odd. The program then prints out the even and odd arrays separately.

The Scanner class is used to read input from the user. The nextInt() method is used to read integer input, while nextLine() is used to read strings. The ArrayList class is used to store a dynamic list of integers. The switch statement is used to choose which method to execute based on user input.

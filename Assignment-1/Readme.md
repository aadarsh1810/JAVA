Assignment-1
Part1: Implementing a menu-driven Java program (like fib or factorial)
to implement these input methods in java (command line args, Scanner, Buffered Reader,
DataInputStream, Console)

Get_Factorial: This class contains a single method fetch_fact that takes an integer as input, calculates its factorial, and displays the result.

void fetch_fact(int n): This method takes an integer n as input, calculates its factorial using a for loop, and displays the result using the System.out.println() statement.
Factorial: This is the main class that creates an object of the Get_Factorial class and provides different options for input using a menu.

public static void main(String[] args) throws IOException: This method is the entry point for the program. It creates an object obj1 of the Get_Factorial class and a BufferedReader object b to read user input from the console.

int choice: This variable is used to store the user's choice from the menu.

The menu is displayed using the System.out.println() statements and the user's choice is read using the BufferedReader.readLine() method and parsed to an integer using Integer.parseInt().

Depending on the user's choice, the program reads the input using different methods:

If the user chooses option 1, the program reads the input from the command line arguments (args) and calls the fetch_fact method of obj1 with the input.

If the user chooses option 2, the program creates a Scanner object myObj to read input from the console, reads an integer using myObj.nextInt(), calls the fetch_fact method of obj1 with the input, and closes the Scanner object.

If the user chooses option 3, the program creates a BufferedReader object a1 to read input from the console, reads a string using a1.readLine(), parses the string to an integer using Integer.parseInt(), calls the fetch_fact method of obj1 with the input.

If the user chooses option 4, the program creates a DataInputStream object a2 to read input from a file, reads a string using a2.readLine(), parses the string to an integer using Integer.parseInt(), calls the fetch_fact method of obj1 with the input, and closes the DataInputStream object.

If the user chooses option 5, the program uses the System.console() method to read input from the console, reads a string using a3.readLine(), parses the string to an integer using Integer.parseInt(), calls the fetch_fact method of obj1 with the input.

If the user chooses option 6, the program exits using the System.exit() method.

Part 2: Implementing a simple menu driven calculator in java to implement add, sub, mul, div, sqrt,
power, mean, variance. Implement a separate Calculator class to include all related function inside
that class. (mean calculation: program reads numbers from the keyboard, summing them in the
process until the user enters the string “end”. It then stops input & displays the avg. of numbers)

main() method: This is the main method of the program that executes when the program runs. It takes input from the user and performs the corresponding calculation based on the user's choice.

Scanner class: This class is used to read input from the user. It is imported at the beginning of the code with the java.util.* import statement.

Math class: This class provides various mathematical functions, such as sqrt and pow, used in the code. It is imported at the beginning of the code with the java.lang.* import statement.

switch statement: This statement is used to execute a block of code based on the value of a variable. In this code, the variable is i, which represents the user's choice.

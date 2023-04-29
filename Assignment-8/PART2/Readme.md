NOMATCHEXCP: a custom exception class that extends the built-in Exception class. It has one constructor that takes in two parameters - an integer line number and a string input, and uses them to generate an error message that says the input string is not equal to "India".

Demo: a class that contains the main method.

main: a method that starts the program execution. It creates a Scanner object to read input from the user, initializes a string variable input, and an integer variable line to 0. It then uses a try-catch block to handle exceptions that may occur during the execution of the program.
Inside the try block, it prompts the user to enter a string and reads the input using the Scanner object, increments the line variable, and then checks if the input string is equal to "India". If the input is not equal to "India", it throws a NOMATCHEXCP exception with the current line and input values.
Inside the catch block, it catches any NOMATCHEXCP exception thrown in the try block and prints the error message using System.err.println().

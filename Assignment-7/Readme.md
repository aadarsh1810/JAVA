Write a Java application that will be able to add, subtract, multiply, divide,
compare, convert to floating point, and find absolute value for rational
numbers, with exception handling

public Rational(int numerator, int denominator): a constructor for the Rational class that takes two integers as arguments, representing the numerator and denominator of the rational number. It throws an exception if the denominator is zero, and reduces the fraction to its simplest form.

public Rational add(Rational other): a method that takes another Rational object as an argument and returns a new Rational object representing the sum of the two numbers.

public Rational subtract(Rational other): a method that takes another Rational object as an argument and returns a new Rational object representing the difference between the two numbers.

public Rational multiply(Rational other): a method that takes another Rational object as an argument and returns a new Rational object representing the product of the two numbers.

public Rational divide(Rational other): a method that takes another Rational object as an argument and returns a new Rational object representing the quotient of the two numbers. It throws an exception if the other Rational's numerator is zero.

public double toDouble(): a method that returns the floating-point value of the rational number.

public Rational abs(): a method that returns a new Rational object representing the absolute value of the rational number.

public int compareTo(Rational other): a method that takes another Rational object as an argument and returns an integer value indicating whether the current object is less than, greater than, or equal to the other object.

private int gcd(int a, int b): a private helper method that calculates the greatest common divisor of two integers.

public String toString(): a method that overrides the default toString() method to return a string representation of the rational number in the form "numerator/denominator".

public static void main(String[] args): the main method of the program, which creates two Rational objects based on command-line arguments, performs various operations on them, and prints the results. It also handles exceptions related to invalid input and division by zero.

In this exercise, take an abstract class which is defined below and develop two classes. The abstract class represents the basic building block for employees in a personnel database. The code is shown below:

abstract class Employee
private String name, address;
protected int basicSalary;

The class contains three instance variables which hold the name, address and basic yearly salary of an employee.

Aim of this exercise
Generate concrete classes from an abstract class:
Copy the code above
into the file Employee.java in a folder. Make this class public.
Write the code for a class NormalEmployee which extends the class above. This class should have a single method which calculates themonthly () salary for an employee. Compile the class.
Write the code for a class BonusEmployee which extends the class Employee.java. This class describes an employee who
has a monthly bonus added to their monthly salary. Compile the class
Create a fourth file which tests the implementation of NormalEmployee and BonusEmployee files by creating suitable objects.

Assignment-3
Problem: Write a menu-driven Java Program to study the concepts ofclasses, arrayof objects, instance members, constructors in java.Assignment description: Create a Student class describing attributes of astudent like prn, name, DoB, marks etc. Create an array of objects ofStudent class and perform operations like: Add students, Display, Search(by prn, by name, by position), Update/Edit and Delete.
Solution: Using private(accessing using getter and setter) variables in a student class and using a student_functions class to perform operations on the student class such as add, display, search, update and delete. 2 classes are used to implement the solution.

public static void main(String[] args): This is the main method of the program that initiates the program execution.

public void print_student(int i): This method prints the details of the student object at the given index of the ArrayList. It takes an integer argument as the index of the student object to be printed.

public void add_student(): This method allows the user to add new student records to the ArrayList. It takes input from the user for the number of students to be added, and then for each student, it takes input for the PRN, name, date of birth, and marks.

public void display(): This method displays all the student records in the ArrayList by calling the print_student() method for each student.

public void search(): This method allows the user to search for student records based on various search criteria such as PRN, name, and position. It takes input from the user for the search criteria and then searches the ArrayList for the corresponding student records.

public void update(): This method allows the user to update the details of an existing student record. It takes input from the user for the PRN of the student to be updated and then updates the corresponding student record in the ArrayList.

public void delete(): This method allows the user to delete an existing student record. It takes input from the user for the PRN of the student to be deleted and then deletes the corresponding student record from the ArrayList.

student(int prn, String name, String dob, int marks): This is the constructor of the student class that initializes the private member variables of the class.

public int getPrn(): This method returns the PRN of the student.

public void setPrn(int prn): This method sets the PRN of the student.

public String getName(): This method returns the name of the student.

public void setName(String name): This method sets the name of the student.

public String getDob(): This method returns the date of birth of the student.

public void setDob(String dob): This method sets the date of birth of the student.

public int getMarks(): This method returns the marks of the student.

public void setMarks(int marks): This method sets the marks of the student.


/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
import java.util.Scanner;
public class StaticBlock {

//main method
  public static void main(String args[])
  {

//initialize Student class constructor for three times
    Student st1 = new Student();
    Student st2 = new Student();
    Student st3 = new Student();

//Create an array and add the 3 student to it
    Student arr[] = {st1, st2, st3};

//take input from user 3 times using for loop
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<3; i++)
      {
        System.out.print("Enter the student name: ");
        arr[i].name = sc.next();
        System.out.print("Enter the student Roll no: ");
        arr[i].rollno = sc.nextInt();
      }
    for(int i=0; i<3; i++)
      {
        System.out.println("Student name: "+arr[i].name);
        System.out.println("Student Roll no: "+arr[i].rollno);
        arr[i].dispCollegename();
      }
  }
}

//creating Student class and declaring variables
    class Student
      {
        String name;
        int rollno;
        static String collegename;
        
//creating staticBlock in that give collegename
        static
        {
          collegename = "IIT";
        }

//add getters and setters
        public String getName()
        {
          return name;
        }
        public void setName(String name)
        {
          this.name=name;
        }
   

//creating dispCollegename static method
    static void dispCollegename()
      {
          System.out.println("College Name : "+collegename);
      }
      }
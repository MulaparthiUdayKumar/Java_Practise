//Write a JAVA program to find maximum between two numbers.//
import java.util.Scanner;
class MaxofTwo {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int number1 = sc.nextInt();
    System.out.println("Enter the ssecond number: ");
    int number2 = sc.nextInt();
    if(number1>number2)
      System.out.println("Number2 is maximum");
    else
      System.out.println("Number1 is maximum");
    
    
  }
}
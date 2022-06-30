//write a program to find maximum between three numbers.//
import java.util.Scanner;
class MaxofThree
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number: ");
      int num1 = sc.nextInt();
      System.out.println("Enter the second number: ");
      int num2 = sc.nextInt();
      System.out.println("Enter the third number: ");
      int num3 = sc.nextInt();
      if(num1>num2 && num1>num3)
      {
        System.out.println("Maximum number is: "+num1);
      }
      else if(num2>num3)
      {
        System.out.println("Maximum number is: "+num2);
      }
      else
      {
        System.out.println("Maximum number is: "+num3);
      }
    }
  }
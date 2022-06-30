/*WAP to print factors of a given number*/
import java.util.Scanner;
public class Exercise1 
{
 
  public static void main(String[] args) 
  {
      int num ,i ;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number:: ");
    num = s.nextInt();
    System.out.print("Factors of " + num + " are: ");
 
    
    for (i = 1; i <= num; ++i) 
    {
      if (num % i == 0)  
      {
      System.out.print(i + " "); 
      }
    }
  }
}
//Write a JAVA program to calculate product of digits of a number.
import java.util.*;
class Product{
  public static void main(String args[]){
    int n, product=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    n=sc.nextInt();
    while(n!=0){
     int reminder=n%10;
     product=product*reminder;
      n=n/10;
    }
    System.out.println("product of digits given number is "+ product);
  }
}
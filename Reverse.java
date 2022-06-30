//Write a JAVA program to enter a number and print its reverse.
import java.util.*;
class Reverse{
  public static void main(String args[]){
    int n, reminder, reverse=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    n=sc.nextInt();
    while(n!=0){
      reminder=n%10;
      reverse=reverse*10+reminder;
      n=n/10;
    }
    System.out.println("reverse order of given number is "+ reverse);
  }
}
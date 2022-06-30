// Write a programme to find factors of a number.

import java.util.Scanner;
public class Factors {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value: ");
    int i;
    int a;
    a=sc.nextInt();
    for(i=1;i<=a;i++)
      if(a%i==0){
        System.out.println(i);
      }
    
  }
}
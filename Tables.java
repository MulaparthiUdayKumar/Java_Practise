

import java.util.Scanner;
public class Tables {
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    num = sc.nextInt();
    for(int i=1;i<=10;i++)
      {
        System.out.println(num+ " * " +i+ " = "+(num*i) );
      }
    
  }
}
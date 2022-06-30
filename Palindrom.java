


import java.util.Scanner;
class Palindrom
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = s.nextInt();
      int palindrom = 0;
      int temp = num;
      while(num!=0)
        {
          int rem = num%10;
          palindrom = (palindrom*10)+rem;
          num = num/10;
        }
          if(temp == palindrom)
          {
            System.out.println(palindrom+" is a palindrom number");
          }
          else
          {
            System.out.println(palindrom+ " is not a palindrom number");
          }
    }
  }
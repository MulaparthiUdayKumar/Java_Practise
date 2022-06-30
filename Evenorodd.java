//Write a JAVA program to check whether a number is even or odd.//
import java.util.Scanner;
class Evenorodd
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter an integer number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Entered number is even");
        }
        else
        {
            System.out.println("Entered number is odd");
        }
    }
}
// write a programme to print vowels in an array and print ASCCII values of it

  
import java.util.Scanner;
public class NewFile
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size");
      int n = sc.nextInt();
      System.out.println("characters");  // b, e, f, i
      char arr[] = new char[n];
      for(int i=0; i<n; i++)
        {
          arr[i] = sc.next().charAt(0);
        }
      
      for(int i=0; i<arr.length; i++)
        {
          if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' ||arr[i]=='u')
          {
            System.out.println(arr[i]);
            System.out.println((int)arr[i]);
          }
        }
    }
  }
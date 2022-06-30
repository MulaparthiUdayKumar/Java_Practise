// Write a program to initialize your marks for 3 subjects and print the highest marks

class Exercise3 {
  public static void main(String args[])
  {
    int sub1 = 55;
    int sub2 = 90;
    int sub3 = 84;
    if(sub1>sub2 && sub1>sub3)
    {
      System.out.println("Highest marks is : " +sub1);
    }
    else if(sub2>sub3)
    {
      System.out.println("Highest marks is : "+sub2);
    }
    else
    {
      System.out.println("Highest marks is : "+sub3);
    }
  }
}
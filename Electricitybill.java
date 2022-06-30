//Write a JAVA program to input electricity unit charges and calculate total     electricity bill according to the given condition: 
    //For first 50 units Rs. 0.50/unit 
    //For next 100 units Rs. 0.75/unit 
    //For next 100 units Rs. 1.20/unit 
     //For unit above 250 Rs. 1.50/unit 

import java.util.Scanner;
public class Electricitybill{
  public static void main(String args[]){
    int units;
    double billToPay = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of units: ");
    units=sc.nextInt();
    
    if(units<50)
    {
      billToPay = units*0.50;
    }
    else if(units<150)
    {
      billToPay = (50*0.50)+(units-50*0.75);
    }
    else if(units>250)
    {
      billToPay = (0.50)+(0.75*100)+(units-150*1.20);
    }
    else
    {
      billToPay = (0.50)+(0.75*100)+(100*1.20)+(units-250*1.50);
    }
    System.out.println
  }
}

//package aarogya_hospital;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


// the main class
public class AarogyaHospital{
static int count = 0;
	
        // class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
    String name, gender, city, address, date, guardianName, guardianAddress, status;
    int id, age;
    long aadharNumber, contactNumber, gaurdianNumber;
    
    
	
	    // make constructor for the class and assign it a unique Id
	    public AarogyaMember(){
        count++;
        id = count;
        
       
	    }
    	    // for taking patient information
	    public void input(){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the patient id: ");
        // id = sc.nextInt();
        System.out.print("Enter the patient name: ");
        name = sc.next();
        System.out.print("Enter the patient age: ");
        age = sc.nextInt();
        System.out.print("Enter the patient gender: ");
        gender = sc.next();
        System.out.print("Enter the patient Aadhar Number: ");
        aadharNumber = sc.nextLong();
        System.out.print("Enter the patient contact Number: ");
        contactNumber = sc.nextLong();
        System.out.print("Enter the patient city: ");
        city = sc.next();
        System.out.print("Enter the patient Address: ");
        address = sc.next();
        System.out.print("Enter the patient date: ");
        date = sc.next();
        System.out.print("Enter the guardian Name: ");
        guardianName = sc.next();
        System.out.print("Enter the guardian Address: ");
        guardianAddress = sc.next();
        System.out.print("Enter the guardian contact number: ");
        gaurdianNumber = sc.nextLong();
        System.out.println();
	    }  

	}

	// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		System.out.println();
    
            // create scanner class to take input
      Scanner ip = new Scanner(System.in);
      System.out.println("Choose any option: ");
	    long option=ip.nextLong();
      System.out.println();
	    return option;
	}
  static void displaydetails(AarogyaHospital.AarogyaMember p)
  {
    System.out.println("Patient id: "+p.id);
    System.out.println("Patient Name: "+p.name);
    System.out.println("Patient Gender: "+p.gender);
    System.out.println("Patient Age: "+p.age);
    System.out.println("Patient City: "+p.city);
    System.out.println("Patient Contact Number: "+p.contactNumber);
    //System.out.println("Patient Status: "+p.status);
  }

	public static void main(String args[]){
		
		// initialise array list to store list of patients information
    ArrayList<AarogyaMember> list=new ArrayList<AarogyaMember>();
    AarogyaHospital h = new AarogyaHospital();
    Scanner sc=new Scanner(System.in);
    Iterator<AarogyaMember> i = list.iterator();
		
		//for adding aarogya member information
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
        System.out.println("Invalid option try again");
			}

        
			// take the input and add in the arrayList
			else if(option==1){
        AarogyaHospital.AarogyaMember newpatient = h.new AarogyaMember();
        newpatient.input();
        list.add(newpatient);
        	        }
        
			//iterate and print all the patients information
	       		 else if(option==2){
               i = list.iterator();
               while(i.hasNext())
                 {
                   AarogyaHospital.AarogyaMember p = i.next();
                   displaydetails(p);
                   System.out.println();
                 }
               

	       		 }
			
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
                    System.out.println("Enter the patient id: ");
                    int id = sc.nextInt();
                    int count = 0;
                    i = list.iterator();
                    while(i.hasNext())
                      {
                        AarogyaHospital.AarogyaMember p = i.next();
                        
                        if(p.id == id)
                        {
                          displaydetails(p);
                          count++;
                        }
                       
                        
                      }
                     if(count==0)
                        {
                          System.out.println("Patient information is wrong");
                        }
                    System.out.println();

	                }
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
                    System.out.println("Enter the patient city: ");
                    String lcity = sc.next();
                    i = list.iterator();
                    int count = 0;
                    while(i.hasNext())
                      {
                        AarogyaHospital.AarogyaMember p = i.next();
                        
                        if(p.city.equals(lcity))
                        {
                          displaydetails(p);
                          count++;
                        }
                        
                        }
                    if(count==0)
                        {
                          System.out.println("Patient information is wrong");
                        }
                      
                    System.out.println();
	               }
                    
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
                  System.out.println("Enter the patients age from: ");
                  int sage = sc.nextInt();
                  System.out.println("Enter the patients age from: ");
                   int eage = sc.nextInt();
                   int count = 0;
                    i = list.iterator();
                    while(i.hasNext())
                      {
                        AarogyaHospital.AarogyaMember p = i.next();
                        if(p.age>=sage && p.age<=eage)
                        {
                          displaydetails(p);
                          count++;
                        }
                      }
                        
                        if(count==0)
                        {
                          System.out.println("Patient information is wrong");
                        }
                    System.out.println();
	              }
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
                   System.out.println("Enter the patient id: ");
                    int id = sc.nextInt();
                   int count = 0;
                    i = list.iterator();
                    while(i.hasNext())
                      {
                        AarogyaHospital.AarogyaMember p = i.next();
                      
                          if(p.id==id)
                          {
                            System.out.println("Patient "+p.id+" is recovered");
                            count++;
                          }
                        
                       
                      }
                   if(count==0)
                   {
                     System.out.println("Patient information is wrong");
                   }
                   System.out.println();
                         
                      
	              }
	              //take member id as input to delete patient information
	              else if(option==7){
                  
                  System.out.println("Enter the patient id: ");
                    int id = sc.nextInt();
                  int count = 0;
                    i = list.iterator();
                    while(i.hasNext())
                      {
                        AarogyaHospital.AarogyaMember p = i.next();
                        
                        if(p.id == id)
                        {
                          i.remove();
                          count++;
                          System.out.println("Successfully deleted");
                        }
                          
                        
                        
                      }
                  if(count==0)
                  {
                    System.out.println("Patient id is wrong");
                  }
                    System.out.println();
                }
			
	              else{
	             break;
	             }
		}
	}
}
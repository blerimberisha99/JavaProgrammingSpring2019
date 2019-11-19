package ReplIt;

import java.util.*;

public class TEst12 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		//DO NOT CHANGE
		    double premium = 0;
		    String license = "";
				int accidentsAmount = 0;
				int age = 0, years = 0;
				int daysDrivenToWorkOrSchool = 0;
				int milesToWorkOrSchool = 0;
				int zipCode = 0;
				String vehicleOwnership = "", accidents = "";
				String vehicleUsage = "";
				String continuousInsurance = "";
				String education = "";
				String name = "";
				String referenceNumber = "";
				//Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to the CountyFarm car insurance!");
		    //WRITE YOUR CODE HERE
		    
				String asd = "How many years you've been driving?";
				System.out.println(asd.replace(" ", ""));
				
				
		    System.out.println("Enter your name");
		    name = scan.nextLine();
		    
		    System.out.println("Do you have a US driver license?");
		    license = scan.next();
		    
		    if(license.equalsIgnoreCase("no"))
		    {
		      System.out.println("Invalid data!");
		      System.exit(0);
		    }
		    
		     System.out.println("Enter your zip code");
		     zipCode = scan.nextInt();
		     
		     switch(zipCode)
		     {
		       case 20910:
		       case 20740:
		         premium = premium + 60;
		         break;
		       case 22102:
		       case 22103:
		         premium = premium + 30;
		       default:
		         premium = premium + 50;
		         break;
		     }
		     
		     System.out.println("Is this vehicle Owned, Financed, or Leased?");
		     vehicleOwnership = scan.next();
		     if(vehicleOwnership.equalsIgnoreCase("owned"))
		      premium = premium + 10;
		     else
		      premium = premium + 20;
		     
		      System.out.println("How is this vehicle primarily used?");
		      vehicleUsage = scan.next();
		      if(vehicleUsage.equalsIgnoreCase("business"))
		      premium = premium + 50;
		      if(vehicleUsage.equalsIgnoreCase("pleasure"))
		      premium = premium + 10;
		      if(vehicleUsage.equalsIgnoreCase("commute"))
		      {
		        premium = premium + 20;
		        System.out.println("Days Driven To Work And/Or School");
		        daysDrivenToWorkOrSchool = scan.nextInt();
		        premium = premium + daysDrivenToWorkOrSchool*5;
		      
		        System.out.println("Miles Driven To Work And/Or School");
		        milesToWorkOrSchool = scan.nextInt();
		        premium = premium + milesToWorkOrSchool;
		      }
		      
		      System.out.println("How old are you?");
		      age = scan.nextInt();
		      if(age<16)
		      {
		        System.out.println("Invalid data!");
		        System.exit(0);
		      }
		      if(age>=16 && age<18)
		      premium = premium*20;
		      if(age>=18 && age<=21)
		      premium = premium*6;
		      if(age>21 && age<25)
		      premium = premium*2;
		      
		      
		      
		      
		      
		      System.out.println("How many years you've been driving?");
		      years = scan.nextInt();
		      if(years == 0 || (age - years)<16)
		       {
		        System.out.println("Invalid data!");
		        System.exit(0);
		       }
		      premium = premium - years*5;
		      
		      System.out.println("Have you had any accidents in the last 5 years?");
		      accidents = scan.next();
		      if(accidents.equalsIgnoreCase("yes"))
		      {
		        System.out.println("How many?");
		        accidentsAmount = scan.nextInt();
		        premium = premium + premium*0.2*accidentsAmount;
		      }
		      
		      System.out.println("Have you had continuous insurance for the past 12 months?");
		      continuousInsurance = scan.next();
		      if(continuousInsurance.equalsIgnoreCase("no"))
		      premium = premium*2;
		      
		      System.out.println("What is the highest level of education you have completed?");
		      scan.nextLine();
		      education = scan.nextLine();
		      if(education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("masters") || education.equalsIgnoreCase("bachelors"))
		      premium = premium - premium*0.05;
		      if(education.equalsIgnoreCase("doctors"))
		      premium = premium - premium*0.1;
		      if(education.equalsIgnoreCase("less than high school"))
		      premium = premium + premium*0.05;
		      
		      System.out.println(name + ", here\'s your quote!");
		      System.out.println("Start Your Policy Today For: $" + premium);
		      referenceNumber = name.substring(0,2) + age + name.substring((name.length()-2)) + zipCode + education;
		      System.out.println("Reference number: " + referenceNumber.toUpperCase());
		     
		      
		      
		      
		        
		       
		      
		    
		    
		    
		  }
		}
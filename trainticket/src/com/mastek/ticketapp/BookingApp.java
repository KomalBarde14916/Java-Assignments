package com.mastek.ticketapp;

 

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 

import com.mastek.ticketapp.model.Passenger;
import com.mastek.ticketapp.model.Ticket;
import com.mastek.ticketapp.model.Train;

 

public class BookingApp {

 

    public static void main(String[] args) 
    
    {
Scanner sc=new Scanner(System.in);
        
        Train trainInfo=new Train();
        Ticket ticketInfo=null;
         Passenger p_list=null;
         double totalCost=0;
        
           Map<Integer,Passenger> map=new HashMap<Integer,Passenger>(); 

 

           Map<Integer,Ticket> map2=new HashMap<Integer,Ticket>(); 
           
        
           System.out.println("Enter How many Passenger are there max=5: ");
           Integer passengerCount=sc.nextInt();
           
          if(passengerCount<5) {
              
          int  countID=0;
          
           while(passengerCount>0 && passengerCount<=5) {
               
               countID++;

 

               System.out.println("Enter Passenger "+countID+" Details.\n");
               System.out.println("Enter Passenger Name: ");
               String pName=sc.next();
               
               System.out.println("Enter Passenger Age: ");
               Integer age=sc.nextInt();
               
               System.out.println("Enter Passenger Gender male/female: ");
               String gender=sc.next();
                        
               
               p_list=new Passenger(pName,age,gender);   
               ticketInfo=new Ticket(pName, age, gender);
              
            map.put(countID,p_list);  
            map2.put(countID,ticketInfo);
          
            passengerCount--;
           
           }
           System.out.println();
           System.out.println("Welcome to Railways..");
           System.out.println("Ticket ID:"+ticketInfo.ticketid);
           System.out.println(trainInfo.getDetails());
           System.out.println();
           
           System.out.println("ID"+" Name  "+"Age"+" Gender"+" Seat-No"+" Cost-per-Passenger");

            System.out.println();
            for(Map.Entry<Integer, Ticket> entry:map2.entrySet()){    
                int key=entry.getKey();  
                Ticket b=entry.getValue();  
                
                totalCost=totalCost+b.costPerPassenger;
                
                System.out.println(key+"  "+b.getName()+"    "+b.getAge()+"  "+b.getGender()
                +"   "+b.seatNo+"     "+b.costPerPassenger);   
            } 
          }
          else {
              System.out.println("Only 5 passengers allowed on 1 Ticket.Please try again..");
          }
        System.out.println("=============================================================================");
      System.out.println("Total Cost=\t\t\t"+totalCost);
        }    
    }
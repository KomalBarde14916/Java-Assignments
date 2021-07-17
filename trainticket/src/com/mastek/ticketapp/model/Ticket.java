package com.mastek.ticketapp.model;

 

 


public class Ticket extends Passenger {
    
    public int ticketid;
    public final double ticketCost=1000;
    public double totalCost;
    public int tempAge;
    public double costPerPassenger=0;
    public int seatNo;
    
    private static int counter=100101;
    private static int seatNumber=101;
    

 

    public Ticket() {
        super();
        
    
    }

 

    
    public Ticket(int ticketID, double totalCost) {
        super();
    
        this.totalCost = totalCost;
    }

 

    public Ticket(String name, int age, String gender) {
        super(name, age, gender);
        getCostPerPassenger();
        this.seatNo=seatNumber++;
        this.ticketid=counter++;
    
    }
    

 

    public double getCostPerPassenger() {
        
            if(age<12)
            {
                this.costPerPassenger=ticketCost*0.5;
            }
            else {
                costPerPassenger=ticketCost;
            }

 

            return costPerPassenger;
        }
        

 

    
}
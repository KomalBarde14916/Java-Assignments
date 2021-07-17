package com.mastek.ticketapp.model;

 

import java.util.Date;

 

public class Train extends Passenger  {
    
public String trainId="23DRt4543";
public String trainName="Gorakhpur Express";
public String from_station="Pune";
public String to_station="Gorakhpur";
public Date date= new Date();

 

 

public Train() {
    super();
    
}

 


   public Train(String trainId, String trainName, String from_station, String to_station, Date date) {
    super();
    this.trainId = trainId;
    this.trainName = trainName;
    this.from_station = from_station;
    this.to_station = to_station;
    this.date = date;
}
   
   public Train(String name,int age,String gender ) {
       super(name,age,gender);
   }

 


@Override
public String toString() {
    return "Train [trainId=" + trainId + ", trainName=" + trainName + ", from_station=" + from_station + ", to_station="
            + to_station + ", date=" + date + "]";
}

 


public String getDetails() {
    return "Train ID: "+this.trainId+"\nTrain Name: "+this.trainName+"\nFrom: "+this.from_station+"\nTo: "
               +this.to_station+"\nDate: "+this.date;

 


}

 

}
package com.mastek.ticketapp.model;



import java.util.ArrayList;

 

public class Passenger {
    
    protected String name;
    protected int age;
    protected String gender;
    
    ArrayList<Passenger> p_list;
    
    
    public Passenger() {
        super();
    }

 


    public Passenger(String name, int age, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
   
    }
 


    public String getName() {
        return name;
    }

 


    public void setName(String name) {
        this.name = name;
    }

 


    public int getAge() {
        return age;
    }

 


    public void setAge(int age) {
        this.age = age;
    }

 


    public String getGender() {
        return gender;
    }

 


    public void setGender(String gender) {
        this.gender = gender;
    }

 


    @Override
    public String toString() {
        return "passenger [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

 


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

 


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Passenger other = (Passenger) obj;
        if (age != other.age)
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

 


    
    
    
    
    
    
}
 
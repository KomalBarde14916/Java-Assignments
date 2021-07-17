package com.mastek.profile01;

public class Job extends Candidate {
private String role="Manager";
private String companyName="Abc";
private int no_of_years_worked=5;


public Job() {
    super();
    
}


public Job(String role, String companyName, int no_of_years_worked) {
	super();
	this.role = role;
	this.companyName = companyName;
	this.no_of_years_worked = no_of_years_worked;
}

@Override
public String toString() {
	return "Job [role=" + role + ", companyName=" + companyName + ", no_of_years_worked=" + no_of_years_worked + "]";
}

public String getJobDetails() {
    return " Role: "+this.role+"\n Company Name: "+this.companyName+"\n no_of_years_worked "+this.no_of_years_worked ;
              
}
	
}

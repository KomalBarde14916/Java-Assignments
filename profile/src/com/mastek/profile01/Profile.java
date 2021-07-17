package com.mastek.profile01;
import com.mastek.profile01.Candidate;
import com.mastek.profile01.Job;



public class Profile {
	public static void main(String args[]) {  

		 
		System.out.println("====== Profile======\n");
		 
		Candidate cnd = new Candidate();
		cnd.setName("Manoj"); 
		cnd.setEducationQualification("Mtech"); 
	 	cnd.setSkill("Decision-making ");
        cnd.setCertification("Certified Proffesional Manager");
      
        
        System.out.println("Candidate Details:\n");
        System.out.println(" Name: "+cnd.getName()+"\n Qualification: "+cnd.getEducationQualification()+"\n Skill: "
        +cnd.getSkill()+"\n Certification: "+cnd.getCertification());   
       
        System.out.println("\nJob Details:\n");
        Job jobInfo=new Job();
        System.out.println(jobInfo.getJobDetails());
	
	} 
	
	 
	}


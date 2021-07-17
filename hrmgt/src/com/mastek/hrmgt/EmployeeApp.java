package com.mastek.hrmgt;


import com.mastek.hrmgt.model.Employee;
import com.mastek.hrmgt.model.FTEmployee;

public class EmployeeApp {
	public static void main(String[] args) {

		Employee detail=new Employee();
		 detail.setEmpNo(1001);
		 detail.setEmpName("Komal");
		 detail.setDesignation("Trainee");

	    System.out.println("ID: " +detail.getEmpNo());
		System.out.println("Name: "+ detail.getEmpName());
		System.out.println("Designation: "+ detail.getDesignation());
		
		FTEmployee salinfo=new FTEmployee();
		System.out.println(salinfo.netSalary());

	}
}

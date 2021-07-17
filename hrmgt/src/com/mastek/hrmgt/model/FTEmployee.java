package com.mastek.hrmgt.model;



public class FTEmployee extends Employee{
	
	
		double grossSalary=10000;
	    double incomeTax=1000; 
	    double	providentFund=800;    
	    double professionalTax =500;
	    double netSalary=grossSalary-(incomeTax+providentFund+professionalTax);
	   
	  
		public FTEmployee() {
			super();
			
		}

		public FTEmployee(double grossSalary, double incomeTax, double providentFund, double professionalTax,
				double netSalary) {
			super();
			this.grossSalary = grossSalary;
			this.incomeTax = incomeTax;
			this.providentFund = providentFund;
			this.professionalTax = professionalTax;
			this.netSalary = netSalary;
		}


		
		public String netSalary() {
			providentFund=providentFund*(grossSalary/100);
			incomeTax=incomeTax*(grossSalary/100);
	        professionalTax=professionalTax*(grossSalary/100);
	        netSalary=grossSalary-incomeTax-professionalTax-providentFund;
		
		    return " Gross Salary: "+this.grossSalary+"\n Income Tax: "+this.incomeTax+"\n Provident Fund "+this.providentFund+"\n Professional Tax "
		+this.professionalTax+"\n Net Salary: "+this.netSalary ;
		              
		}
}

		
	
	
   
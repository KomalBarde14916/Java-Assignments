package com.mastek.hrmgt.model;

public class Employee {
	 private int empNo;
		private String empName;
		private String designation;
		public int getEmpNo() {
			return empNo;
		}
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Employee(int empNo, String empName, String designation) {
			super();
			this.empNo = empNo;
			this.empName = empName;
			this.designation = designation;
		}

		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}

		@Override
		public String toString() {
			return "Employee [empNo=" + empNo + ", empName=" + empName + ", designation=" + designation + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + empNo;
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
			Employee other = (Employee) obj;
			if (empNo != other.empNo)
				return false;
			return true;
		}

		
		
}

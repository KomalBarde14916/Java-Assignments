package com.mastek.ecommerce.model;

public class Products {
	protected int pid;
	protected String productName;
	protected double price;
	private static int counter=0;
	
	public Products() {
		super();
			}
	public Products(String productName, double price) {
		this.pid=++counter;
		this.productName = productName;
		this.price = price;
	}
	
	public Products(int pid, String productName, double price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
	}
	

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", productName=" + productName + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pid;
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
		Products other = (Products) obj;
		if (pid != other.pid)
			return false;
		return true;
	}
		}
	
	
	
	


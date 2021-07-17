package com.mastek.ecommerce;

import java.util.Scanner;


import com.mastek.ecommerce.model.Products;

public class EcommerceApp {

	public static void main(String[] args) {
		Products [] productList=new Products[3];
		boolean test=true;
		Scanner sc=new Scanner(System.in);
		Products product=null;
		int index=0;
		while(test) {
			
		System.out.println("Enter product name : ");
		String productName=sc.nextLine();
		
		System.out.println("Enter product price : ");
		double price=Double.parseDouble(sc.nextLine());
		

		System.out.println(index+"product selected\n"+product);
		productList[index]=product;
		index=index+1;
		System.out.println("Do you want to enter more product details y/n?");
		String choice=sc.nextLine();
			if(choice.equalsIgnoreCase("n")) {
				test=false;
			}
		}
		sc.close();
		for(int i=0;i<productList.length;i++) {
		System.out.println(productList[i]);
		
		}
   }
}

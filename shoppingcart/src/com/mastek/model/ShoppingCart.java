package com.mastek.model;
import java.util.ArrayList;
import java.util.ListIterator;

import com.mastek.model.cart.Cart;
import com.mastek.model.cart.Item;


public class ShoppingCart
{
  public static void main(String[] args)
  {
    // creates new items with product name, quantity and unit price
    Item i1 = new Item("Maggie", 3, 30.0);
    Item i2 = new Item("Cheese Slices", 2, 50.0);
    Item i3 = new Item("Bread", 1, 75.0);
    Item i4 = new Item("Pepsi", 50, 20.0);
    Item i5 = new Item("Butter", 2, 100.0);
    
    Cart cart = new Cart();
    
   
    cart.addToCart(i1);
    cart.addToCart(i2);
    cart.addToCart(i3);
    cart.addToCart(i4);
    cart.addToCart(i5);
    
       cart.showCart();
    
       cart.removeFromCart(i3);    
    
        cart.showCart();

   
    double totalAmount = cart.getTotalAmount();
    System.out.println(totalAmount);

    
    double payableAmount = cart.getPayableAmount();
    System.out.println(payableAmount);    

   
    cart.applyCoupon("IND50");
    
       cart.printInvoice();

    cart.applyCoupon("IND10");

       cart.printInvoice();

    cart.addToCart(new Item("Milk", 5, 30.00));
    
    cart.printInvoice();
  }
}
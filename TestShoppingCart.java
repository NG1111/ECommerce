package com.products.oops;

import java.util.Scanner;

public class TestShoppingCart {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ShoppingCart details:");
		String product=sc.next();
		int NoOfItems =sc.nextInt();
		
		ShoppingCart s1=new ShoppingCart(product,NoOfItems);
		System.out.println(s1.AddToCart());
		System.out.println(s1.RemFromCart());
		System.out.println(s1.GetCartItems());
		sc.close();
	}

}

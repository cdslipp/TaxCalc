 package com;

import java.util.Scanner;
import java.math.*;
public class Calculator {
	public static double priceCalc() {
		double price;
		double tax = 0.13;
		double percent;
		double total;
		
		System.out.println("Enter Price");
		Scanner s = new Scanner(System.in);
		price = s.nextDouble();
		percent = price*tax ;
		total = Math.round(percent + price);
		return (total);
		
	}


}


package com;

import java.util.Scanner;

public class Sales {
	
	public static double salesCalc() {
		double price;
		double tax = 1.13;
		double percent;
		double total;
		
		System.out.println("Enter desired price after tax");
		Scanner s = new Scanner(System.in);
		total = s.nextDouble();
		price = total/tax;
		//System.out.println(price);
		return price;
	}
}

package com;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalcFrame extends JFrame{
	private static JFrame window1 = new JFrame("Tax Calculator");
	private JLabel label1 = new JLabel("Would you like to calculate tax on an item or calculate a desired price?");
	private JButton taxButton = new JButton("Tax");
	private JButton salesButton = new JButton("Desired Price");
	
	public CalcFrame(){
		window1.setLayout(new GridLayout(2,2));
		window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window1.setSize(450,100);
		window1.setVisible(true);
		taxButton.addActionListener(new TaxListener());
		salesButton.addActionListener(new SalesListener());
		
		window1.add(label1);
		window1.add(taxButton);
		window1.getContentPane().add(salesButton);	
	}	
	private class TaxListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Tax");
			JFrame taxWindow = new JFrame("Price plus tax");
			JTextField priceValue = new JTextField("Enter price here here");
			JLabel totalLabel = new JLabel("Price plus tax = ");
			JTextField finalValue = new JTextField();
			JButton submit = new JButton("Submit");
			
			taxWindow.setLayout(new FlowLayout());
			taxWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			taxWindow.setSize(450,100);
			taxWindow.setVisible(true);
			
			taxWindow.add(priceValue);
			taxWindow.add(totalLabel);
			taxWindow.add(finalValue);
			taxWindow.add(submit);
			
			
			
		}
	}
	private class SalesListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Sales");
			
		}
	}

}


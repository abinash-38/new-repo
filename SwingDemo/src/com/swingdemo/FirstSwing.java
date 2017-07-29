package com.swingdemo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstSwing 
{
	public static void main(String[] args) 
	{

		 //These codes can be written here explicitly or down in a constructor. The 2nd type of writing is more preferred.
		Abc obj = new Abc();
	}
}

class Abc extends JFrame
{
	public Abc()
	{
		
		JLabel l = new JLabel("  Hello World");
		JLabel l1 = new JLabel("This is Hello again.");
		l.setToolTipText("JLabel");
		l1.setToolTipText("JLabel1");

		add(l);
		add(l1);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	}
	
	
}

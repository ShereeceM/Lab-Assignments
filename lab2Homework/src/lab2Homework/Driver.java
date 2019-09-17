package lab2Homework;

import java.util.Scanner;

import lab2Homework.House;

public class Driver {

	public static void main(String[] args) {
		Scanner driver = new Scanner(System.in);
		House[] houses= new House[3];
		houses[1]= new House();
		System.out.println("Please enter the following details of your house:");
		System.out.println("ID:");
		 houses[1].id = driver.nextInt();
		 System.out.println("Price:");
		  houses[1].price = driver.nextFloat();
		 System.out.println("Location:");
		 houses[1].location = driver.nextLine();
		 System.out.println("Advertiser:");
		 houses[1].advertiser = driver.nextLine();
		 System.out.println("Details of photo:");
		 System.out.println("Details of your house :" +houses[1]);
		 
		
	
	}

}

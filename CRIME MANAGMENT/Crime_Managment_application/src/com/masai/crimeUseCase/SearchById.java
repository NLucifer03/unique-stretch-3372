package com.masai.crimeUseCase;

import java.util.Scanner;

import com.masai.Bean.Crime;
import com.masai.CrimeDao.CrimeDao;
import com.masai.CrimeDao.CrimeDaoImpl;
import com.masai.Exceptions.CrimeException;

public class SearchById {

	public static void main(String[] args)
	{
		
		
//		----------------------scanner class to take input from user----------------------------
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Crime_id to search perticular crime Details");
		int crime_id = s1.nextInt();
		
//		-------------------Creating the object of crimeDao class to call method----------------------
		
		CrimeDao cd = new CrimeDaoImpl();
		
		try {
			
			Crime c = cd.searchByID(crime_id);
			System.out.println("Id of the Crime : " + c.getId() );
			System.out.println("Name of the crime : " + c.getName());
			System.out.println("Number of Victims : " + c.getVictims());
			System.out.println("Detailed Description of Crime : " + c.getDetails());
			System.out.println("Date : " + c.getDate());
			System.out.println("Police staion name : " + c.getPolice());
			System.out.println("Name of main Suspected : " + c.getSuspected());
			System.out.println("Status of Case : " + c.getStatus());
			
		} catch (CrimeException e) {
		
			System.out.println(e.getMessage());
			
		}
		
	}
	
}

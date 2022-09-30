package com.masai.CrimeDao;

import java.util.List;

import com.masai.Bean.Crime;
import com.masai.Exceptions.CrimeException;

public interface CrimeDao {
	
//--------------------------------------------- add crime details -----------------------------------------------
	
	String AddCrimeDetails(Crime c);
	
//	------------------------------------------- List of all crimes ----------------------------------------------
	
	List<Crime> getAllCrimes() throws CrimeException;
	
//	---------------Delete crime details based on crime_id from crime and crime_by_criminal table------------------
	
	String deleteCrimeDetails(int id) throws CrimeException;
	
//  ----------------------- Delete crime details based on crime_id from crime table ------------------------------
	
	String deleteIvalidDetails(int id);
	
//	-----------------------Search crime by crime_id and able to change status-------------------------------------
	
	Crime searchByID(int id) throws CrimeException;
	
//	-----------------------------------Search Crimes by Crime name------------------------------------------------
	
	List<Crime> searchByName(String s) throws CrimeException;

//	----------------------- change the status of cases solve to unsolved / unsolved to solved---------------------
	
	 String updateStatusOfCase (int crime_id, String value) throws CrimeException;
	
//	-----------------------------checking the current Status of case----------------------------------------------
	 
	 String checkStatus(int crime_id) throws CrimeException;
	 
//	---------------------------count the number of cases in current month-----------------------------------------
	 
	 String countNumberOfCasesInCurrentMonth();
	 
//	 ------------------------------------check the number of solved cases-----------------------------------------
	 
	 String numberOfSolvedCases();
	 
//	 ------------------------------------check the number of unsolved cases---------------------------------------
	 
	 String numberOfUnsolvedCases();
	 
//	 -------------------------------------Details of all Solved Cases---------------------------------------------
	 
	 List<Crime> detailsOfSolvedCases()  throws CrimeException;
	 
//	 -------------------------------------Details of all Unsolved Cases---------------------------------------------
	 
	 List<Crime> detailsOfUnsolvedCases()  throws CrimeException;
	 
	 
}

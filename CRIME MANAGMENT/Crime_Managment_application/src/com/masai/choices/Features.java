package com.masai.choices;

import java.util.Scanner;

import com.masai.CriminalUseCase.DeleteCriminalDetails;
import com.masai.CriminalUseCase.DeleteCriminalInvalidDetails;
import com.masai.CriminalUseCase.GetListOfAllCriminals;
import com.masai.CriminalUseCase.RegisterCriminal;
import com.masai.CriminalUseCase.SearchCriminalById;
import com.masai.CriminalUseCase.SearchCriminalByName;
import com.masai.crimeByCriminalUseCases.CriminalMap;
import com.masai.crimeByCriminalUseCases.DeleteCrimeByCriminal;
import com.masai.crimeByCriminalUseCases.DetailedListOfAllCases;
import com.masai.crimeByCriminalUseCases.SearchCrimeByCriminal;
import com.masai.crimeUseCase.CasesInCurrentMonth;
import com.masai.crimeUseCase.CheckStatus;
import com.masai.crimeUseCase.DeleteCrimeDetails;
import com.masai.crimeUseCase.DeleteInavlidCrimeDetails;
import com.masai.crimeUseCase.DetailsOfSolvedCases;
import com.masai.crimeUseCase.DetailsOfUnsolvedCases;
import com.masai.crimeUseCase.GetListOfAllCrimes;
import com.masai.crimeUseCase.RegisterCrime;
import com.masai.crimeUseCase.SearchByCrimeName;
import com.masai.crimeUseCase.SearchCrimeById;
import com.masai.crimeUseCase.SolvedCases;
import com.masai.crimeUseCase.UnsolvedCases;
import com.masai.crimeUseCase.Update;

public class Features {

	public static void Start() {
		
//		-----> intiating scanner class to take the input from the user
		
		Scanner s1 = new Scanner(System.in);
		
		while(true)
		{
		
		try
		{
			System.out.println("");
			System.out.println("Press Y to enter Into System OR N to close the application");
			String choice = s1.next();
			
			while(choice.equalsIgnoreCase("y"))
			{
				
				System.out.println("Select one command to execute : ");
				System.out.println();
				System.out.println("-------->");
				System.out.println("");
				
				System.out.println("********************************Crimes Related Querries**********************************");
				System.out.println("");
				System.out.println("1.  list of all crimes with full details");
				System.out.println("2.  Register crime details into the Database");
				System.out.println("3.  Search crime details with crime id");
				System.out.println("4.  Search crime details with crime name");
				System.out.println("5.  Delete Crime details if crime is not attached with any criminal");
				System.out.println("6.  Delete crime details if crime is attached with any criminal");
				System.out.println("7.  List of all solved Cases");
				System.out.println("8.  List of all unsolved Cases");
				System.out.println("9.  Number of all solved cases");
				System.out.println("10. Number of all unsolved cases");
				System.out.println("11. Check the status of particular case that whether it is solved OR unsolved");
				System.out.println("12. Update the Status of particular case ( Solved / Unsolved )");
				System.out.println("13. Total Number of cases registered in current month");
				System.out.println("");
				System.out.println("******************************Criminal Related Querries***********************************");
				System.out.println("");
				System.out.println("14. Register Criminal Details");
				System.out.println("15. List of all Criminals With Full details");
				System.out.println("16. Serach details of Criminals by name");
				System.out.println("17. Serach particular Criminal Details with criminal id");
				System.out.println("18. Delete Criminal Details if he/she is not attached wtih any crime");
				System.out.println("19. Delete criminal Details if he/she is attached with any crime");
				System.out.println("");
				System.out.println("**************************Crimnal with Crime all Details***********************************");
				System.out.println("");
				System.out.println("20. Register criminal with crime (Mapping the detials fo crimnal with crime)");
				System.out.println("21. List of All registered Cases Inside the Database");
				System.out.println("22. Search particular criminal and attached crime details");
				System.out.println("23. Delete Deltails of Crimnal and crime");
				System.out.println("");
				

				int action = s1.nextInt();
				
				switch (action) {
				case 1:
					new GetListOfAllCrimes().getListOfAllCrimes();
					break;
				case 2:
					new RegisterCrime().registerCrime();
					break;

				case 3:
					new SearchCrimeById().searchById();
					break;

				case 4:
					new SearchByCrimeName().searchByName();
					break;

				case 5:
					new DeleteInavlidCrimeDetails().deleteInvalidDetails();
					break;
				case 6:
					new DeleteCrimeDetails().deleteCrimeDetails();
					break;
				case 7:
					new DetailsOfSolvedCases().detailsOfSolvedCases();
					break;
				case 8:
					new DetailsOfUnsolvedCases().detailsOfUnsolvedCases();
					break;
				case 9:
					new SolvedCases().solvedCases();
					break;
				case 10:
					new UnsolvedCases().unsolvedCases();
					break;
					
				case 11:
					new CheckStatus().checkStatus();
					break;
				case 12:
					new Update().update();
					break;
				case 13:
					new CasesInCurrentMonth().casesInCurrenMonth();
					break;
					
				case 14:
					new RegisterCriminal().registerCriminal();
					break;
				case 15:
					new GetListOfAllCriminals().getListOfAllCriminals();
					break;
				case 16:
					new SearchCriminalByName().searchByName();
					break;
				case 17:
					new SearchCriminalById().searchById();
					break;
				case 18:
					new DeleteCriminalInvalidDetails().deleteInvalidDetails();
					break;
					
				case 19:
					new DeleteCriminalDetails().deleteCriminalDetails();
					break;
				case 20:
					new CriminalMap().registerCriminal();
					break;
				case 21:
					new DetailedListOfAllCases().detailedListOfAllCases();
					break;
				case 22:
					new SearchCrimeByCriminal().searchCrimeByCriminal();
					break;
				case 23:
					new DeleteCrimeByCriminal().deleteCrimeByCriminal();
					break;
				
				}
				
				Boolean flag = false;
				
				while(true)
				{
					System.out.println("");
					System.out.println("Want further Querries ? ( Y / N )");
					
					String c = s1.next();
					
					if(c.equalsIgnoreCase("Y"))
					{
						break;
					}
					else if(c.equalsIgnoreCase("n"))
					{
						flag = true;
						break;
					}
					else
					{
						continue;
					}
					
				}
				
				if(flag == true)
				{
					choice = "n";
					break;
				}
				
			}
			if(choice.equalsIgnoreCase("n"))
			{
				
				System.out.println("Thankyou for your Visit !!!");
				break;
				
			}
			else
			{
				System.out.println("Invalid Input");
			}
			
		}	
			
		
		catch (Exception e) {
		
			System.out.println(e.getMessage());
			
		}
		
		}
	}
}
		
	



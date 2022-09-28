package com.masai.CrimeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.Bean.Crime;
import com.masai.utility.DB_Connection;

public class CrimeDaoImpl implements CrimesDao{

	@Override
	public String AddCrimeDetails(Crime c) {
//		--------------- Initialize String ----------------------------------------------------
		String message = "failed to insert details.....";
		
		
		
//		---------------------------creating the connection between database-------------------------
		try(Connection con = DB_Connection.getconnection())
		{
			
// 		---------------------------SQL query to insert the data into the crime table----------------------------------			
			PreparedStatement ps = con.prepareStatement("insert into Crime (Name_of_crime, Victims, Detailed_des,Date,Police_station_name,suspected,status) values(?,?,?,?,?,?,?);");
			
			ps.setString(1, c.getName());
			ps.setInt(2, c.getVictims());
			ps.setString(3, c.getDetails());
			ps.setString(4, c.getDate());
			ps.setString(5, c.getPolice());
			ps.setString(6, c.getSuspected());
			ps.setString(7, c.getStatus());
			
			int update = ps.executeUpdate();
			
			if(update > 0)
			{
				message = "details are successfully inserted";
			}
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}
		
		
		return message;
	}

}
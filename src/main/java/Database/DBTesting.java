package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DBTesting  {
		
	public ArrayList<String> db(String query, String[] dbColumn) throws ClassNotFoundException, SQLException{
	
	 Connection con = null;
	 ResultSet rs= null;
	 Statement st = null;
	 
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadb", "root", "Siva@1436");
		
		st = con.createStatement();
		
		rs = st.executeQuery(query);
		
		ArrayList<String> values = new ArrayList<>();
		while(rs.next()){
			System.out.println("resultset: "+ rs.getString("First_Name"));
			
			for (int i = 0; i < dbColumn.length; i++) {
				values.add(rs.getString(dbColumn[i]));
				System.out.println("Stored Username in DB:" +" " +values);
			
		}
		
		
		
		
	}
		return values;
	
	}
	
	}


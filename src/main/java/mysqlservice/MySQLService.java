package mysqlservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLService implements ConServiceable {
	
	public Connection getCon(String url, String user, String pass) throws SQLException{
		Connection con= DriverManager.getConnection(url, user, pass);
		return con;
	}
	
	public void getUpdate(Connection con, String id, double salary) throws SQLException, IdNotFoundException {
		Statement st=con.createStatement();
		st.executeUpdate("Update Employee set EmpSalary=" +salary + "Where EmpID="+ id);
		ResultSet rs= st.executeQuery("Select * from Employee where EmpID= "+ id);
		
		boolean temp=false;
		while(rs.next()) {
			temp=true;
			System.out.println(rs.getString("EmpID")+ rs.getString("EmpName")+ rs.getString("EmpSalary"));
		}
		
		if(temp==false) {
			throw new IdNotFoundException("Id is not found");
		}
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mysqlservice.IdNotFoundException;
import mysqlservice.MySQLService;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) throws Exception{
		
		Scanner input= new Scanner(System.in);
		List <Employee> emplist= new ArrayList <Employee>();
		
		Connection con = null;
		String url="Jdbc:mysql://localhost:3306/mydb";
		MySQLService obj= new MySQLService();
		
		try {
			 con= obj.getCon(url, "root", "1234");
			 Statement st= con.createStatement();
			 ResultSet rs= st.executeQuery("Select * from Employee");
			
				 while(rs.next()) {
					 emplist.add(new Employee(rs.getString("EmpID"), rs.getString("EmpName"), rs.getDouble("EmpSalary")));
				 }
	}
		
	 catch (SQLException e) {
		 System.out.println(e.getMessage());
	 }
		
		Collections.sort(emplist, new EmpSalaryComp());
		
		for(Employee emp : emplist) {
			System.out.println(emp.getEmpId()+ " "+ emp.getEmpName()+ " "+ emp.getEmpSalary());
		}
		
		System.out.println("\nEnter Id and Salary to Update\n");
			String id= input.nextLine();
		    double salary= input.nextDouble();
		    
	try {
		con=obj.getCon(url, "root", "1234");
		obj.getUpdate(con, id, salary);
		
	}
	
	catch(IdNotFoundException e1) {
		System.out.println(e1);
	}
	
	catch(SQLException e2){
		System.out.println(e2.getMessage());
		}
	}
}


public class Employee {
	private String empId;
	private String empName;
	private double empSalary;
	
	public Employee() {
		
	}
	
	public Employee(String empId, String empName, double empSalary) {
		this.empId=empId;
		this.empName= empName;
		this.empSalary= empSalary;
		
	}
	
	public void setEmpId(String EmpId) {
		this.empId=empId;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public void setEmpSalary(double empSalary) {
		this.empSalary=empSalary;
	}
	
	public String getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}

}

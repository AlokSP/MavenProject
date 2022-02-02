import java.util.Comparator;

public class EmpSalaryComp implements Comparator< Employee>{
	
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getEmpSalary()==emp2.getEmpSalary())
			return emp1.getEmpName().compareTo(emp2.getEmpName());
		else if(emp1.getEmpSalary()<emp2.getEmpSalary()) {
			return 1;
	   }
		else
			return -1;
	}

}

package Encapsulation;

public class EmployeeData {
	
	//Private data variables
	private String empName;
	private int empAge;
	private int ssn;

	public static void main(String[] args) {
		
		EmployeeData emp = new EmployeeData();
		emp.setEmpName("Tom Peter");
		emp.setEmpAge(25);
		emp.setSsn(123456789);
		
		System.out.println("Employee Name is : " + emp.getEmpName());
		System.out.println("Employee Age is : " + emp.getEmpAge());
		System.out.println("Employee SSN is : " + emp.getSsn());

	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}

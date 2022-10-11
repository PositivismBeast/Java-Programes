package orgtest;

public class ExceprtionContinue {
	public static void main(String[] args) throws EmployeeNotFoundException {
		int empId=90;
		    if (empId>=100) {
		    	System.out.println("valid employee");
				
			}
		    else {
		    	throw new EmployeeNotFoundException(); 
			}
		    
	}
	

}

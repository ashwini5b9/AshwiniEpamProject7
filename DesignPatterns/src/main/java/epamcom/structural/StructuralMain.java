package epamcom.structural;

public class StructuralMain {

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails("A","Programmer",40000);
		EmployeeDetails emp2 = new EmployeeDetails("B","CEO",400000);
		EmployeeDetails emp3 = new EmployeeDetails("C","Programmer",40000);
		EmployeeDetails emp4=  new EmployeeDetails("D","SalesMan",40000);
		EmployeeDetails emp5 = new EmployeeDetails("E","Developer",45000);
		EmployeeDetails emp6 = new EmployeeDetails("F","Marketing",40000);
		EmployeeDetails emp7 = new EmployeeDetails("G","Testing",45000);		
		
		emp3.addColleague(emp1);
        emp3.addColleague(emp7);
        emp1.addColleague(emp7);

        System.out.println(emp3);
        for (EmployeeDetails headEmployee : emp3.getWorkers()) {
            System.out.println(headEmployee);
            
            for(EmployeeDetails employee : headEmployee.getWorkers()) {
                System.out.println(employee);
            }
        }
	}

}
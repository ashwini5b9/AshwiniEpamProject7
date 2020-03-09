package epamcom.structural;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
	private String fullName;
	private String position;
	private int wage;
	private List<EmployeeDetails> colleagues;
	public EmployeeDetails(String name,String position,int wage){
		this.fullName = name;
		this.position = position;
		this.wage = wage;
		colleagues = new ArrayList<EmployeeDetails>();
	}
	public void addColleague(EmployeeDetails emp){
		colleagues.add(emp);
	}
	public void removingWorker(EmployeeDetails emp){
		colleagues.remove(emp);
	}
	public List<EmployeeDetails> getWorkers(){
		return colleagues;
	}
	public String toString(){
		return "EmployeeDetails : Name: " + fullName + ", Position: " + position + ", Wage: "+ wage ;
	}

}
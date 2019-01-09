package StackPlain;

import java.util.ArrayList;

public class ArrayStack {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	Employee top;
	int counter=-1;
	
	ArrayStack(Employee emp){
		employees.add(emp);
		counter++;
		top=employees.get(counter);
		
	}
	
	ArrayStack(){
		
	}
	
	public void pushToStack(Employee emp) {
		employees.add(emp);
		counter++;
		top=employees.get(counter);
	}
	
	public Employee popFromStack() {
		Employee emp = top;
		employees.remove(counter);
		counter--;
		top = employees.get(counter);
		return emp;
	}

	public Employee getLatestEmployee() {
		if(top != null)
		return top;
		else
			return null;
	}
	
	@Override
	public String toString() {
		String data= "";
		for(int i =counter; i>=0;i--) {
			data=data+ "Employee name: "+ employees.get(i).name+ " Employee Age: "+ employees.get(i).age + "\n";
		}
		return data;
	}
}

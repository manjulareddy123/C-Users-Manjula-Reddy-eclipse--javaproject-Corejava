package oops;

public class Runnerclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee emp1 = new employee();
		emp1.Name = "Manju";
		emp1.EmpId = 100;
		emp1.SetSalary(50000);
		
		
		employee emp2 = new employee();
		emp2.Name = "Diya";
		emp2.EmpId = 101;
		emp2.SetSalary(75000);
		
        employee emp3 = new employee("nava",102,80000);
		
		emp1.Display();
		emp2.Display();
		emp3.Display();


	}

}

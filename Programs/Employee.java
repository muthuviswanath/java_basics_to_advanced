import java.util.Scanner;
class Employee 
{
	void displayEmpDetails(int empno, String name, String empdept){
			System.out.println(empno);
			System.out.println(name);
			System.out.println(empdept);
		}
		void displaySalary(String name, double salary){
			double quarterlysal = salary * 3;
			double annualsal = salary * 12;
			System.out.println(name + ":" + "Quartely Salary: "+ quarterlysal + "Annual Salary: "+ annualsal);
		}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter the Employee Name: ");
		String name = s.next();
		System.out.println("Enter the Employee Id: ");
		int empid= s.nextInt();
		System.out.println("Enter the Employee Department: ");
		String dept= s.next();
		System.out.println("Enter the Employee Salary: ");
		double salary= s.nextDouble();
		do{
			System.out.println("1. Display Employee Details");
			System.out.println("2. Display Salary Details");
			System.out.println("3. Exit");
			int choice = s.nextInt();
			switch(choice){
				case 1:
							e.displayEmpDetails(empid,name,dept);
							break;
				case 2:
							e.displaySalary(name,salary);
							break;
				case 3:
							return;
				default:
							System.out.println("Invaid choice");
			}	
		}while(true);

	}
}

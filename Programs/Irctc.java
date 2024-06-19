import java.util.Scanner;
class Irctc 
{
	void calculateFare(int age, double fare){
		double amount = 0;
		if(age >=1 && age <5){
			amount = 0;
			System.out.println(amount);
		}
		else if(age >=5 && age <18){
			amount = fare * 0.5;
			System.out.println(amount);
		}
		else if(age >= 18 &&  age <=59){
			amount = fare;
			System.out.println(amount);
		}
		else if (age >=60 && age  <100){
			amount = fare * 0.75;
			System.out.println(amount);
		}
		else if (age> 99)
		{
			System.out.println("Unsafe to travel");
		}
		else{
			System.out.println("Invalid  age");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = s.nextInt();
		double basefare = 518.35;
		Irctc ir = new Irctc();
		ir.	calculateFare(age,basefare);
	}
}

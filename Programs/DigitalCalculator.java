import java.util.Scanner;
class DigitalCalculator 
{
		int add(int a, int b){
		return a+b;
	}
		int sub(int a, int b){
		return a-b;
	}
		int mul(int a, int b){
		return a*b;
	}
		int div(int a, int b){
			if(b ==0){
				System.out.println("Cannot divide by zero");
				return -1;
			}
			else{
				return a/b;		
			}
		
	}
		int mod(int a, int b){
		return a % b;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		DigitalCalculator dc = new DigitalCalculator();
		System.out.println("Enter the value for first number: ");
		int a= scan.nextInt();
		System.out.println("Enter the value for second number: ");
		int b= scan.nextInt();
		do{
		System.out.println("Calculator: ");
		System.out.println("1. Addition ");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication ");
		System.out.println("4. Division ");
		System.out.println("5. Modulus ");
		System.out.println("6. Exit");
		System.out.println("Enter your choice [1-6]: ");
		int choice = scan.nextInt();
		int r = 0;
		switch (choice)
		{
		case 1:
					r = dc.add(a,b);
					System.out.println("Addition of " + a +" and " + b+" gives: " + r);
					break;
		case 2:
					r = dc.sub(a,b);
					System.out.println("Subtraction of " + a +" and " + b+" gives: " + r);
					break;
		case 3:
					r = dc.mul(a,b);
					System.out.println("Multiplication of " + a +" and " + b+" gives: " + r);
					break;
		case 4:
					r = dc.div(a,b);
					if (r  != -1){
					System.out.println("Division of " + a +" and " + b+" gives: " + r);
					}
					break;
		case 5:
					r = dc.mod(a,b);
					System.out.println("Modulus of " + a +" and " + b+" gives: " + r);
					break;
		case 6:
					return;
		default:
					System.out.println("Invalid choice");
		}
		}while(true);
	}
}

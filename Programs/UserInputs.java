import java.util.Scanner;
class UserInputs
{
	public static void main(String[] args){
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter a value for Byte");
	 byte b = scan.nextByte();
	 	 System.out.println("Enter a value for Short");
	 short c = scan.nextShort();
	 	 System.out.println("Enter a value for Integer");
	 int d = scan.nextInt();
	 	 System.out.println("Enter a value for Long");
	 long e = scan.nextLong();
	 	 System.out.println("Enter a value for Float");
	 float f = scan.nextFloat();
	 	 System.out.println("Enter a value for Double");
	 double g = scan.nextDouble();
	 	 System.out.println("Enter a value for a single word");
	 String h = scan.next();
		 System.out.println("Enter a value for Character");
	 char i = scan.next().charAt(0);
	 scan.nextLine();
	 	 System.out.println("Enter a value for a sentence");
	 String j = scan.nextLine();
	 	 System.out.println("Enter a value for Boolean");
	 boolean k = scan.nextBoolean();
	}
}
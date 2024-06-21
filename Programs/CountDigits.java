import java.util.Scanner;
class CountDigits 
{
	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = scan.nextLong();
		int count = 0;
		while (n !=0)
		{
			n /= 10;
			count++;
		}
		System.out.println("Your number has " + count + " digits.");
	}
}

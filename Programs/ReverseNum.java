import java.util.Scanner;
class ReverseNum 
{
	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = scan.nextLong();
		long prod= 0;
		while (n !=0)
		{
			long digit = n % 10;
			prod = prod *10 + digit;
			n /= 10;
			
		}
		System.out.println("Reverse of given number is " + prod);
	}
}



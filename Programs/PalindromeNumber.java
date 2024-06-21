import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = scan.nextLong();
		long temp = n;
		long prod= 0;
		while (n !=0)
		{
			long digit = n % 10;
			prod = prod *10 + digit;
			n /= 10;
			
		}
		if(prod == temp){
			System.out.println("Given number " + temp + " is a palindrome number");
		}
		else{
			System.out.println("Given number " + temp + " is not a palindrome number");
		}
	}
}



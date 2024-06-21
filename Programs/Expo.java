import java.util.Scanner;
class Expo 
{
	int power(int base,  int exponent){
		int pow = 1;
		for (int i=exponent;i>=1 ;i--)
		{
			pow = pow * base;
		}
		return pow;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for base:  ");
		int base = s.nextInt();
		System.out.println("Enter the value for exponent:  ");
		int exponent = s.nextInt();
		Expo e = new Expo();
		int res = e.power(base,exponent);
		System.out.println(res);
	}
}

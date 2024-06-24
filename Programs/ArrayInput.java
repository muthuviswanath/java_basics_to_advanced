import java.util.Scanner;
class ArrayInput 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of values that you want to store in the array: ");
		int n  = scan.nextInt();

		// Creating an array using the new key word
		int[] lucky_numbers = new int[n];

		//To get the input for each and every element from the user
		for (int index=0;index <lucky_numbers.length ;index++ )
		{
			System.out.println("Enter the value for " + (index+1) + " element: ");
			lucky_numbers[index] = scan.nextInt();
		}

		// To print the array
		System.out.println("Values you stored: ");
		for(int ele:lucky_numbers){
			System.out.print(ele+" ");
		}
	}
}

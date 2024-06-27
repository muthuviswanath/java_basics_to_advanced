import java.util.Scanner;
class SortedArrays
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements to be stored in the array");
		int ele_count = scan.nextInt();
		int [] a = new int[ele_count];
		for (int i=0;i<ele_count ; i++)
		{
			a[i] = scan.nextInt();
		}
		ArrayOperations ar = new ArrayOperations();
	
		int[] farray = ar.sortArray(a);

}
}
class PrintSumProd
{
	public static void main(String[] args) 
	{
		int [] arr = {1,5,3,56,8,12,6,9};
		int sum = 0;
		int prod = 1;
		for (int i=0;i<arr.length ;i++ )
		{
			sum += arr[i];
			prod *= arr[i];
		}
		System.out.println("Sum of the elements in the array: "+ sum);
		System.out.println("Product of the elements in the array: "+ prod);
	}
}
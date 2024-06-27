class MDArrays 
{
	public static void main(String[] args) 
	{
		int ar[] = {12,23,34,45,56,67,78,89,90};

		//Syntax1:
		int [][] mat= {
									{1,2,3},
									{4,5,6},
									{7,8,9}
								};
		//Syntax 2:
		int [][] matrix= new int[4][4];
		matrix[0][0]= 34;
		matrix[0][1]= 35;
		matrix[0][2]= 36;
		matrix[0][3]= 37;
		matrix[1]= new int[]{1,2,3,4};
		matrix[2]= new int[]{1,2,3,4};
		matrix[3]= new int[]{1,2,3,4};
		System.out.println(mat.length);
		for (int row=0;row< mat.length;row++ )
		{
			for(int col=0;col<mat[row].length;col++){
				System.out.print(mat[row][col] +" "); // 1 2 3
			}
			System.out.println();
		}
System.out.println();
System.out.println("Second Matrix:");
		for (int row=0;row< matrix.length;row++ )
		{
			for(int col=0;col<matrix[row].length;col++){
				System.out.print(matrix[row][col] +" "); // 1 2 3
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
class MatrixDiagonals 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int rsize = s.nextInt();
		System.out.println("Enter the col size: ");
		int csize = s.nextInt();
		if(rsize != csize){
			System.out.println("Error! Cannot proceed as it is not a square matrix");
		}
		else{
			int [][]matrix= new int[rsize][csize];
			for(int i=0; i<matrix.length;i++){
				for(int j=0;j<matrix.length;j++){
					matrix[i][j] = s.nextInt();
				}
			}

			int primay_diagonal_sum = 0;
			int primay_diagonal_prod = 1;
			int secondary_diagonal_sum = 0;
			int secondary_diagonal_prod = 1;
			
			//Printing and calculating primary
			System.out.println("Primary Diagonals Info: ");
			for(int i=0;i<matrix.length; i++){
				primay_diagonal_sum += matrix[i][i];
				primay_diagonal_prod *= matrix[i][i];
				System.out.print(matrix[i][i]);
				if(i==matrix.length-1){
				System.out.print(" ");	
				}
				else{
					System.out.print(", ");	
				}
			}
			System.out.println();
			System.out.println("Primary Diagonal Sum: " + primay_diagonal_sum);
			System.out.println("Primary Diagonal Product: " + primay_diagonal_prod);			

//Printing and calculating primary
			System.out.println("Secondary Diagonals Info: ");
			for(int i=0;i<matrix.length; i++){
				for(int j=0; j<matrix.length; j++){
				if(i+j == matrix.length-1){
				secondary_diagonal_sum += matrix[i][j];
				secondary_diagonal_prod *= matrix[i][j];
				System.out.print(matrix[i][j]);
				if(i+j==matrix.length-1){
					if(i ==matrix.length-1){
					System.out.print(" ");			
					}
					else{
					System.out.print(", ");		
					}
				}
				}
				}
				
			}
			System.out.println();
			System.out.println("Secondary Diagonal Sum: " + secondary_diagonal_sum);
			System.out.println("Secondary Diagonal Product: " + secondary_diagonal_prod);			

		}
	}
}

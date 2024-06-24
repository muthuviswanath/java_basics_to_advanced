import java.util.Scanner;
class  InfinityStone
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("1. Do Something");
		System.out.println("2. Do Nothing");
		System.out.println("3. Exit");
		System.out.println("Enter your choice: ");
		int choice = scan.nextInt();
	/* 	if (choice == 1)
		{
		System.out.println("Doing Something");
		}
		else if(choice == 2)
			{
				System.out.println("Doing Nothing");
			}
		else if(choice==3){
		return;
		}
		else{
			System.out.println("Invalid choice");
		} */
		switch(choice){
			case 1:
				System.out.println("Doing Something");
				break;
			case 2:
				System.out.println("Doing Nothing");
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid Choice");
		}
		}while(true);
	}
}

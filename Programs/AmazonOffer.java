import java.util.Scanner; 
class	AmazonOffer	{ 
	public static	void main(String[] args) {	
		Scanner	scan = new Scanner(System.in); 
		System.out.println("Enter your gender (M/F): "); 
		char gender =	scan.next().charAt(0); 
		System.out.println("Enter your age: "); 
		int age =	scan.nextInt();
		if(age >=30	&& age <=50)
			{ 
				if(gender=='M' ||gender=='m')
					{ 
						System.out.println("You	will get flat 30% off"); 
					} 
				else if(gender=='F' ||gender=='f'){ 
						System.out.println("Are	you	working? [true or false]: "); 
						boolean 	is_working = scan.nextBoolean(); 
						if(is_working){ 
							System.out.println("You 	will get flat 40% off"); 
							} 
							else{ 
								System.out.println("You will get flat 35%	off"); 
								} 
						} 
					else{
						System.out.println("Invalid Gender");
					}
				} else{ System.out.println("Offer is	not	applicable for your age group.	");	
				} 
		}	
}

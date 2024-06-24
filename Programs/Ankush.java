class Ankush
{
	public static void main(String[] args){
		int [] a= {10,20,40,60,20,40,55,66,77,45,23};
		for (int i=a.length-1;i>=0;i-- )
		{
			System.out.println(a[i]);
		}

		outer:
		for(int i=1; i<=3;i++){
			inner:
			for (int j=1;j<=3 ;j++ )
			{
				if(j==2){
					break outer;}
				System.out.println(i + " " + j);
				
				}
			}
	}
}
/*
1 1



*/
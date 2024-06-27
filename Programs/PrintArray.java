class PrintArray 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,5,3,56,8,0,6,9};
		int max_index = arr.length-1;
		if(arr==null){
			System.out.println("null");
		}
		else{
			if(max_index==-1){
				System.out.println("[]");
			}
			else{
				System.out.print("[");
				for(int i=0;i<arr.length;i++){
					System.out.print(arr[i]);
					if(i == max_index){
						System.out.println("]");
					}
					else{
						System.out.print(" ,");
					}
					}
				}
			}
		}
	}
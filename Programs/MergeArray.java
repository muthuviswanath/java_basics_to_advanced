class MergeArray
{
	public static void main(String[] args) 
	{
		int [] arr_1 = {1,5,3,56,8,12,6,9};
		int [] arr_2 = {1,5,7,2,7,2,61,8,9};
		/*
		Direct Merging
		*/
		int [] result = new int[arr_1.length + arr_2.length];
		for (int i=0;i<result.length ;i++ )
		{
			if(i<arr_1.length){
			result[i] = arr_1[i];
			}
			else{
				result[i] = arr_2[i - arr_1.length];
			}
		}

		for(int ele:result){
			System.out.print(ele+" ");
		}
		/*
		Zigzag Merging
		*/
		
		/*
		Sort and Merging
		*/
	}
}
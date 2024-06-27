class ZigzagMergeArray
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5,6,7,8};
		int [] b = {11,22,44,33};
		int [] c = new int[a.length+b.length];
		int i=0, j=0, k=0;
		// value of i and j must be equal -> both the arrays will be iterated for common length of elements
/* while(i<a.length && j<b.length){
			c[k++] = a[i++];
			c[k++] = b[j++];
		}
		while(i<a.length){
			c[k++] = a[i++];
		}
		while(j<b.length){
			c[k++] = b[j++];
		} 
*/
for (;i<a.length && j<b.length ; i++,j++)
{
			c[k++] = a[i];
			c[k++] = b[j];
}
for (;i<a.length ; i++)
{
			c[k++] = a[i];
		
}
for (;j<b.length ; j++)
{
		c[k++] = b[j];
}

		for(int e: c){
			System.out.print(e+" ");
		}

		/*
		Zigzag Merging
		*/
		

	}
}
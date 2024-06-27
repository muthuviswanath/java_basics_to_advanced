class ArrayOperations 
{
	int[] sortArray(int a[]){
		int temp = 0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	void printArray(int a[]){
		System.out.print("[");
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]);
			if(i == a.length-1){
				System.out.print("]");
			}
			else{
			System.out.print(", ");
			}
		}
	}
}

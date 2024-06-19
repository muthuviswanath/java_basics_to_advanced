class  ReturnTypes
{
	void add(int a, int b){
		int c = a+b;
		System.out.println(c);
	}
	void sub(int a, int b){
		int c = a-b;
		System.out.println(c);
	}
	void mul(int a, int b){
		int c = a*b;
		System.out.println(c);
	}
	void div(int a, int b){
		if (b>0)
		{
		int c = a/b;
		System.out.println(c);
		}
		
	}
	void mod(int a, int b){
				if (b>0)
		{
		int c = a%b;
		System.out.println(c);
		}
	}

	public static void main(String[] args) 
	{
	ReturnTypes ref = new ReturnTypes();
	ref.add(10,20);
	ref.sub(10,20);
	ref.mul(10,20);
	ref.div(10,20);
	ref.mod(10,20);

	}
}

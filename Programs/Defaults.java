class Defaults 
{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	String i;
	public static void main(String[] args) 
	{
		Defaults def = new Defaults();
		System.out.println("Byte Default Value: " + def.a);System.out.println("Short Default Value: " + def.b);
		System.out.println("Integer Default Value: " + def.c);System.out.println("Long Default Value: " + def.d);
		System.out.println("Float Default Value: " + def.e);System.out.println("Double Default Value: " + def.f);
		System.out.println("Character Default Value: " + def.g);System.out.println("Boolean Default Value: " + def.h);
		System.out.println("String Default Value: " + def.i);
	}
}

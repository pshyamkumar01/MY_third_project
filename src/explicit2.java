
public class explicit2
{
	public static void main(String args[])
	{
		System.out.println("WELCOME TO EXPLICIT_CASTING");
		
		char c = 'z';
		short s = (short)c;
		
		byte b = (byte)s;
		System.out.println(b);
		
		double d = 120.245678;
		byte narrow = (byte)d;
		System.out.println(narrow);
	}
}

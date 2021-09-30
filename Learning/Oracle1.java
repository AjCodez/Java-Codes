//base super parent
class SunMicroSystem
{
	void JAVA()
	{
		System.out.println("java prog...");		
	}
	final void clang()
	{
		System.out.println(" C lang by SMS");
	}
}


class Google extends SunMicroSystem
{
	void Android()
	{
		System.out.println("Android app developer..");
	}
}
//derived sub child
class Oracle extends Google
{
	void DBMS()
	{
		System.out.println("sql...");
	}
	void clang(int a)
	{
		System.out.println(" C lang by Oracle");
	}
	public static void main(String args[])
	{
		Oracle obj = new Oracle();
		obj.clang(15);

	}
}
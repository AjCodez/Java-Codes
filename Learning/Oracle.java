//base super parent
class SunMicroSystem
{
	void JAVA()
	{
		System.out.println("java prog...");		
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
	
	public static void main(String args[])
	{
		Oracle obj = new Oracle();
		obj.DBMS();
		obj.JAVA();
		obj.Android();
	}
}
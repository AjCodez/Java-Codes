class swap
{
	public static void main(String args[])
	{
		int var1=Integer.parseInt(args[0]);
		int var2=Integer.parseInt(args[1]);

		System.out.println("---Original values---");
		System.out.println("value of var1="+var1);
		System.out.println("value of var2="+var2);

		int temp=var1;
		var1=var2;
		var2=temp;

		System.out.println("---values after swapping---");
		System.out.println("value of var1="+var1);
		System.out.println("value of var2="+var2);
	}
}
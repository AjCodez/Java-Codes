import java.util.Scanner;
class LoopSum
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++){
			int t=obj.nextInt();
			sum=sum+t;
		}
		System.out.println(sum);
		obj.close();
	}
}
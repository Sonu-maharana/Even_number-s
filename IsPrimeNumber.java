import java.util.Scanner;
class IsPrimeNumber
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count1 = 0;
		if (num==0)
		{
			System.out.println("number is 0:");
		}
		
		while(num!=0)
	   {
		int count = 0;
		for (int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count>2)
		{
			count1++;
			System.out.println("Enter another number: ");
		}
		else if (count==2)
		{
			System.out.println("Prime number: ");
		}
		num = sc.nextInt();
	  }
	  System.out.println(count1);
	}
}

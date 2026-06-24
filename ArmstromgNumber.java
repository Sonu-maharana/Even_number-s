import java.util.Scanner;
class ArmstromgNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		//Step-1: Count digit using while loop temp. 
		int temp = num;
		int count = 0;
		while (temp!=0)
		{
			count++;
			temp = temp/10;
		}
		//Step-2: take the last digit form temp.
		double sum = 0;
		temp = num;
		while (temp!=0)
		{
			int ld = temp%10;
			//Step-3: find the power of ld.
			double power = Math.pow(ld,count);
			//Sttep-4: add power to sum.
			sum = sum+power;
			//Step-5: remove the last digit from temp.
			temp = temp/10;
		}
		System.out.println(sum);
	}
}

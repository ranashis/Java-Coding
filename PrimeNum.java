import java.util.Scanner;
class PrimeNum
{
	public static void main (String args[])
	{
		int count=0;
		System.out.println("give me a number");
		Scanner input= new Scanner(System.in);
		int num = input.nextInt();
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
				count++;
		}
		if (count ==0)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("the number is not prime");
		}

	}
}




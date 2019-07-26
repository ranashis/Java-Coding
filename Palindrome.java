import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
	     System.out.println("enter a number");
                Scanner s=new Scanner (System.in);
                int num=s.nextInt();
                int rem;
                int rev=0;
                int temp=0;
                temp=num;
                while (temp!=0)
                {
                        rem=temp%10;
                        rev=rev*10+rem;
                        temp=temp/10;
                }   
                System.out.println("the reverse of the no. is "+ rev);
                
                if (rev==num)
                {
                    System.out.println("yes palindrome");
                }
                else
                {
                    System.out.println("sorry! not palindrome");
               }
                
            }
}

class Array
{
	public static void main (String args[])
	{
		int a[]={23,43,54,67,83,12,55,3};
		System.out.println("the array is:");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n the reverse array is:");
		for (int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}


	}
}


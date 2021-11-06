//2. Write a program to sum a series of numbers with Java recursion


class Sum
{
	int sum1=0;
	int i =1;
	int  sum(int n)
	{	
		if(i<=n)
		{
		sum1 = sum1+i;
		i++;
		sum(n);
		}
		//System.out.println(sum1);
		
		return sum1;
	}
	
}

	



class SumRecursion
{
	public static void main(String args[])
	{	
		Sum s = new Sum();
		System.out.println("Sum of recursion series is "+ s.sum(5));
		
	}
}
	
//1. Write a program to print a series of numbers with recursive Java methods
class Reverse 
{	
	int m;
	int i=0;
	void recNumber(int n)
	{
		if(i<=n)
		{	
		System.out.println(i);
		i++;
		recNumber(n);
		}
		else
		{
			return ;
		}
		
		
	}
}


class NumberRecursion
{
	public static void main(String args[])
	{
		Reverse R = new Reverse();
		R.recNumber(500);
	}
}
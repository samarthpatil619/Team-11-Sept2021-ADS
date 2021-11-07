import java.util.*;
class Recursion
{
	
	void table(int n , int i)
	{	
		if(i<=10)
		{
		int mult = n*i;
		System.out.println(n + "*" + i + "=" + mult);
		table(n,i+1);
		}
	}
	
}




class RecursionProblem2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Recursion R = new Recursion();
		R.table(n,1);
		
	}
}




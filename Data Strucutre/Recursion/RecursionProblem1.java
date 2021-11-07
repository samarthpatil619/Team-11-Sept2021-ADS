import java.util.*;

class Recursion
{
	
	float getSum(int i, int n, float s)
	{
		
		if(i>n)
			return s;
		
		else
			{
				if(i % 2 == 0)
					s -= (float)1 / i;
				else
					s += (float)1 / i;
				
			}
		return getSum(i+1,n,s);
		
		
		
	}
	
	
}



class RecursionProblem1
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Recursion r = new Recursion();
		
		double seriesSum= r.getSum(1,n,0);
		System.out.printf("%f", seriesSum);
		System.out.println(seriesSum);
		
	}
}
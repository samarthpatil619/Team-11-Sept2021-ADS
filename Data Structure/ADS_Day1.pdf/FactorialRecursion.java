//3. Write a program to calculate a factorial in Java with recursion
import java.util.*;
class Factorial
{
	int fact=1;
	int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*fact(n-1));
		
	}
}

class FactorialRecursion
{
	public static void main(String args[])
	{
		Factorial F = new Factorial();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial of number "+n+" is "+F.fact(n));
		
	}
}
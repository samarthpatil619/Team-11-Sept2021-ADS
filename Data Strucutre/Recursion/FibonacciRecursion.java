//Write a program to print the Fibonacci series with Java and recursion
//  0 1 1 2 3 5 8 13 21 34

import java.util.*;

class Fibonacci
{	
	static int n1=0,n2=1,n3=0;
	static void fiboSeries(int count)
	{
	if(count>0)
	{
	n3 = n1+n2;
	n1=n2;
	n2=n3;
	System.out.print(" "+n3);
	fiboSeries(count-1);
		}
	
	}
}

class FibonacciRecursion
{
	public static void main(String args[])
	{
		int n1=0;
		int n2=1;
		Fibonacci F = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n1+ " " +n2);
		F.fiboSeries(n-2);
	}
}
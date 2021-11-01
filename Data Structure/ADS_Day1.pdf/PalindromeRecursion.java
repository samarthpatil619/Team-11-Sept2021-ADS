//  5.Write a program to implement a recursive Java palindrome checker
// 151
import java.util.*;
class Palindrome
{
	
	int rev(int n , int temp)
	{
		if(n==0)
			return temp;
		
		
		temp = (temp*10)+(n%10);
		return rev(n/10,temp);
		
	}
	
}


class PalindromeRecursion
{
	public static void main(String args[])
	{
		
		Palindrome P = new Palindrome();
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		
		
		int num2 = P.rev(num1,0);
		
		if(num1 == num2)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
		
	}
}
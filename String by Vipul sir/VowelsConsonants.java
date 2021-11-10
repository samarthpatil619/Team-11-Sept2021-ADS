/*
1. Write a program which takes a string and prints the number of vowels, consonants(non-vowels).
 numbers and other characters.
Input: "Hello world 37 1!"
Output: Vowels: 3
 Consonants: 7
 Numbers: 2
 Others: 6
*/

class VowelsConsonants
{
	public static void main(String args[])
	{
		
		String str = "\"Hello world 37 1!\"";
		
		
		
		//Without using function
		char[] ch = new char[str.length()];
		for(int i = 0; i<str.length();i++)
		{
			ch[i] = str.charAt(i);
		}
		
		for(char c: ch)
		{
			System.out.println(c);
		}
		
		//Using function
		/* 
		char[] ch[i] = str.tocharArray();
		for(char c : ch[i])
		{
			System.out.println(c);
		}
		*/
		int vcount=0;
		int ccount=0;
		int ncount=0;
		int ocount=0;
		System.out.println();
		System.out.println();
		for(int i=0; i<str.length();i++)
		{
		 if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
		{
			vcount++;
		}
		else if((ch[i]>='a' && ch[i]<='z')|| (ch[i]>='A' && ch[i]<='Z'))
		{
			ccount++;
		}
		else if(ch[i]>='0' && ch[i]<='9')
		{	
			ncount++;
		}
		else
		{
			ocount++;
		
		}
		}
		
		String str2 = str.substring("[0-9]{2}");
		System.out.println(str2);
		
		/*String regex = "Hello";
		
		boolean matcher = str.matches(regex);
		System.out.println("Matches:"+matcher);
		*/
		
		/*
		ncount=0;
		for(int i=0; i<str.length();i++)
		{
		if(ch[i]>='0' && ch[i]<='9')
			if(ch[i+1]>='0' && ch[i+1]<='9')
				ncount;
		else
			ncount++;
		
		}
		*/
		
		System.out.println("Vowels:- "+vcount);
		System.out.println("Consonants:- "+ccount);
		System.out.println("Number:- "+ncount);
		System.out.println("Other:- "+ocount);
		
		
	}
}
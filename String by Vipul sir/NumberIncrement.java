

class NumberIncrement
{
	public static void main(String args[])
	{
			String str = "There are three bugs and nine features";
			String str2[] = str.split(" ");
			System.out.println("-----------Before------------");
			for(int i = 0 ; i<=str2.length-1;i++)
			{
			System.out.println(str2[i]);
			}
			
			String str3[] = {"zero" , "one" , "two" , "three" , "four", "five","six","seven","eight","nine","ten"};
			System.out.println("--------------After---------------");
			for(int i =0; i<=str2.length-1;i++)
			{
				for(int j =0 ; j<str3.length-1;j++)
				{
				if(str2[i].equals(str3[j]))
				{
					str2[i]=str3[j+1];
					break;
					
				}
					
				
				}
				
				System.out.print(" "+ str2[i]);
				
			}
			System.out.println();
			System.out.println(str2[2]);
			System.out.println(str3[3]);
			
			if(str2[2].equals(str3[3]))
				{
					System.out.println("Hello world");
					
				}
			
	}
}
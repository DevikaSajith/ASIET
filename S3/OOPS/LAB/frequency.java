//program to find the frequency of numbers in a string
//DEvika P Sajith
//Roll no:26
import java.util.*;
class frequency
{
	public static void main(String args[])
		{  
		   int count;
			Scanner S=new Scanner(System.in);
			System.out.println("enter the string");
			String sr;
			sr=S.nextLine();
			sr.toLowerCase();
			System.out.println("enter the character to check");
		   String c= S.nextLine();
		   int len=sr.length();
		   for(int i=0;i<len;i++)
		   {
		   	if(charAt(i).equals(c))
		   	{
		   	 
		   	
		   		count++;
		   	
		   	}
		   }
		   System.out.println("the frequency of character is"+count);
		   S.close();
		   }
}

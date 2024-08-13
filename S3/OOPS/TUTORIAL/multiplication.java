//program to print multiplication table
//Devika P Sajith
//Roll no:26
import java.util.*;
class multiplication
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number :");
		int n= S.nextInt();
		System.out.println("enter the range:");
		int m=S.nextInt();
		System.out.println("the multiplication table:");
		for(int i=0;i<=m;i++)
		{	
			System.out.println(n+"x"+i+"="+n*i);
		}
		S.close();
	}
}

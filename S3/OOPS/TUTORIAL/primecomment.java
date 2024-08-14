//program to find prime numbers numbers
//Devika P Sajith
//Roll no:26
class primecomment
{
	public static void main(String args[])
	{   int num,count=0;
		 num=Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
		   {   
			    if(i%j==0)
                {
                    count++;
                }
           }
                    if(count==2)
                    {
                        System.out.println("the prime numbers upto input is"+i);
                    
                    }
                    count=0;
                
		
		  
		
		
		
}
}
}
/*PS C:\Users\devik\javafiles> javac primecomment.java
PS C:\Users\devik\javafiles> java primecomment 100  
the prime numbers upto input is2
the prime numbers upto input is3
the prime numbers upto input is5
the prime numbers upto input is7
the prime numbers upto input is11
the prime numbers upto input is13
the prime numbers upto input is17
the prime numbers upto input is19
the prime numbers upto input is23
the prime numbers upto input is29
the prime numbers upto input is31
the prime numbers upto input is37
the prime numbers upto input is41
the prime numbers upto input is43
the prime numbers upto input is47
the prime numbers upto input is53
the prime numbers upto input is59
the prime numbers upto input is61
the prime numbers upto input is67
the prime numbers upto input is71
the prime numbers upto input is73
the prime numbers upto input is79
the prime numbers upto input is83
the prime numbers upto input is89
the prime numbers upto input is97
PS C:\Users\devik\javafiles>  */


			
			
			
			
		
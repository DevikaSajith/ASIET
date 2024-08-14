import java.util.*;
public class primeornot 
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int count=0;
        System.out.println("enter the number");
         int n=S.nextInt();
         for(int i=1;i<=n;i++)
         {
            if(n%i==0)
            {
                count++;

            
            }
            }
                if(count==2)
                {
                    System.out.println(n+"is a prime number");
                }
            
                count=0;
        
            
         
         S.close();


    }

}
    /* PS C:\Users\devik\javafiles> javac primeornot.java
PS C:\Users\devik\javafiles> java primeornot      
enter the number
37
37is a prime number
PS C:\Users\devik\javafiles> */


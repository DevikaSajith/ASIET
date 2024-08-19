import java.util.*;
class employee
{
	int age;
	long phonenumber;
	string name,address;
	float salary;
	int workexperience;

	void printsalary()
	{
		System.out.println("Salary:" +salary);
	}
class officer extends emplyoee
{
	String special;
	 void calculatesal()
{
		double basesalary=40000;
		if(special.equalsIgnoreCase("technical")){
				salary=basesalary+5000;
				}
		else if(special.equalsIgnoreCase("managerial")){
				salary=basesalaray+8000;
				}
		else
			{
					salary=basesalary;
			}
		salary+=workexperience*1500;
}
class print
{
	public static void main(String args[])
	{
		Scanner S =new Scanner(System.in)
	

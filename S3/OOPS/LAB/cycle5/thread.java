class BankAccount
{
	int balance=1000;
	public  synchronized void deposit(int amount)
	{
		balance+=amount;
		System.out.println("the new balance is"+balance);
	}
	public synchronized void withdraw(int amount)
	{
		if(balance>=amount)
			{
				balance-=amount;
			}
		else
		{
			System.out.println("print insuffient balance");
		}
	}
	public int balance()
	{
	return balance;
	}
}
  class AccountHolder extends Thread
{
	private BankAccount account;
	public AccountHolder(BankAccount account)
	{
		this.account=account;
	}
	public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(100);   // Deposit 100
            account.withdraw(200);  // Withdraw 200
        }
    }
}
	

 class main
{
	public static void main(String args[])
	{
		BankAccount sharedaccount=new BankAccount();
		AccountHolder holder1=new AccountHolder(sharedaccount);
		AccountHolder holder2=new AccountHolder(sharedaccount);
		holder1.setName("AccountHolder 1");
		holder2.setName("AccountHolder 2");
		holder1.start();
		holder2.start();
	}
}
	

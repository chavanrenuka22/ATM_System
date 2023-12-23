import java.util.Scanner;

public class ATMMain {

	static ATMOperationInterface a1=(ATMOperationInterface) new ATMImpl();
	
	public static void main(String[] args) {
	int userId=1234;
	int userPin=2209;
	
	System.out.println("----Welcome to ATM machine----");
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter userId:");
	int id=sc.nextInt();
	
	System.out.println("Enter userpin:");
	int pin=sc.nextInt();
	
	if((userId==id)&&(userPin==pin))
	{		
		while(true)
		{
			System.out.println("0:view balance");
			System.out.println("1.Deposit the amount");
			System.out.println("2.transfer the amount");
			System.out.println("3.withdraw the amount");
			System.out.println("4.show the transaction history");
			System.out.println("5.Collect your card");
			
			System.out.println("Enter the choice");
			
			int ch=sc.nextInt();
			if(ch==0)
			{
				a1.viewBalance();
			}
			if(ch==1)
			{
				System.out.println("Enter amount to deposit:");
				double depositAmount=sc.nextDouble();
				a1.depositAmount(depositAmount);
				a1.viewBalance();
				
			}
			else if(ch==2)
			{
			System.out.println("Transfer the amount:");
			double transferAmount=sc.nextDouble();
			a1.transferAmount(transferAmount);
			a1.viewBalance();
			}
			else if(ch==3)
			{
				System.out.println("Enter amount to withdraw ");
                double withdrawAmount=sc.nextDouble();
                a1.withdrawAmount(withdrawAmount);

			}
			else if(ch==4)
			{
				a1.showTransactionHistory();
				/*System.out.println("Show the transaction History");
				double transactionHistory=sc.nextDouble();
				System.out.println("Show transaction History"+transactionHistory);
				a1.viewBalance();*/
			}
			else if(ch==5)
			{
				System.out.println("please collect your card");
				
			}
		}
	}
	else
	{
		System.out.println("invalid..!  please insert correct details");
		System.exit(0);
	}
	}
}

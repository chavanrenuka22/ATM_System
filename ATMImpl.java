import java.util.HashMap;
import java.util.Map;

public class ATMImpl implements ATMOperationInterface
{
	AtmDetails ad=new AtmDetails();
	Map<Double ,String>m1=new HashMap<>();

	@Override
	public void viewBalance()
	{
		System.out.println("available balance is:"+ad.getBalance());
	
	}

	@Override
	public void depositAmount(double depositAmount) 
	{
		m1.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        ad.setBalance(ad.getBalance()+depositAmount);
        viewBalance();
	}

	@Override
	public void transferAmount(double transferAmount) 
	{
		System.out.println(transferAmount+ "transferred Successfully");
	}

	@Override
	public void withdrawAmount(double withdrawAmount) 
	{
		  if(withdrawAmount%500==0) 
		  {
	            if (withdrawAmount <= ad.getBalance())
	            {
	                m1.put(withdrawAmount, " Amount Withdrawn");
	                System.out.println("Collect the Cash " + withdrawAmount);
	                ad.setBalance(ad.getBalance() - withdrawAmount);
	                viewBalance();
	            } 
	            else 
	            {
	                System.out.println("Insufficient Balance !!");
	            }
	     }
	        else
	        {
	            System.out.println("Please enter the amount in multipal of 500");
	        }
	    }
	
	@Override
	public void showTransactionHistory() {
		
		for(Map.Entry<Double,String> m:m1.entrySet())
		{
            System.out.println(m.getKey()+""+m.getValue());
		}
	}
}

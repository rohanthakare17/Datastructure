public class ArrayTest {

	public static void main(String[] args) {
//		Account accArray[]=new Account[5];
		System.out.println("Begin main..");
		Account accObj =new Account(101, "Rohan",5000);
		System.out.println("accObj: "+accObj);	
		
		accObj.withdraw(400);
		System.out.println("accObj: "+accObj);	
				
		System.out.println("End main");

	}

}

class Account{
	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	
	public Account(int accountNumber, String accountHolderName, float accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	float withdraw(float amtToWithdraw) {
		accountBalance = accountBalance- amtToWithdraw;
		return accountBalance;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
	
}

/*
1. Function without argument and without return type
	without return				without argument
			|
			void clearScreen(void)
			{
			}
			
2. Function with argument but without return value
			
			void gotoThisLocation(float longitude, float latitude)
			 {
			 }
			 
3. Function with argument but without return value

			float calculateSimpleInterest(float principle, int numYears, float rate)
			{
			}
			
			
4. Function without argument but with return value

			double calculateDistanceBetweenTheEarthAndTheSun()
			{
				float speedOfLight=186000
			
		
		
*/


//knowledge-> apply it ->WISDOM
//the word->WATER <-is not actual WATER
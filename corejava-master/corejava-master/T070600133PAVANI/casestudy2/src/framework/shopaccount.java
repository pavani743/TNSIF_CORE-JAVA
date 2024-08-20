package framework;

//Abstract Class
public abstract class ShopAccount {
	private int accountNumber;
	private String accountName;
	private float charges;
	
	
	

	
	@Override
	public String toString() {
		return "ShopAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", charges=" + charges
				+ "]";
	}

	public ShopAccount(int accountNumber, String accountName, float charges) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.charges = charges;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	//abstract method 
	abstract public void bookProduct(float charges);

	public void items(float charges)
	{
		System.out.println(charges);
	}
	
	
}
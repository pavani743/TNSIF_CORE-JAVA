package framework;


public abstract class PrimeAccount extends ShopAccount {
	
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	  //constructor
	public PrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Account No:"+this.getAccountNumber()+","+"Account Name:"+this.getAccountName()+","
	+"Charges is:"+this.getCharges());
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
}
package application;



import Framework.PrimeAccount;

public class GSPrimeAccount extends PrimeAccount {

	public GSPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	
	}

	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}

}

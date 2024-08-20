package framework;


public abstract class ShopFactory {

	public abstract PrimeAccount getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAccount getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);
}
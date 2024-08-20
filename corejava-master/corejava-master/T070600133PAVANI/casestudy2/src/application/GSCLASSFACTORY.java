package application;

import Framework.NormalAccount;
import Framework.PrimeAccount;
import Framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAccount getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAccount p=new GSPrimeAccount(accNo,accNm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAccount getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAccount n=new GSNormalAccount(accNo,accNm,charges,deliveryCharges);
		return n;
	}

}

package application;

import Framework.NormalAccount;

public class GSNormalAccount extends NormalAccount {

	public GSNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAcc []";
	}

}
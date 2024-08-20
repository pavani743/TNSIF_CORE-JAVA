package framework;


public abstract class NormalAccount extends ShopAccount {
	private final float deliveryCharges;

	public NormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
		public void bookProduct(float charges)
		{
			System.out.println("Account No:"+this.getAccountNumber()+","+"Account Name:"+this.getAccountName()+","
		+"Charges is:"+charges+deliveryCharges);
		}
		
		@Override
		public String toString() {
			return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
		}
		
	}

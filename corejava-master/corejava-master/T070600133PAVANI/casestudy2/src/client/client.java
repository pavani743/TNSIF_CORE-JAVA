package client;

import Application.GSNormalAccount;
import Application.GSPrimeAccount;
import Application.GSShopFactory;
import Framework.NormalAccount;
import Framework.PrimeAccount;
import Framework.ShopFactory;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		System.out.println("*Welcome to Online Shopping App*");
				

		ShopFactory s=new GSShopFactory();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many prime account details you want to add?");
		int n = sc.nextInt();
		
		for(int i = 0;i< n;i++) {
			System.out.println("\n-----Enter prime account detail for user:"+(i+1)+"------\n");
			
			System.out.println("Enetr the account number");
			int accNo = sc.nextInt();
			
			System.out.println("Enetr the account name");
			String accName= sc.next();
			
			System.out.println("Enetr the account charges");
			float charges = sc.nextFloat();
			
			PrimeAccount p=new GSPrimeAccount(accNo, accName, charges, true);
			System.out.println("\n ****PRIME ACCOUNT DETAILS For User "+(i+1)+" *****");
			p.bookProduct(p.getCharges());
		
		}
		
		System.out.println("\n How many non-prime account details you want to add?");
		int nonPrimeAccs = sc.nextInt();
		
		for(int i = 0;i<nonPrimeAccs;i++) {
		
			System.out.println("\n------Enter non prime account details------\n");
			System.out.println("Enetr the account number");
			int accNo2 = sc.nextInt();
			
			System.out.println("Enetr the account name");
			String accName2= sc.next();
			
			System.out.println("Enetr the account charges");
			float charges2 = sc.nextFloat();
			
			System.out.println("Enetr the  delivery charges");
			float deliveryCharges = sc.nextFloat();
	
			NormalAccount noramlAcc=new GSNormalAccount(accNo2,accName2,charges2 , deliveryCharges );
	
			System.out.println("\n*NORMAL ACCOUNT DETAILS");
			noramlAcc.bookProduct(noramlAcc.getCharges());
		}



	}
	
}
package com.training.services;

import com.training.model.BankAccount;
public class BankAccountServices {
	
	public double calculateInterest(BankAccount shyam) {
		
		double simpleInterest =0.05;
		
		if(shyam.getAccountNumber(0) < 5000) {
			
			simpleInterest=0.06;
			
			
		}
		
		return shyam.getBalance()*2*simpleInterest;
		
	}
	public void calculateInterest(BankAccount[]accounts) {
		for(BankAccount eachAccount : accounts) {
			System.out.println(calculateInterest(eachAccount));
		}
	}
	public double[] findInterest(BankAccount[] accounts){
		double values[] =new double[6];
		
		int i =0;
		for(BankAccount  eachAccount : accounts) {
		values[i]	 = calculateInterest(eachAccount);
		i++;
			
		}
		return values;
	}
	private double calculateByAccountType(BankAccount account ,double rateofInterest) {
		return account.getBalance()*1*rateofInterest;
////		String type = account.getAccountTpe()
////				double rateofInterest=0.07;
//		if(type.equals("savings"))
//	}*/
	}
	
      double []findInterestByAccountType(BankAccount[]accounts){
	double[] values = new double[3];
	int i =0;
	for(BankAccount eachAccount : accounts) {
		
		String key = eachAccount.getAccountType();
		switch (key) {
		case "savings":
			values[i]= calculateByAccountType(eachAccount,0.05);
			break;
			
		case"fixed"	:
			values[i]= calculateByAccountType(eachAccount,0.07);
			break;
		case "recurring":
			values[i]= calculateByAccountType(eachAccount,0.07);
		    break;
		default:
			break;
		    
		}
		i++;
	}
	return values;
}
      
      
}

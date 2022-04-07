package com.training.services;


import com.training.model.BankAccount;
import com.training.services.BankAccountServices;
public class Application {
	
	public static void main(String[] args) {
		
		BankAccountServices service = new BankAccountServices();
		
		BankAccount ram = new BankAccount(1200,"ramesh",5000);
		
		double simpleInterest = service.calculateInterest(ram);
		
		System.out.println("Simple Interest :="+ simpleInterest);
		
		BankAccount shyam = new BankAccount(6200,"Rajesh",5000);
		
		double simpleInterest2 = service.calculateInterest(shyam);
		
		System.out.println("Simple Interest @5:="+simpleInterest2);
		
		BankAccount[] accounts= new BankAccount[2];
		
		accounts[0]=ram;
		accounts[1]=shyam;
		
		service.findInterest(accounts);
		
        BankAccount[] account1= new BankAccount[2];
		
		account1[0]=ram;
		account1[1]=shyam;
		
		service.calculateInterest(account1);
		
		System.out.println("--------------");
		double[] values = service.findInterest(account1);
		for(double eachValue : values)
		{
			System.out.println(eachValue);
		}
		BankAccount[] accountList = {
				new BankAccount(800,"jay",5000,"savings"),
				new BankAccount(801,"kam",6000,"fixed"),
				new BankAccount(802,"tom",7000,"recurring"),
		};
		
		double[] interestValues = service.findInterest(accountList);
		for(double eachvalue: interestValues) {
			System.out.println(eachvalue);
		}
		
	}
}



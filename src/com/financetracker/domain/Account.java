package com.financetracker.domain;

import java.math.BigDecimal;
import java.util.List;

public class Account {

	private List<Transaction> transactions;
	private Money balance;
	
	private Account() {
		
	}
	
	
	private void update() {
		Money updatedBalance = new Money(BigDecimal.ZERO);
		boolean edited = false;
		
		for(Transaction t : transactions) {
		    edited = edited || t.isEdited();	
		    updatedBalance = updatedBalance.add(t.getAmount());
		   
		}
		if(edited) {
			balance = updatedBalance;
			for(Transaction t : transactions) {
				t.cleanFlag();
			}
			
		}
		
	}
}

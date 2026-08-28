package com.financetracker.domain;

public class Category {
	  private Type type;
       private String name;
       public enum Type{
    	   EXPENSE, REVENUE
       }
       
       public Category(String name, Type type) {
    	    this.name = name;    
    	    this.type = type;
    	    }
       
       public boolean isExpense() {
    	   return type == Type.EXPENSE;
       }
}

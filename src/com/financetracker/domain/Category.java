package com.financetracker.domain;

public class Category {
	  private Type type;
       private String name;
       public enum Type{
    	   EXPENSE, REVENUE
       }
       
       public Category(String name, Type type) {
    	   if (name != null) {
    		   this.name = normalizeWord(name);    
    	   }else {
    		   throw new IllegalArgumentException("Nome inválido");
    	   }
    	    
    	    this.type = type;
    	    }
       
       public boolean isExpense() {
    	   return type == Type.EXPENSE;
       }
       private String normalizeWord(String word) {
    	   
    	   return name = word.substring(0, 1).toUpperCase() + word.substring(1);
       }
}

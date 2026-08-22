package com.financetracker.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
      private BigDecimal amount;
      
      public Money(BigDecimal value) {
    	  this.amount = normalizeScale(value);
      }
      public Money add(BigDecimal value) {
    	   return new Money(value.add(amount));
    	  
      }
      public Money subtract(BigDecimal value) {
    	   return new Money(value.subtract(amount));
      }
      private BigDecimal normalizeScale(BigDecimal value) {
    	    return amount = value.setScale(2, RoundingMode.HALF_UP);
      }
}

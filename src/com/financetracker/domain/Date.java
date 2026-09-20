package com.financetracker.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public record Date ( LocalDate date) {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      
      public Date {
    	  if(date == null) {
    		  throw new IllegalArgumentException("Data inválida, precisa ser diferente de nulo");
    	  }
      }
      
      public static Date createDate() {
    	  return new Date(LocalDate.now());
      }
      
      public Date changeDate(String newDate) {
    	   LocalDate changedDate = convertTextToDate(newDate);
    	   return new Date(changedDate);
      }
      
      private LocalDate convertTextToDate(String userDate) {
    	   if(userDate == null || userDate.trim().isEmpty()) {
    		   throw new IllegalArgumentException("Data digitada de forma errada ou data vazia");
    	   }
    	    try {
    	    	return LocalDate.parse(userDate, FORMATTER);
    	    }catch (DateTimeParseException e){
    	    	throw new IllegalArgumentException("Formato da data inválido");
    	    }
      }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.exception;

/**
 *
 * @author gusta
 */
public class BusinessException extends RuntimeException{
    	/**
	 * BusinessException represents an exception to business rules of the system.
	 * 
	 * @author jonatasfbastos
	 */
        public BusinessException() {
             super();
        }

         /**
          * Creates a new instance of the exception setting the message.
          * 
          * @param message the error message.
          */
         public BusinessException(final String message) {
             super(message);
         }
}

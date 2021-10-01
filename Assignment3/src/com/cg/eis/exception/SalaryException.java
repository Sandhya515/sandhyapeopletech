package com.cg.eis.exception;

public class SalaryException extends Exception{
		int salary;
		public SalaryException(int salary) {
			this.salary = salary;
		}
		public String toString() {
			return "\n Your salary is invalid : "+salary;
			
		}
	}
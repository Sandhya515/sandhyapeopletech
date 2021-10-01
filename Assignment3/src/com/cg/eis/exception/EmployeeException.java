package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException {
	public void Salary(int salary)throws SalaryException{
		if(salary<3000)
			throw new SalaryException(salary);
		else
			System.out.println("You are eligible for bank account");
	}
	public static void main(String[] args) {
		EmployeeException s = new EmployeeException ();
		try {
			s.Salary(1400);
		}catch(SalaryException e) {
			System.out.println(e);
		}
	}
}


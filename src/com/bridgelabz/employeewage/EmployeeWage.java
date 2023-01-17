package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	/*
	 * check Employee is present or Absent using random
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random(); // random object
		// input
		int wagePerHour = 20;
		int fullDayHours = 8;
		int salary = 0;

		/*
		 * will give 0 or 1 random number
		 */
		int randomNum = random.nextInt(2);

		/*
		 * condition for present or absent
		 */
		if (randomNum == 1) {
			System.out.println("Employee  is Present");
			salary = wagePerHour * fullDayHours;
		} else
			System.out.println("Employee  is Absent");
		System.out.println("salary is: " + salary);

	}

}
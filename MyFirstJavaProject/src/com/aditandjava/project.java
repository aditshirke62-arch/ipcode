package com.aditandjava;
   
import java.util.Scanner;
public class project {
  
	public static void main(String[]args) {
		//Employee report card....
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter employee Id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter employee salary :");
		double salary=sc.nextDouble();
		
		System.out.println("Enter overtime hours :");
		int hours=sc.nextInt();
		
		System.out.println("Enter performance rating....(1 to 5)");
		int rating=sc.nextInt();
		
		System.out.println("Enter number of leaves....");
		int leaves=sc.nextInt();
		
		System.out.println("Enter employee dept...");
		String dep=sc.next();
		
		 double overTimePayment=hours*2000;
		 
		
		double bonus=(rating>=4)? salary * 0.1 :salary *0.05;
		
		//15000
		double salaryDeduction=leaves*500;
		
		double finalSalary=salary;
		
		finalSalary+=bonus;
		
		finalSalary+=overTimePayment;
		
		finalSalary-=salaryDeduction;
		
		boolean isApplicableForReward=(rating>=5 && leaves<=1);
		
		String performance=(finalSalary>25000) ? "Good performance" : "Need improvement";
		
		System.out.println("\n----------Final Report Card--------");
		
		System.out.println("Employee Name : "+name);
		System.out.println("Employee ID n : "+id);
		System.out.println("Employee Dep  : "+dep);
		System.out.println("Base Salary   : "+salary);
		System.out.println("OverTime Pay  : "+overTimePayment);
		System.out.println("Deduction     : "+salaryDeduction);
		System.out.println("Final Salary  : "+finalSalary);
		System.out.println("performance   : "+performance);
 
		
		 
	}
}

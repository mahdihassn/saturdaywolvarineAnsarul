package com.upskill.java7;

public class Exception_tryCatcheFinale {

	public static void main(String[] args) {
		
		//built-in Exceptions - ArryIndexOutofBoundsException
		
		
		//note: I used try and catch  and finally blocked handle the java exception 
		try{
			int[]ageGroup = new int[]{25, 35, 32, 38, 50, 56};
			    System.out.println("Student Age = "+ageGroup[10]);
		}catch (Exception e){
			  System.out.println("Arry INdex not available !");
			  e.printStackTrace();
			
			
		}
		
		//specific Build in Exception - NumberFormateException
		try{
			int num = Integer.parseInt("Test");
			System.out.println("Value of num int = "+num);
		}catch (NumberFormatException e){
				System.out.println("please enter a valid number");
				e.printStackTrace();
				
			}
		
		// User - Defined Exception
		try{
			throw new myException("Test");
		}catch (myException e){
			System.out.println("User Defined Exception");
			e.printStackTrace();
		}
			finally{
				System.out.println("Test Exception Completed !");
			}
	}
	

}



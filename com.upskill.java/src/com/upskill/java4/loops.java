package com.upskill.java4;

public class loops {

	public static void main(String[] args) {
		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiniteLoop();
      practiceNestedForLoop();
	 multipicationTable();
		
	}
				
	public static void practiceForLoop(){
		int i;
		for(i=1; i<1000; i++){
			System.out.println("For Loops number="+i);
		}
	}
	 public static void practiceWhileLoop(){
	  int i =1;
	  while(i<100){
		  System.out.println("While Loops number="+i);
		  i++;
	  }
	 
  }
	 public static void practiceDoWhileLoop(){
		 int i = 1;
		 do {
			 System.out.println("Do While Loops numbers =" +i);
			 i++;
		    } while (i<=100);
       }
	 public static void practiceInfiniteLoop(){
		 int i;
		 for(i=1; ;i++){
			 System.out.println("Infinite Loops numbers =" +i);
			 i++;
			 
		 }
	 }
	 public static void decrementLoop(){
		 int i;
		 for(i=1; ;i--){
			 System.out.println("decrement Loops numbers =" +i);
			 i++;	
			 			 						 
		 }
	 }
	 public static void practiceNestedForLoop(){
		 int i;
		 int j;
		 for (i=1;i<=10;i++){
			 for (j=1;j<=10;j++){
				 System.out.println("Nested for Loops number=" +i + ":" + j);
				 				 
			 }
			 System.out.println("Increase value of i -> " +i);
			 
		 }
	 }
	  public static void multipicationTable(){
		  for (int row = 1; row <= 10; row++){
			  for (int col = 1; col <=10; col ++){
				  int table = row * col;
				  System.out.println(table +" ");
				  
			  }
			  System.out.println(" ");
		  }
	  }
	 
	 }


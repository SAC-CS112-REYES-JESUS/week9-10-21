package week9Lab;

import java.util.Random;
import java.util.Scanner;

public class Lab2 {

	
	
	public static void main(String[]args){
	
	int[] oddArray=new int[10];
	int[] evenArray=new int[10];
	int[] compArray=new int[10];
	int[] winArray=new int[10];
	int[] loseArray=new int[10];
	int even=0;
	int odd=0;
	int win =0;
	
	Random randomNumber = new Random();

	 
	for(int i=0;i < winArray.length;i++){
		 
		 int genNumber = randomNumber.nextInt(100);
		
	 System.out.println("Is the number between 0-99   odd(1) or even(2)?");
	 
	 Scanner input = new Scanner(System.in);
	 int choice = input.nextInt();

	  
	 System.out.printf("number is: %d\n", genNumber);
	 
	 compArray[i]= genNumber;//good comp number
	 
	  
	 //guess odd or eve
		 if((choice%2 ==0)){
			evenArray[i] = 1;
			even = 1+ even;
		 }
		 else{oddArray[i]= 1;
		 odd = odd+1;}
		 
		
		 
		 //guess correct
		 if(genNumber %2==0 && choice %2==0)
		 {
			 winArray[i] =2;
			 win= win+1;
			 System.out.println("Correct,even");
		 }
		 else if(!(genNumber %2==0) && !(choice %2==0))
		 {
			 System.out.println("Choose odd, correct,");
		 	winArray[i] =1;
		 	win= win+1;
		 }
		 else
			 System.out.println("sorry wrong");
		
			 
		 
		 
		  }
	 
	
	System.out.println("Remember 0: Wrong, 1: odd , 2: even");
	for(int i=0;i < winArray.length;i++){
	 System.out.printf("For %d round\nThe computer choose %d you guess %d\n",i+1,compArray[i],winArray[i]);
	 
	}
	 System.out.printf("You guessed even:%d, odd:%d, wins:%d", even,odd,win);
	
	
	}
	}






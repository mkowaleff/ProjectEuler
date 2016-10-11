//
//  Project Euler - Question 1
//
//  Created by Martin Kowaleff on 10/17/15.
//
//
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
//The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.


public class One {
	public static void main(String[] args){
		System.out.println(sumOfMultiplesOf3Or5Below(1000));
	}
	
	public static boolean isMultOf3(int n){
		return n%3==0;
	}
	
	public static boolean isMultOf5(int n){
		return n%5==0;
	}
	
	public static int sumOfMultiplesOf3Or5Below(int max){
		int sum = 0;
		for(int i=0; i<max;i++){
			if(isMultOf3(i)||isMultOf5(i)){
				sum+=i;
			}
		}
		return sum;
	}
}

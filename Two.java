//
//  Project Euler - Question 2
//
//  Created by Martin Kowaleff on 10/17/15.
//
//
//Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
//By starting with 1 and 2, the first 10 terms will be:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class Two {
	public static void main(String[] args){
		int limit = 4000000;
		System.out.println(sumOfEvenFibonacciBelow(limit));
	}
	
	public static int sumOfEvenFibonacciBelow(int limit){
		int sum = 0;
		int a = 1;
		int b = 1;
		int c = a+b;
		while(c<limit){
			sum+=c;
			a=b+c;
			b=c+a;
			c=a+b;
		}
		return sum;
	}
	
}

package com.minicode;

public class Demo {
	
	public static  int printFizzBuzz() {
		System.out.println("**************printFizzBuzz********************");
		int i;
		for(i=1;i<=100;i++) {
			if(i % 3 == 0) {
				if(i % 5 == 0) {
					System.out.println("FizzBuzz");
				}else {
					System.out.println("Fizz");
				}
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i+" ");
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("**************printFizzBuzz********************");
		Demo.printFizzBuzz();
	}

}

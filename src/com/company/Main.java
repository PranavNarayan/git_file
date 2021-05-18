package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
	// Takes integer as input the print it
        System.out.println("Hello World :)");
        Scanner sc = new Scanner(System.in);
        System.out.println("write a amount and rate of apple");
        int n = sc.nextInt();
        int r = sc.nextInt();
		apple a = new apple(r);
		System.out.println("total price of apple you have to pay "+ a.amount(n));
        System.out.println("The number is "+ n/2 +" + " + (n-n/2));

    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
	// Takes integer as input the print it
        System.out.println("Hello World :)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number is "+ n/2 +" + " + (n-n/2));

    }
}

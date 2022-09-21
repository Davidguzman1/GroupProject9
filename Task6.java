package com.syntax.projects;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		System.out.println("APPROACH1");

        Scanner scan =new Scanner(System.in);

        int a =scan.nextInt();
        int b =scan.nextInt();

        System.out.println("Numbers before swaping"+a+" "+b);

            a=b+a;
            b=a-b;
            a=a-b;

        System.out.println("Numbers after swaping"+a+" "+b);

	}

}

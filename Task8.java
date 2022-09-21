package com.syntax.projects;

public class Task8 {

	public static void main(String[] args) {
		 int a=0;
	        int b=1;
	        int c=0;

	        System.out.print(a+" ");

	        for(int i=1;i<10;i++) {
	            a=b;
	            b=c;
	            c=a+b;
	            System.out.print(c+" ");
	        }

	}

}

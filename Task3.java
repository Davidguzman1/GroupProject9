package com.syntax.projects;

public class Task3 {

	public static void main(String[] args) {
		 int[][] a = { {8,16,3},
	                {22,1,32},
	                {6,1,2}
	                        };
	    int sum=0;

	      for (int[] num:a) {
	         for (int n:num) {
	            sum+=n;
	  }
	  }
	     System.out.println("Total sum of all elements: "+sum);
	  }
	


	}





package com.bridgelabz;

import java.util.Scanner;

public class FindMinAndMaxNumInArray {
	 public int max(int[] array) {
		 int max = Integer.MIN_VALUE;
		 for (int i = 0; i < array.length; i++) {
			 if (array[i] > max) {
				 max = array[i];
			 }
		 }
		 return max;
	 }
	public int min(int[] array){
		int min = Integer.MAX_VALUE;
		for(int i=0;i< array.length;i++){
			if(array[i]<=min) {
				min = array[i];
			}
		}
		return min;
		 }

	public static void main(String[] args) {
		 int n;
		 Scanner input = new Scanner(System.in);
		System.out.println("Enter no of  Elements you want to take in Array: ");
		n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of Array");
		for (int i=0 ; i<n ;i++){
			array[i] = input.nextInt();
		}

		FindMinAndMaxNumInArray m =new  FindMinAndMaxNumInArray();
		System.out.println("Maximum value in the array : " + m.max(array));
		System.out.println("Minimun Value in the array : "+ m.min(array));
	 }

	}


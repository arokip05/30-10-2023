package org.sampleproject;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int first=0, second=1;
		for(int i=1;i<=100;i++) {
			if(first<=100) {
				int third=first+second;
				first=second;
				second=third;
				System.out.println(""+third);
			}
		}

	}

}

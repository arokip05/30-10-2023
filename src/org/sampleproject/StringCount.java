package org.sampleproject;

public class StringCount {

	public static void main(String[] args) {
		String str="jA2v#4.,";
		int capscount=0;
		int smallcount=0;
		int numbercount=0;
		int specialcount=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				capscount++;
			}
			else if(Character.isLowerCase(c)) {
				smallcount++;
			}
			else if(Character.isDigit(c)) {
				numbercount++;
			}
			else {
				specialcount++;
			}
			}
			System.out.println(capscount+","+smallcount+","+numbercount+","+specialcount);
		

	}

}

package com.numseq;

public class CheckNumberSeq {
	
//	0123456789 valid
//	012345678a invalid
//	0123a56789 invalid
//	01234" " valid
//	012345678" " valid
//	01234567" " valid
//	" "12345 invalid
//	1234" "678 invalid
//	123" "4" "5678 invalid 
	
	public static void main(String[] args) {
		String strings[] = {"0123456789",
				"012345678a",
				"0123a56789",
				"01234 ",
				"012345678 ",
				"01234567 "," 12345", 
				"1234 678", 
				"123 4 5678"};
		for(String i : strings) {
			String newString = i.trim();
			char[] characters = newString.toCharArray();
			int counter = 0;
			String flag = "valid";
			for(char c: characters) {
				if(c == ' ')
					continue;
				try {
					int myint = Integer.parseInt(Character.toString(c));
					if(myint==counter) {
						counter++;
						continue;
					}
					else {
						flag = "invalid";
					}
						
				}
				catch(Exception exp) {
					flag = "invalid";
				}
			}
			System.out.println(i + " -- " + flag);
		}
	}

}

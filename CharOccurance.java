package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		char[] charArray = str.toCharArray();
		int val =charArray.length;
		int count=0;
		for (int i = 0; i < val; i++) {
			
				if (charArray[i] == 'e') {
					count++;
					
				}
			}
		System.out.println("'e' in the string:"+count);
	}

}
/*//Check number of occurrences of a char (eg 'e') in a String

			String str = "welcome to chennai";

			// declare and initialize a variable count to store the number of occurrences
			
			// convert the string into char array
				
			//get the length of the array
				
			// traverse from 0 till the array length 
				
				// Check the char array has the particular char in it 
			
				// if is has increment the count
					 
				
				// print the count out of the loop*/
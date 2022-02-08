import java.io.*;

class pro4{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//Taking the input
		System.out.println("Enter a string");
		String s1 = br.readLine();

		int cChar = 0, cUpper = 0, cLower = 0, cDigits = 0, cSpace = 0, cSpecial = 0;

		//Looping through the string
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			//Checking whether the char is upper, lower, digit or special
			if(Character.isUpperCase(ch))
				cUpper++;
			else if(Character.isLowerCase(ch))
				cLower++;
			else if(Character.isDigit(ch))
				cDigits++;
			else if(Character.isWhitespace(ch))
				cSpace++;
			else
				cSpecial++;
		}

		cChar = s1.length();

		System.out.println("Character "+cChar);
        System.out.println("UpperCase "+cUpper);
		System.out.println("LowerCase "+cLower);
		System.out.println("Digits "+cDigits);
		System.out.println("Special characters "+cSpecial);
		System.out.println("WhiteSpace "+cSpace);
	}
}

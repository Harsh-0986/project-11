import java.io.*;

class pro3{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//Taking the input
		System.out.println("Enter a string");
		String s1 = br.readLine();

		String s = "";

		//Looping through the entire string	
		for (int i = 0; i < s1.length(); i++) {
			//Extracting the character
			char ch = s1.charAt(i);

			//Toggle the case
			if(Character.isUpperCase(ch))
				ch = Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else
				ch = ch;

			s = s + ch;
		}

		//Printing the output
        System.out.println(s);
	}
}

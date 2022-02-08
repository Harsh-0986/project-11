import java.io.*;

class pro5{

	// Creating helper function "reverse"
	void reverse(String s2) {
		String s = "";
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			//Reversing the string 
			s = c + s;
		}
		System.out.print(s + "\t");
	}

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//Taking the input
		System.out.println("Enter a string");
		String s1 = br.readLine();

		pro5 obj = new pro5();

		//Converting the string to UpperCase
		s1 = s1.toUpperCase();
		s1 = s1 + " ";
		String str2 = "";

		//Looping through the entire string
		for (int i = 0; i < s1.length(); i++) {
			//Extracting the character
			char ch = s1.charAt(i);

			if(Character.isWhitespace(ch)) {
				//Calling helper function
				obj.reverse(str2);
				str2 = "";
			} else {
				str2 = str2 + ch;
			}
		}
	}
}

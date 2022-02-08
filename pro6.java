import java.io.*;

class pro6 {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//Taking the input
		System.out.println("Enter a string");
		String s1 = br.readLine();
		s1 = s1 + " ";
		s1 = s1.toUpperCase();

		String s2 = "";

		//Looping through the entire string
		for (int i = 0; i < s1.length(); i++) {
			//Extracting the character
			char ch = s1.charAt(i);

			//Printing the output
			if(Character.isWhitespace(ch)){
				System.out.println(s2 + " - " + s2.length());
				s2 = "";
			} else {
				s2 = s2 + ch;
			}
		}
	}
}

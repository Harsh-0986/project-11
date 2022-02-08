import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pro7 {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//Taking the input
		System.out.println("Enter a string");
		String s1 = br.readLine();
		s1 = s1.toLowerCase();

		String s2 = "" + s1.charAt(0);
		s2 = s2.toUpperCase();

		//Looping through the entire string
		for (int i = 0; i < s1.length(); i++) {
			//Extracting each character
			char ch = s1.charAt(i);

			//Coverting first letter to Uppercase
			if(ch == ' ')
				s2 = (s2 + s1.charAt(i+1)).toUpperCase();
		}

		//Printing the output
		System.out.println(s2);
	}
}

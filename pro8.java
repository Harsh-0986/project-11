import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pro8 {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//Taking the input
		System.out.println("Enter a string");
		String s1 = br.readLine();
		s1 = s1.toUpperCase();

		String s2 = "";
		s1 = s1 + " ";

		//Looping through the entire string
		for (int i = 0; i < s1.length(); i++) {
			//Extracting each character
			char ch = s1.charAt(i);

			//Checking whether s2 starts with vowel
			if(ch == ' ') {
				char ch1 = s2.charAt(0);
				if(ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U')
					System.out.print(s2 + " ");
				s2 = "";
			} else {
				s2 = s2 + ch;
			}
		}
	}
}

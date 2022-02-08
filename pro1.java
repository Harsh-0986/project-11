import java.io.*;

class pro1{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//Taking the input
		System.out.println("Enter a string");
		String s1 = br.readLine();

		int c = 0;

		//Looping through the whole string
		for (int i = 0; i < s1.length(); i++) {
			//Extracting the character
			char ch = s1.charAt(i);

			//Checking if ch == p
			if(ch == 'p')
				c++;
		}

		//Printing the output
		System.out.println("Frequency of p is: "+c);
	}
}

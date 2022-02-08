import java.io.*;

class pro2{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//Taking the input
		System.out.println("Enter a string in uppercase");
		String s1 = br.readLine();
		String s = "";

		//Looping through the whole string to replace 'A'
		for(int i = 0; i < s1.length(); i++){
			//Extracting the character
			char ch = s1.charAt(i);

			//Replacing the character A by *
			if(ch == 'A')
				s = s + '*';
			else
				s = s + ch;
		}

		//Printing the output
		System.out.println(s);
	}
}

package Day7;
import java.io.*;
public class File3PW {
	public static void main(String args[])throws IOException {
		
		BufferedReader in;String S;
		PrintWriter op=null;
		try {
			in=new BufferedReader(new InputStreamReader(System.in));
			op=new PrintWriter(new FileWriter("D:\\File-Java\\output1.txt"));
			System.out.println("Enter The Texts:");
			S=in.readLine();
			op.write(S);
			op.close();
		}
	catch(FileNotFoundException e) {
		System.out.println("File Not FOund"+e.getMessage());
	}
	}

}

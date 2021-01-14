import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLWriting {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Java Lectures\\FileWriting\\Deepu.html");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("<html><body><title>Way2Automation</title><h1>testing is key to Future</h1></body></html>");
		
		bw.close();
	}

}

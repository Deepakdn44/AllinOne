import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		// Stream Connectivity
		File f = new File("E:\\Java Lectures\\FileWriting\\Deepu.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//Writing inside the file
		bw.newLine();
		bw.write("I");
		bw.newLine();
		bw.write("Love");
		bw.newLine();
		bw.write("India");
		
		//Closing Stream
		bw.close();
		
		System.out.println("File Created");
		
		
	}

}

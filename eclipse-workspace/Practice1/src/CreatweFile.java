import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreatweFile {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Java Lectures\\FileWriting\\practice.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hey");
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.write("How r u");
		bw.newLine();
		
		bw.close();
	}

}

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCSVFile {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Java Lectures\\FileWriting\\practice.csv");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int num = (int)(Math.random()*100);
				bw.write(num+",");
			}
			bw.newLine();
		}
		bw.close();
		System.out.println("File Created!!!");
		
	}

}

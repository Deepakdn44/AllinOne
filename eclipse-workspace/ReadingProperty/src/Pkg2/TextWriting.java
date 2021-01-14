package Pkg2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriting {
	
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\SANJU\\deepu.csv");
		FileWriter fw = new FileWriter(f, false);
		BufferedWriter writer = new BufferedWriter(fw);
		/*writer.newLine();
		writer.write("Hi Deepu");
		writer.newLine();
		writer.write("Belive in you");
		writer.close();*/
		
		for (int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				int num = (int) (Math.random()*100);
				writer.write(num +",");
			}
			writer.newLine();
		}
		writer.close();
		System.out.println("File created");
		FileReader reader = new FileReader(f);
		BufferedReader br = new BufferedReader(reader);
		String str = null;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}

}

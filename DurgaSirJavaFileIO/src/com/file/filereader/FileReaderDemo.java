package com.file.filereader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("abcd.txt");
		
		fw.write(108);
		fw.write("\n\nHello world");
		char[] cbuf = {'t','h','i','s'};
		fw.write(cbuf);
		fw.write(cbuf, 2, 2);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine();
		bw.write("This is from the Buffered Writer");
		
		bw.flush();
		bw.close();
	}

}

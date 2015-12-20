package com.file.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/*
 * We use FileWriter to write character data to the file. 
 * 
 * Constructors: 
 * 
 * 
 */

public class FileWriterClass {

	public static void main(String[] args) throws IOException {

		/*
		 * The below constructors by default override the existing data.
		 * 
		 * FileWriter fw = new FileWriter(File file); 
		 * FileWriter fw = new FileWriter(String file);
		 * 
		 * The below constructors helps to append to the existing data.
		 * 
		 * FileWriter fw = new FileWriter(File file, boolean append); 
		 * FileWriter fw = new FileWriter(String file, boolean append);
		 */
		
		FileWriter fw = new FileWriter("abcd.txt");
		fw.write("Hello World");
		fw.flush();
		fw.close();
		fw.write("Error should occur");

	}

}

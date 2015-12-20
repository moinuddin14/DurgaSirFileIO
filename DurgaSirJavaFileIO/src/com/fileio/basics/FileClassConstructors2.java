package com.fileio.basics;

import java.io.File;
import java.io.IOException;

/*
 * File f = new File("name"); The above creates a Java File Object to
 * represent name of the file or directory in current working directory.
 */

/*
 * File f = new File(String subDirectoryName, String Name); File f = new
 * File(File SubDir, String Name);
 * 
 * The above creates a Java File Object to represent name of the file or
 * directory present in specified sub directory.
 */

public class FileClassConstructors2 {

	public static void main(String[] args) throws IOException {

		int count = 0;
		File f = new File("C:\\Users\\moinu");
		String[] flists = f.list();
		for (String flist : flists) {
			// System.out.println(flist);
			File f1 = new File(f, flist);
			if (!f1.isDirectory()) {
				System.out.println(f1.getName());
				count++;
				if(f1.getName().equalsIgnoreCase("NTUSER.DAT")){
					System.out.println("The length of the file is: "+f1.length());
				}
			}
		}
		System.out.println(count);
	}
}
package com.fileio.basics;

import java.io.File;
import java.io.IOException;

public class FileIOBasics1 {

	public static void main(String[] args) throws IOException {

		File f = new File("abc.txt");
		/*
		 * The above line won't create any physical file. First it will check if
		 * there is any physical file named with abc.txt is available or not. If
		 * it is available then f simply refers that file. If it is not
		 * available then we are just creating Java file object to represent the
		 * name abc.txt
		 * 
		 * Java File Object is used to represent both file and directory as
		 * Java's File IO is defined on Unix. In Unix everything is treated as a
		 * file (i.e., both files and directories), Java File IO concept is
		 * implemented based on Unix OS. Hence, Java File Object can be used to
		 * represent both files and directories.
		 *
		 */
		f.delete();
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());

		f = new File("test");
		f.delete();
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());

	}

}

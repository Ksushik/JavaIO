package com.skillsup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by osyniaeva on 9/11/17.
 */
public class CopyFileExample {
	public static void main(String[] args) {
		InputStream instream = null;
		OutputStream outstream = null;

		try {
			File infile = new File("MyInputFile.txt");
			File outfile = new File("MyOutputFile.txt");

			instream = new FileInputStream(infile);
			outstream = new FileOutputStream(outfile);

			byte[] buffer = new byte[1024];

			int length;
		    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
			while ((length = instream.read(buffer)) > 0) {
				outstream.write(buffer, 0, length);
			}

			//Closing the input/output file streams
			instream.close();
			outstream.close();

			System.out.println("File copied successfully!!");

		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}

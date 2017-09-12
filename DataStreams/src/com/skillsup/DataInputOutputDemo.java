package com.skillsup;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by osyniaeva on 9/11/17.
 */
public class DataInputOutputDemo {
	public static void main(String args[])throws IOException {

		// writing string to a file encoded as modified UTF-8
		DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("myfile.txt"));
		dataOut.writeUTF("hello");

		// Reading data from the same file
		DataInputStream dataIn = new DataInputStream(new FileInputStream("myfile.txt"));

		while(dataIn.available()>0) {
			String k = dataIn.readUTF();
			System.out.print(k+" ");
		}
	}
}

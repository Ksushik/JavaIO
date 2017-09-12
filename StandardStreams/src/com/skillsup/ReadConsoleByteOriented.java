package com.skillsup;

import java.io.IOException;

/**
 * Created by osyniaeva on 9/12/17.
 */
public class ReadConsoleByteOriented {
	public static void main(String[] args) {
		while (true) {
			try {
				int read = System.in.read();
				System.out.println(read);
				if (read == 113) {
					break;
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

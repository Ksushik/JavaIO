package com.skillsup.file;

import java.io.File;

/**
 * Created by osyniaeva on 9/11/17.
 */
public class CreateDirectoryExample {

	public static void main(String[] args) {

		File file = new File("Directory1");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}

		File files = new File("Directory2\\Sub2\\Sub-Sub2");
		if (!files.exists()) {
			if (files.mkdirs()) {
				System.out.println("Multiple directories are created!");
			} else {
				System.out.println("Failed to create multiple directories!");
			}
		}

	}
}

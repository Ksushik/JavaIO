package com.skillsup.file;

import java.io.File;

/**
 * Created by osyniaeva on 9/11/17.
 */
public class DeleteFileExample {
	public static void main(String[] args) {
		try {

			File file = new File("file_for_deleting.txt");

			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete operation is failed.");
			}

		}
		catch (Exception e) {

			e.printStackTrace();

		}

	}
}

package com.skillsup.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by osyniaeva on 9/11/17.
 */
public class WriteObjectManager {

	public void serializeAddress(Address address) {

		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		try {

			fout = new FileOutputStream("address.ser");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(address);

			System.out.println("Done");

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public void serializeAddressJDK7(Address address) {

		try (ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("c:\\temp\\address2.ser"))) {

			oos.writeObject(address);
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}

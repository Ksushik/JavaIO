package com.skillsup;

import java.util.Scanner;

/**
 * Created by osyniaeva on 9/12/17.
 */
public class ReadConsoleByScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String next = scanner.next();
			System.out.println(next);
		}
	}
}

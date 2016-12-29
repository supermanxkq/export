package com.xukaiqiang.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadJsonUtil {

	public static String readJson(String fullFileName) {
		File file = new File(fullFileName);
		Scanner scanner = null;
		StringBuilder buffer = new StringBuilder();
		try {
			scanner = new Scanner(file, "utf-8");
			while (scanner.hasNextLine()) {
				buffer.append(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		return buffer.toString();
	}
}

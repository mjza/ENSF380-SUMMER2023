/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.ensf409;

import java.util.*;
import java.io.*;

public class MyClass {
	public static void main(String[] args) {
		Formatter output = null;
		// Opens the stream
		try {
			output = new Formatter("out.txt");
		}
		catch (SecurityException e) {
			System.err.println("You do not have access to write the file.");
			System.exit(1);
		}
		catch (FileNotFoundException e) {
			System.err.println("Error creating file.");
			System.exit(1);
		}
		// Writes to file
		try {
			output.format("%d %s%n", 800, "Eight hundred");
		}
		catch (FormatterClosedException e) {
			System.err.println("Error writing to file");
		}		
		output.close();
		System.out.println("Please check the out.txt for results.");
	}
}

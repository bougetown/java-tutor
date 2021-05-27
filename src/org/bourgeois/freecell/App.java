package org.bourgeois.freecell;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.Readable;


/**
 * By providing a Readable that gets it's values from a file,
 * scan.nextLine() provides the contents of that file, line by 
 * line.
 */
public class App {
	
	public static void main(String[] args) throws FileNotFoundException {
		Readable reader = new FileReader(new File("gameplay.txt"));
		Scanner scan = new Scanner(reader);
		
		System.out.println(scan.nextLine());
		
		// You can also get the value
		String s2 = scan.nextLine();
		System.out.println(s2);
		
		System.out.println(scan.nextLine());
	}
};
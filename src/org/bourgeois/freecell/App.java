package org.bourgeois.freecell;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.Readable;


/**
 * By providing a Readable that gets it's values from a file,
 * scan.nextLine() provides the contents of that file, line by 
 * line.  I suspect the prescriptive nature of the assignment
 * is to satisfy the unit test framework.
 */
public class App {
	
	public static void main(String[] args) throws FileNotFoundException {
		// Reads from the gameplay.txt file located in the root of
		// project.
		Readable reader = new FileReader(new File("gameplay.txt"));
		Scanner scan = new Scanner(reader);
		
		System.out.println(scan.nextLine());
		
		// You can also get the value
		String s2 = scan.nextLine();
		System.out.println(s2);
		
		System.out.println(scan.nextLine());
	}
	
	
	/**
	 * I'd be interested in test feedback before we pursue this, but FilterWriter
	 * implements Appendable, and allows you to filter what goes out.  We could 
	 * use this to only write the last gamestate.
	 * 
	 * The renderBoard method transmits the state of the freecell board to a 
	 * specified destination (that depends on the implementation of this
	 * interface)
	 * 
	 * https://docs.oracle.com/javase/7/docs/api/java/io/FilterWriter.html
	 */
	private void appendSample() {
		
	}
};
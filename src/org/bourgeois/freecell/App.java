package org.bourgeois.freecell;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Readable;


/**
 * By providing a Readable that gets it's values from a file,
 * scan.nextLine() provides the contents of that file, line by 
 * line.  I suspect the prescriptive nature of the assignment
 * is to satisfy the unit test framework.
 */
public class App {
	
	/**
	 * IDEA: Add gamePlay data to text files and create a unit test for 
	 * each that feeds in the file and validates game state and 
	 * exception handling.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// Reads from the gameplay.txt file located in the root of
		// project.
		Readable reader = new FileReader(new File("gameplay.txt"));
		Scanner scan = new Scanner(reader);
		
		System.out.println(scan.nextLine());
		
		// You can also get the value
		String s2 = scan.nextLine();
		System.out.println(s2);
		
		System.out.println(scan.nextLine());
		
		App app = new App();
		app.appendSample();
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
	 * 
	 * Leaning toward just using StringBuiler, I think you are already using 
	 * that?  And maybe just add a condition to show all of it, or a prettyPrint
	 * that only shows the last game data, based on if the Readable was provided 
	 * or not?
	 * @throws IOException 
	 * 
	 */
	private void appendSample() throws IOException {
		Appendable sb = new StringBuilder();
		sb.append("Hello ").append("World").append("******").append("How is your day going?");
		
		// Insert a separator between game states so you can find the 
		// last one.  Below prints just the last string appended.
		int lastState = ((StringBuilder) sb).lastIndexOf("******");
		System.out.println(((StringBuilder) sb).substring(lastState + 6));
		
	}
}
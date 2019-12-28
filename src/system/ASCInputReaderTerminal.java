package system;

import java.util.Scanner;
/*
 * Might actually be a mistake since user is gonna call things as args so yeah
 * 
 */
public class ASCInputReaderTerminal implements ASCInputReader {

	//Read the line from terminal if exist (wait for something to be written)
	@Override
	public String read() 
	{
		String res = "";
		Scanner scan = new Scanner(System.in);
		
		if (scan.hasNextLine())
			res = scan.nextLine();
		
		return res;
		

	}

}

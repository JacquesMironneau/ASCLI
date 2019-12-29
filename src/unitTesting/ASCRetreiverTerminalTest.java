package unitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import exception.UserInputException;
import system.controller.ressources.ASCAction;
import system.controller.ressources.ASCCommand;
import system.controller.ressources.ASCStringRetreiver;
import system.controller.ressources.ASCStringRetreiverTerminal;

class ASCRetreiverTerminalTest
{

	@Test
	void test()
	{
		String input = "play Let it be";
		ASCStringRetreiver sr = new ASCStringRetreiverTerminal();
		ASCCommand res = null;
		try
		{
			res = sr.retreive(input);
			res = sr.retreive("play ez4ence");
		} catch (UserInputException e)
		{
			e.printStackTrace();
		}
		
		testAction(res, "ez4ence", ASCAction.PLAY);
		
		//fail("Not yet implemented");
	}
	
	private void testAction(ASCCommand c, String expected, ASCAction action)
	{
		assertEquals(ASCAction.PLAY, c.getAction());
		assertEquals(expected, c.getParameter());
	}

}

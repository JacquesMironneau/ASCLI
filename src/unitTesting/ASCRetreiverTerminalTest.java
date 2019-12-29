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
			testAction(res, "Let it be", ASCAction.PLAY);
			
			res = sr.retreive("play ez4ence");
			testAction(res, "ez4ence", ASCAction.PLAY);
			
			res = sr.retreive("add ez4ence");
			testAction(res, "ez4ence", ASCAction.ADD);
			
			res = sr.retreive("pause ez4ence");
			testAction(res, "ez4ence", ASCAction.PAUSE);
			
			res = sr.retreive("skip ez4ence");
			testAction(res, "ez4ence", ASCAction.SKIP);	

			res = sr.retreive("skip");
			testAction(res, "", ASCAction.SKIP);
			

			res = sr.retreive("skip ez4ence winlandia");
			testAction(res, "ez4ence winlandia", ASCAction.SKIP);
			
			res = sr.retreive("np");
			testAction(res, "", ASCAction.NOW_PLAYING);
			
			
		} catch (UserInputException e)
		{
			e.printStackTrace();
		}
		
		//fail("Not yet implemented");
	}
	
	private void testAction(ASCCommand c, String expected, ASCAction action)
	{
		assertEquals(action, c.getAction());
		assertEquals(expected, c.getParameter());
	}

}

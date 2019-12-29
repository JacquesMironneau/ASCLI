package system.controller.ressources;

import exception.UserInputException;

/*
 * For instance
 * asc play Despacito
 * Play will be the action and despacito the music
 * so arg[1] will be play here since asc will be the launcher
 */
public class ASCStringRetreiverTerminal implements ASCStringRetreiver
{

	@Override
	public ASCCommand retreive(String toRetreive) throws UserInputException 
	{
		String tmp[] = toRetreive.split(" ");
		if (tmp.length < 2) throw new UserInputException();
		
		//Creating the string of parameters (for instance with title that are several words:
		//Let it be => only one string
		
		StringBuilder builder = new StringBuilder();
		int i;
		for (i = 1; i < tmp.length; ++i)
			builder.append(tmp[i]+" ");

		builder.deleteCharAt(builder.length() - 1);
		
		
		return new ASCCommand(matchInputParameterWithExistingAction(tmp[0]),builder.toString());
	}
	
	
	private ASCAction matchInputParameterWithExistingAction(String parameter) throws UserInputException
	{
		for (ASCAction currentAction : ASCAction.values())
			if (currentAction.getParam().equals(parameter))
				return currentAction;
		
		throw new UserInputException();
		
	}

}

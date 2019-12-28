package system;


/*
 * For instance
 * asc play Despacito
 * Play will be the action and despacito the music
 * so arg[1] will be play here since asc will be the launcher
 */
public class ASCStringRetreiverTerminal implements ASCStringRetreiver
{

	@Override
	public ASCCommand retreive(String toRetreive) throws ErrorInUserInput 
	{
		String tmp[] = toRetreive.split(" ");
		if (tmp.length < 2) throw new ErrorInUserInput();
		
		//Creating the string of parameters (for instance with title that are several words:
		//Let it be => only one string
		
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < tmp.length; ++i)
			builder.append(tmp[i]);

		
		
		return new ASCCommand(matchInputParameterWithExistingAction(tmp[0]),builder.toString());
	}
	
	
	private ASCAction matchInputParameterWithExistingAction(String parameter) throws ErrorInUserInput
	{
		for (ASCAction currentAction: ASCAction.values())
			if (currentAction.getParam().equals(parameter))
				return currentAction;
		
		throw new ErrorInUserInput();
		
	}

}

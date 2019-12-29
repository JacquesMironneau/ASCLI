package system.controller.ressources;

//An action + the possible parameters 

public class ASCCommand
{
	private ASCAction action;
	
	private String parameter;
	
	public static final String COMMAND_SEPARATOR = "[ascp]";
	
	public ASCCommand(ASCAction action, String s)
	{
		this.action = action;
		this.parameter = s;
	}
	

	public ASCAction getAction() 
	{
		return action;
	}

	public String getParameter() 
	{
		return parameter;
	}
	
	public String toString()
	{
		return this.action + ASCCommand.COMMAND_SEPARATOR + this.parameter;
	}
}

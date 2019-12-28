package system;

//An action + the possible parameters 

public class ASCCommand
{
	private ASCAction action;
	
	private String parameter;
	
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
}

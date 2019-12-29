package system.controller.ressources;

public class ASCInputReaderArgs implements ASCInputReader 
{

	private String argumentsProvidedByUser;
	
	public ASCInputReaderArgs(String arg)
	{
		this.argumentsProvidedByUser = arg;
	}
	
	@Override
	public String read()
	{
		if (this.argumentsProvidedByUser.length() < 2) return null;
		return this.argumentsProvidedByUser;
	}

}

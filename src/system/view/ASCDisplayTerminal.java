package system.view;

public class ASCDisplayTerminal implements ASCDisplay {

	@Override
	public void displayError()
	{
		
	}

	@Override
	public void displaySuccess() 
	{
		prefix();
		System.out.println("Success");
		
	}

	@Override
	public void displayTrack() 
	{
		prefix();
		
	}

	@Override
	public void displayNext() 
	{
		prefix();
		
	}

	private void prefix()
	{
		System.out.print("[VIEW] ");
	}
}

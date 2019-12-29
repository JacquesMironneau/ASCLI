package system.view;

public interface ASCDisplay {

	
	//Prolly with an Error Enum (no track played/Nothing found/Server error...)
	public void displayError();
	
	
	//Same shit as above 
	public void displaySuccess();
	
	
	//Display what is currently play
	public void displayTrack();
	
	//Display next maybe
	public void displayNext();
}

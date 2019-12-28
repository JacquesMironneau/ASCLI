package system;

//Possible choices from user
public enum ASCAction {

	PLAY("play"),
	PAUSE("pause"),
	SKIP("skip"),
	NOW_PLAYING("np"),
	ADD("add"),
	SEARCH("search");
	
	private String actionName;
	
	private ASCAction (String s)
	{
		this.actionName = s;
	}

	public String getParam() {
		return actionName;
	}
	
}

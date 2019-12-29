package system.network;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public abstract class Observer
{

	protected List<Socket> subjects;
	
	public Observer()
	{
		this.subjects = new ArrayList<Socket>();
	}
	
	public void addClient(Socket aNewClient)
	{
		this.subjects.add(aNewClient);
	}

}

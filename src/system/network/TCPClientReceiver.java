package system.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import system.view.ASCDisplay;

//A receiver for a client
/*
 * It basically listen for message from the server = in order to display 
 * in the view the data sent back or some informations requested by other users
 */
public class TCPClientReceiver implements Runnable
{
	private Socket socket;

	private ASCDisplay view;
	
	public TCPClientReceiver(Socket socket, ASCDisplay view)
	{
		this.socket = socket;
		this.view = view;
	}
	
	@Override
	public void run()
	{
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			while (true)
			{
				buf.readLine();
				this.view.displaySuccess();
				//System.out.println("[MESSAGE RECEIVED]: "+buf.readLine());
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

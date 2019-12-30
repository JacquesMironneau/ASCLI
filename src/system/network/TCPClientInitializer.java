package system.network;

import java.io.IOException;
import java.net.Socket;

import system.view.ASCDisplay;

public class TCPClientInitializer
{
	private Socket socket;
	
	
	public TCPClientInitializer(ASCDisplay view, String address, int port)
	{
		try {
			this.socket = new Socket(address, port);
			System.out.println("Launching the client receiver");
			new Thread(new TCPClientReceiver(this.socket, view)).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

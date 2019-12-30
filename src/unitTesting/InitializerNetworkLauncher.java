package unitTesting;

import system.network.TCPClientInitializer;
import system.network.TCPServerEmitter;
import system.network.TCPServerInitializer;
import system.view.ASCDisplayTerminal;

/**
 * Test class
 * @author pashmi
 * State: basic network works pretty well => need to implement the ASCP
 * (Awesome Spotify Cli Protocol)
 */
public class InitializerNetworkLauncher 
{

	private static final String ADDRESS = "localhost";
	
	private static final int PORT = 6513;
	
	public static void main(String[] args) throws InterruptedException
	{
		TCPServerEmitter observer = new TCPServerEmitter();
		new Thread(new TCPServerInitializer(observer)).start();

		//Thread.sleep(100);
		new TCPClientInitializer(new ASCDisplayTerminal(), ADDRESS, PORT);
		new TCPClientInitializer(new ASCDisplayTerminal(), ADDRESS, PORT);
		new TCPClientInitializer(new ASCDisplayTerminal(), ADDRESS, PORT);
		new TCPClientInitializer(new ASCDisplayTerminal(), ADDRESS, PORT);
		

		Thread.sleep(100);
		observer.displaySuccess();

	}
}

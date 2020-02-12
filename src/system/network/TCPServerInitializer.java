package system.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import system.controller.Icontroller;

public class TCPServerInitializer implements Runnable
{
	private final static int PORT = 6513;
	
	private ServerSocket server;
	
	private Observer emitter;
	
	private Icontroller controller;
	
	
	public TCPServerInitializer(Observer obs)
	{
		this.emitter = obs;
		
		try
		{
			this.server = new ServerSocket(PORT);
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				Socket aNewClient = this.server.accept();
				this.emitter.addClient(aNewClient);
				System.out.println("New client received");
				new Thread(new TCPServerReceiver(aNewClient, this.controller)).start();
				
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}

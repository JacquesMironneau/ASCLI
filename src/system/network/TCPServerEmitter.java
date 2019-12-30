package system.network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import system.view.ASCDisplay;

public class TCPServerEmitter extends Observer implements ASCDisplay
{

	public TCPServerEmitter()
	{
		super();
	}
	
	@Override
	public void displayError()
	{
		
		for(Socket sock : this.subjects)
		{
			System.out.println(sock);
			try
			{
				new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())).write("Error");;
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void displaySuccess()
	{
		for(Socket sock : this.subjects)
		{
			
			try
			{

				BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
				buf.write("Success\n");
				buf.flush();
				System.out.println("Emitting !");
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}	
		// TODO Auto-generated method stub

	}

	@Override
	public void displayTrack()
	{
		for(Socket sock : this.subjects)
		{
			try
			{
				BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
				buf.write("Track");
				buf.flush();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void displayNext()
	{
		for(Socket sock : this.subjects)
		{
			try
			{
				new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())).write("Next");;
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

}

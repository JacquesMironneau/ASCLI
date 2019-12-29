package system.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

import exception.MethodDoesNotExistException;
import system.controller.ASCController;
import system.controller.ressources.ASCCommand;


public class TCPServerReceiver implements Runnable
{
	private ASCController controller;

	private Socket socketToListen;
	
	public TCPServerReceiver(Socket sock, ASCController ctrl)
	{
		this.socketToListen = sock;
		this.controller = ctrl;
	}

	@Override
	public void run()
	{
		try
		{
			BufferedReader reader = new BufferedReader(
										new InputStreamReader(
												this.socketToListen.getInputStream()));
			
			while (true)
			{
				String res = reader.readLine();
				matchMessageWithCorrectMethodCall(res);
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private void matchMessageWithCorrectMethodCall(String message)
	{
		String[] res = message.split(ASCCommand.COMMAND_SEPARATOR); 
		//TODO check is something like 'strSEPARATOR' give only an array of 1 element
		
		Method correctOne = null;
		//String[0] is an ASCAction enum => match it with the correct command
		//String[1] => the potential parameters (might be empty)

		try {
			correctOne = this.bestMethodFinder(res[0]);
		} catch(MethodDoesNotExistException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			if (correctOne.getParameterCount() == 1)
				correctOne.invoke(this.controller, res[1]);
			else
				correctOne.invoke(controller);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	private Method bestMethodFinder(String str) throws MethodDoesNotExistException
	{
		for (Method m : ASCController.class.getMethods())
		{
			if (m.getName().contains(str))
				return m;
		}
		throw new MethodDoesNotExistException();
	}

}

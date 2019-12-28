package system;

import java.lang.reflect.Method;

public class Instance 
{
	//Will be 
	private ASCController controller;
	
	private ASCInputReader reader;
	
	private ASCStringRetreiver retreiver;

	public Instance (ASCController myModel, ASCInputReader reader, ASCStringRetreiver retreiver)
	{
		this.controller = myModel;
		this.reader = reader;
		this.retreiver = retreiver;
	}
	
	//Call by exec/main
	public void Launch()
	{
		try {
			ASCCommand cmd = this.retreiver.retreive(this.reader.read());
			matchActionWithCallToController(cmd.getAction());
			
		} catch (ErrorInUserInput e) {
			//TODO call to ASCdisplay
			e.printStackTrace();
		}
		
	}
	
	//10 billions IQ (no)
	private void matchActionWithCallToController(ASCAction action)
	{
		Method[] controllerMethods = this.controller.getClass().getMethods();
		for (Method m : controllerMethods)
		{
			if (m.toString().equals(action))
			{
				m.getParameters(); // Soon tm la magie
				//	m.invoke(obj, args);
			}
		}
		
		//m.toString();
	}
	
	
}

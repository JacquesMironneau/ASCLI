package system.controller.ressources;

import exception.UserInputException;

//Create a command from a readed string
public interface ASCStringRetreiver {

	public ASCCommand retreive(String toRetreive) throws UserInputException;
}

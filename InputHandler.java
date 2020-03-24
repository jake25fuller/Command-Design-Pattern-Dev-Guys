/**
 * InputHandler.java - takes user input and executes the correct corresponding method
 * @author Jake Fuller
 */
package csce247.assignments.command;
import java.util.*;

public class InputHandler {

	HashMap<String, Command> commands = new HashMap<String, Command>();
	/**
	 * initializes the HashMap to execute certain commands from on the document when certain strings are entered
	 * @param Document document
	 */
	public InputHandler(Document document)
	{
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("spell", new SpellCommand(document));
		commands.put("print", new PrintCommand(document));
	}
	
	/**
	 * calls upon the command in the hashmap based on what String is entered for data
	 * @param data
	 */
	public void inputEntered(String data)
	{
		commands.get(data).Execute();
	}
}

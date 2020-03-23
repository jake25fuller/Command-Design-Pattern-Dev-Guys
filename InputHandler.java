/**
 * InputHandler.java - takes user input and executes the correct corresponding method
 * @author Jake Fuller
 */
package csce247.assignments.command;
import java.util.*;

public class InputHandler {

	HashMap commands = new HashMap();
	/**
	 * initializes the HashMap to execute certain commands from on the document when certain strings are entered
	 * @param Document document
	 */
	public InputHandler(Document document)
	{
		commands.put("load", document.LoadCommand());
		commands.put("save", document.SaveCommand());
		commands.put("spell", document.SpellCheckCommand());
		commands.put("print", document.PrintCommand());
	}
	
	/**
	 * calls upon the command in the hashmap based on what String is entered for data
	 * @param data
	 */
	public void inputEntered(String data)
	{
		commands.get(data);
	}
}

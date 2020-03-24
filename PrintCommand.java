import java.util.*;
import java.io.*;

public class PrintCommand implements Command {
	private Document doc;

	public SaveCommand(Document doc) {
		this.doc = doc;
	}

	public void execute() {
		doc.Print();
	}

}

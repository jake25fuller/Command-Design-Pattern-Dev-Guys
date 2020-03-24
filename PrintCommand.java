package csce247.assignments.command;

public class PrintCommand implements Command {
	private Document doc;

	public PrintCommand(Document doc) {
		this.doc = doc;
	}

	public void Execute() {
		doc.Print();
	}

}

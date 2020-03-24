package csce247.assignments.command;

public class SaveCommand implements Command {
	private Document doc;

	public SaveCommand(Document doc) {
		this.doc = doc;
	}

	public void Execute() {
		doc.Save();
	}

}


/**
 * Adam Farley
 * LoadCommand.java sets the object of the document and overwrites the execute
 */
package csce247.assignments.command;

public class LoadCommand implements Command {
    private Document doc;

    public LoadCommand(Document doc){
        this.doc = doc;
    }
    public void Execute(){
        doc.Load();
    }
}
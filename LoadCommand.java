/**
 * Adam Farley
 * LoadCommand.java sets the object of the document and overwrites the execute
 */
public class LoadCommand implements Command {
    private Document doc;

    public SpellCommand(Document doc){
        this.doc = doc;
    }
    public void Execute(){
        doc.Load();
    }
}
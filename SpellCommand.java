/**
 * Adam Farley
 * SpellCommand.java sets the object of the document and overwrites the execute
 */
package csce247.assignments.command;

public class SpellCommand implements Command{
    private Document doc;

    public SpellCommand(Document doc){
        this.doc = doc;
    }
    public void Execute(){
        doc.Spell();
    }
}
 /**
 * Adam Farley
 * sets the name of the doc and makes the functions
 */
package csce247.assignments.command;

public class Document{
	
	private String name;
    public Document(String name){
        this.name = name;
        System.out.println("Document named " +name +" is created");
    }
    public void Load(){
        System.out.println("Document " +name +" is loaded into view");
    }
    public void Spell(){
        System.out.println("Document " +name +" is being checked for spelling errors");
    }
    public void Save(){
        System.out.println("Document " +name  +" is being saved...");
    }
    public void Print(){
        System.out.println("Document " +name +" is printing...");
    }
}
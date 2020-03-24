/**
 * Adam Farley
 * sets the name of the doc and makes the functions
 */
public class Document{
    private Document name;
    public Document(String name){
        this.name = name;
    }
    public void Load(){
        System.out.println("Doc being loaded");
    }
    public void Spell(){
        System.out.println("Doc being Spelled");
    }
    public void Save(){
        System.out.println("Doc being Saved");
    }
    public void Print(){
        System.out.println("Doc being Printed");
    }
}
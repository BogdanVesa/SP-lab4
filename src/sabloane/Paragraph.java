package sabloane;



public class Paragraph implements Element{
    String txt;
    Element parent;
    
    public Paragraph(String txt)
    {
        this.txt = txt;
    }
    public void print()
    {
        System.out.println("paragraph: "+this.txt);
    }

}
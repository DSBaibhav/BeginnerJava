/*An interface in Java is like a contract or a set of rules.

    For example, imagine we create an interface called Printable.

    We are basically saying:
        "Any class that wants to be Printable must have a print() method."
    So the interface tells us what must be done, but usually not how it should be done.
*/
package oops;

interface Printable {

    void print();
}

class Document implements Printable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

public class InterfaceDemo{

    public static void main(String[] args) {

        Document d = new Document();

        d.print();
    }
}
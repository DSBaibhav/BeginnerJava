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
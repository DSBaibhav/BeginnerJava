package oops;
public class Book{
    int id;
    String name;
    String author;
    double price;
    void input(int id,String name,String author,double price){
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
    }
    void display(){ 
        System.out.println("Book id is: "+id);
        System.out.println("Book name is: "+name);
        System.out.println("Book author is: "+author);
        System.out.println("Book price is: "+price);
    }
    public static void main(String args[]){
        Book b1 = new Book();
        Book b2 = new Book();
        b1.input(1, "Java Programming", "John Doe", 500.0);
        b1.display();
        b2.input(2, "Python Programming", "Jane Smith", 600.0);
        b2.display();
    }
}
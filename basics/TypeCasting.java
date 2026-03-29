public class TypeCasting {
    public static void main(String[] args) {
        //Implicit Casting
        int i=100;
        long l=i; //int to long
        float f=l; //long to float
        System.out.println("Implicit Casting:");
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);

        //Explicit Casting
        int x=257;
        byte b=(byte)x; //int to byte(overflow occurs hence 257%256=1)
        System.out.println("\nExplicit Casting:");
        System.out.println("int: " + x);
        System.out.println("byte: " + b);  /*Overflow occurs because byte can only hold values 
        from -128 to 127 hence 256 is the largest value it can hold*/
        int d=(int)10.0f; //float to int (fractional part lost)
        System.out.println("int: " + d);  

        //Typecasting
        byte a=42;
        char c='a'; 
        short s=1024;
        int j=52000;
        float g=9.17f;
        double h=0.16789;
        double result=(g*a)+(j/c)-(h*s);
        System.out.println("\nTypecasting:");
        System.out.println((g*a)+" "+(j/c)+" "+(h*s)); //Intermediate results before addition and subtraction
        System.out.println("Result: " + result);  //All operands are promoted to double before the calculation
        
    }
}
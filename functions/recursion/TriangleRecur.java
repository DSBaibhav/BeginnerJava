public class TriangleRecur {
    public static void main(String[] args) {
        printTriangle(1, 5);
    }
    static void printTriangle(int rows,int n)
    {
       if(rows>n){
        return;
       }
       printStars(1,rows);
       System.out.println();
       printTriangle(rows+1,n);
    }
    static void printStars(int col,int rows)
    {
        if(col>rows){
            return;
        }
        System.out.print("* ");
        printStars(col+1,rows);
    }
}
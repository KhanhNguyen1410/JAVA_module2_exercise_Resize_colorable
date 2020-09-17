package resizeable.src;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[3];
        shapes[0]= new Circle(2);
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Square(5);

        for (Shape shape: shapes){
            System.out.println("befor resize: "+ shape );
        }
        for (Shape shape: shapes){
            shape.resize(10);
            System.out.println("after resize: "+ shape);
        }



    }
}

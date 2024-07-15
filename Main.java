//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Shape
        Shape shape = new Shape();
        System.out.println("color : "+shape.getColor());
        System.out.println("isFilled :"+shape.isFilled());
        System.out.println(shape);
        System.out.println("************************************");
       //Circle
        Circle circle = new Circle();
        System.out.println("Area of a Circle :"+circle.getArea());
        System.out.println("Perimeter of a Circle :"+circle.getPerimeter());
        System.out.println(circle);

        System.out.println("************************************");
        //Rectangle
        Rectangle rectangle=new Rectangle();
        System.out.println("Area of a Rectangle :"+rectangle.getArea());
        System.out.println("Perimeter of a Rectangle :"+rectangle.getPerimeter());
        System.out.println(rectangle);

        System.out.println("************************************");
        // Square
        Square square=new Square(7.7);
        System.out.println("Area of a square :"+square.getArea());
        System.out.println("Perimeter of a square :"+square.getPerimeter());
        System.out.println(square);




    }
}
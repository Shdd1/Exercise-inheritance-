public class Square extends Rectangle {
//
    public Square() {
    }

//
    public Square(double side) {
        super.setLength(side);
    }
    //
    public Square(double side,String color,boolean filled){

    }


    public double getSide() {
        return super.getLength();
    }


    public void setSide(double side) {
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return super.getLength()*super.getLength();
    }

    @Override
    public double getPerimeter() {
        return 4*super.getLength();
    }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() + ", which is a subclass of " + super.toString();
    }
}
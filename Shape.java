public class Shape {
   private String color;
   private boolean filled;
//cons
    public Shape() {
        this.color="green";
        this.filled=true;
    }
//cons
    public Shape(String color,boolean filled) {
        this.color = color;
        this.filled=filled;

    }
// set and get
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //get filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }

}



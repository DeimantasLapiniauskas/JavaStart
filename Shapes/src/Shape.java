public class Shape {
    private String color;
    private boolean filled = true;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return -1;
    }

    @Override
    public String toString() {
        if (filled) return "A Shape with color of " + color + " and " + "filled";
        return "A shape with color of " + color + " and Not filled";
    }
}

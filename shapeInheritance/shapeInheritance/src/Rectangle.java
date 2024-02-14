public class Rectangle extends Shape {

    public Rectangle(int length, int width, String shapeType) {
        super(length, width, shapeType);
    }

    public int calculateArea() {
        return this.length * this.width;
    }
}
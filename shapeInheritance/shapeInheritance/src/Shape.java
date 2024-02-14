public class Shape {
    int length;
    int width;
    String shapeType;

    public Shape(int length, int width, String shapeType) {
        this.length = length;
        this.width = width;
        this.shapeType = shapeType;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public String getShapeType() {
        return this.shapeType;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(12, 5, "Rectangle");

        int L = r.getLength();
        int W = r.getWidth();
        String shape = r.getShapeType();
        int area = r.calculateArea();

        System.out.println(
                "The " + shape + " has a length of " + L + " and a width of " + W + ". The area is " + area + ".");
    }
}

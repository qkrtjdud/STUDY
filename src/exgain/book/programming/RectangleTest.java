package exgain.book.programming;

class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class ColorRectangle extends Rectangle {
    String color = "blue";

    public ColorRectangle(int width, int height) {
        super(width, height);
    }

}

public class RectangleTest {
    public static void main(String[] args) {
        ColorRectangle rectangle = new ColorRectangle(100, 100);
        System.out.println("가로: " + rectangle.width);
        System.out.println("세로: " + rectangle.height);
        System.out.println("색상: " + rectangle.color);
    }
}

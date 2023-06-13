package exgain.book.lab;

interface Comparable {
    int compareTo(Object other);
}

class Rectangle implements Comparable {
    int width = 0, height = 0;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println(this);
    }

    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public int compareTo(Object other) {

        Rectangle otherRect = (Rectangle) other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }

}

public class RectangeTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(100, 30);
        Rectangle r2 = new Rectangle(200, 10);
        int result = r1.compareTo(r2);
        if (result == 1)
            System.out.println(r1 + "가 더 큽니다.");
        else if (result == 0)
            System.out.println("같습니다.");
        else if (result == -1)
            System.out.println(r2 + "가 더 큽니다.");
    }
}

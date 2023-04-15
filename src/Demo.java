
abstract class Shape {
    protected int x, y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}


public class Demo {

	public static void main(String[] args) {
        Circle circle = new Circle(10, 20, 5);
        circle.draw();      // output: Drawing a circle at (10, 20) with radius 5
        circle.move(15, 25);
        circle.draw();      // output: Drawing a circle at (15, 25) with radius 5

        Rectangle rectangle = new Rectangle(30, 40, 10, 20);
        rectangle.draw();   // output: Drawing a rectangle at (30, 40) with width 10 and height 20
        rectangle.move(35, 45);
        rectangle.draw();   // output: Drawing a rectangle at (35, 45) with width 10 and height 20
    }
	
}

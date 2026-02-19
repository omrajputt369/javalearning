/**
 * A Java program demonstrating the Factory Design Pattern.
 */

// Shape interface
interface Shape {
    void draw();
}

// Concrete classes
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Shape Factory
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}

// Client class
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = factory.getShape("SQUARE");
        shape3.draw();
    }
}

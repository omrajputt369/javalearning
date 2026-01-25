class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    void area() {
        System.out.println("Circle area: " + (3.14159 * r * r));
    }

    public static void main(String[] args) {
        Shape s = new Circle(5);
        s.area();
    }
}

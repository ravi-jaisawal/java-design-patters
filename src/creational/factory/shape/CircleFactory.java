package creational.factory.shape;

public class CircleFactory implements ShapeFactory {
    public Shape createShape() {
        return new Circle();
    }
}

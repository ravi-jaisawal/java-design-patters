package creational.factory.shape;

public class SquareFactory implements ShapeFactory {
    public Shape createShape() {
        return new Square();
    }
}
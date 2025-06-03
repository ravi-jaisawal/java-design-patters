package structural.decorator;

abstract class ShapeDecorator implements Shape {
    private Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    @Override
    public String getName() {
        return decoratedShape.getName();
    }
}
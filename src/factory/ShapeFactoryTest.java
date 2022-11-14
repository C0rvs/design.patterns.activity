package factory;

public class ShapeFactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.instance();
        Shape circleShape = shapeFactory.getShape(ShapeTypes.CIRCLE);
        circleShape.draw();
        
        Shape rectangleShape = shapeFactory.getShape(ShapeTypes.RECTANGLE);
        rectangleShape.draw();
        
        Shape squareShape = shapeFactory.getShape(ShapeTypes.SQUARE);
        squareShape.draw();
        
        
    }
}

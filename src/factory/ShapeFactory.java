package factory;

import java.security.PublicKey;

import javax.swing.plaf.synth.SynthUI;

public class ShapeFactory {
    private static ShapeFactory INSTANCE;

    private ShapeFactory() {

    }
    
    public static ShapeFactory instance() {
        if (INSTANCE == null) {
            INSTANCE = new ShapeFactory();
        }
        return INSTANCE;
    }
    
    
    public Shape getShape(ShapeTypes shapeTypes) {
        Shape shape = null;

        switch (shapeTypes) {
            case CIRCLE:
                shape = new Circle();
                break;
           case RECTANGLE:
                shape = new Rectangle();
                break;
                
           case SQUARE:
               shape = new Square();
               break;

            default:
                break;
        }
        
        
        return shape;
    }

}

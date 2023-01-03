public class ShapeFactory {
    public Shape getShape(String type){
        if (type == null || type.isEmpty())
            return null;

        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();

            case "square":
                return new Square();

            case "rectangle":
                return new Rectangle();
        }

        return null;
    }
}

public class AFShapeFactory extends AbstractFactory{
    @Override
    public AFShape getShape(String type) {
        if (type == null || type.isEmpty())
            return null;

        if (type.toLowerCase().equals("square"))
            return new AFSquare();
        if (type.toLowerCase().equals("rectangle"))
            return new AFRectangle();

        return null;
    }
}

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public AFShape getShape(String type) {
        if (type == null || type.isEmpty())
            return null;

        if (type.toLowerCase().equals("square"))
            return new RoundedSquare();
        if (type.toLowerCase().equals("rectangle"))
            return new RoundedRectangle();

        return null;
    }
}

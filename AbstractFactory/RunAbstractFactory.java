public class RunAbstract {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        ShapeFactory factory = new ShapeFactory();

        factory.getShape("Rectangle").draw();

        factory.getShape("square").draw();

        factory.getShape("CIRCLE").draw();

        try{
            factory.getShape("").draw();
        } catch (NullPointerException e) {
            System.err.println(e);
        }
    }
}
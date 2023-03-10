public class RunFactory {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        AFShapeFactory factory = new AFShapeFactory();

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
public class RunAbstractFactory {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AbstractFactory rounded_producer = AFactoryProducer.getFactory(true);
        rounded_producer.getShape("Square").draw();
        rounded_producer.getShape("RECTANGLE").draw();

        AbstractFactory shaped_producer = AFactoryProducer.getFactory(false);
        shaped_producer.getShape("Square").draw();
        shaped_producer.getShape("RECTANGLE").draw();
    }
}
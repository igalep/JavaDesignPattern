public class AFactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if (rounded)
            return new RoundedShapeFactory();
        else
            return new AFShapeFactory();
    }
}

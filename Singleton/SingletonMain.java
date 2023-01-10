public class SingletonMain {
    public static void main(String [] args){
        SingleObject_first instance_first = SingleObject_first.getInstance();
        instance_first.doSomething();

        SingleObject_second instance_second = SingleObject_second.getInstance();
        instance_second.doSomething();
    }
}

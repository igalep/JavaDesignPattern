public class SingleObject_first {
    private static SingleObject_first instance = new SingleObject_first();
    private String data;

    private SingleObject_first(){
        data = "New instance";
    }

    public static SingleObject_first getInstance(){
        return instance;
    }

    public static void doSomething(){
        System.out.println("Message coming from single object_first ---> ".concat(instance.data));
    }
}

public class SingleObject_second {
    private static SingleObject_second instance = null;
    private String data;

    private SingleObject_second(){
        data = "New instance";
    }

    public static SingleObject_second getInstance(){
        if (instance == null)
            instance = new SingleObject_second();

        return instance;
    }

    public static void doSomething() {
        System.out.println("Message coming from single object_second ---> ".concat(instance.data));
    }
}

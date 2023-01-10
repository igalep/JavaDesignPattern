public class ProtoCircle extends ProtoShape{

    public ProtoCircle(){
            type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

public class ProtoRectangle extends ProtoShape{

    public ProtoRectangle(){
            type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

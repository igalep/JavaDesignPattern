public class ProtoSquare extends ProtoShape{

    public ProtoSquare(){
            type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

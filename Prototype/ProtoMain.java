public class ProtoMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        ProtoShape clonedShape1 = ShapeCache.getShape("1");
        ProtoShape clonedShape2 = ShapeCache.getShape("2");
        ProtoShape clonedShape3 = ShapeCache.getShape("3");

        System.out.println("Shape : " + clonedShape1.getType());
        clonedShape1.draw();
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();
        System.out.println("Shape : " + clonedShape3.getType());
        clonedShape3.draw();
    }
}

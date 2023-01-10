import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable <String , ProtoShape> shapeMap = new Hashtable<>();

    public static ProtoShape getShape(String id){
        ProtoShape cachedShape = shapeMap.get(id);

        return cachedShape.clone();
     }

     public static void loadCache(){
        ProtoCircle circle = new ProtoCircle();
        circle.setId("1");
        shapeMap.put(circle.getId() , circle);

         ProtoRectangle rectangle = new ProtoRectangle();
         rectangle.setId("2");
         shapeMap.put(rectangle.getId() , rectangle);

         ProtoSquare square = new ProtoSquare();
         square.setId("3");
         shapeMap.put(square.getId() , square);
     }
}

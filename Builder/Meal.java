import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    Meal(){
        items = new ArrayList<>();
    }

    public void showItems(){
        items.stream().forEach(item -> {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
    }

    public float getCost(){
        return (float) items.stream().mapToDouble(item -> item.price()).sum();
    }

    public void addItem(Item item){
        items.add(item);
    }
}

package eStore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Items> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addItem(Items newItem){
        items.add(newItem);
    }

    public String getItems(){
        return items.toString();
    }
}

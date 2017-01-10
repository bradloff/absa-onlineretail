package za.co.absa.config;

import org.springframework.stereotype.Component;
import za.co.absa.model.Item;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Created by barry on 2017/01/10.
 */
@Component
public class InMemoryDatabase {

    HashMap<Integer, Item> itemDatabase = new HashMap();
    {
        itemDatabase.put(1, new Item(1, 100, "Raspberry Pi 3"));
        itemDatabase.put(2, new Item(2, 100, "Arduino Dev Kit 1"));
        itemDatabase.put(3, new Item(3, 100, "LED - Red"));
        itemDatabase.put(4, new Item(4, 100, "5ohm Resistor"));
        itemDatabase.put(5, new Item(5, 100, "DIP Switch"));
        itemDatabase.put(6, new Item(6, 100, "PIC 3451"));
        itemDatabase.put(7, new Item(7, 100, "Power Adapter"));
    }

    public void addItem(Item item){
        itemDatabase.put(item.getId(), item);
    }

    public void removeItem(Item item){
        itemDatabase.remove(item.getId());
    }

    public Item getItem(int id){
        return itemDatabase.get(id);
    }

    public Collection<Item> getAll(){
        return itemDatabase.values();

    }
}

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

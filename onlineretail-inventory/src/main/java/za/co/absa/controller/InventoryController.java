package za.co.absa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.absa.config.InMemoryDatabase;
import za.co.absa.model.Item;


import java.util.Collection;

/**
 * Created by barry on 2017/01/10.
 */

@RestController
@RequestMapping(value="inventory")
public class InventoryController {

    @Autowired
    InMemoryDatabase inventoryDB;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Item getItem(@PathVariable("id") int id) {

        Item item = inventoryDB.getItem(id);

        if(item != null){
            return item;
        }

        return null;
    }

    @RequestMapping
    public Collection<Item> getAll(){

        return inventoryDB.getAll();
    }

    @RequestMapping(value = "/{id}/add/{incrementBy}")
    public Integer addStock(@PathVariable("id") Integer id, @PathVariable("incrementBy") Integer incrementBy){
        Item item = getItem(id);

        if(item != null){
            item.setStockCount(item.getStockCount() + incrementBy);
            inventoryDB.addItem(item);
            return item.getStockCount();
        }
        return -1;
    }

    @RequestMapping(value = "/{id}/reduce/{decrementBy}")
    public Integer reduceStock(@PathVariable("id") Integer id, @PathVariable("decrementBy") Integer decrementBy){
        Item item = getItem(id);

        if(item != null){
            item.setStockCount(item.getStockCount() - decrementBy);
            if( item.getStockCount() < 0){
                item.setStockCount(0);
            }
            inventoryDB.addItem(item);
            return item.getStockCount();
        }
        return -1;
    }


}

package za.co.absa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import za.co.absa.model.BasketItem;
import za.co.absa.remote.InventoryFeignClient;
import za.co.absa.repo.BasketDB;

import java.util.Collection;

/**
 * Created by taariqpetersen on 2017/01/10.
 */
@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    BasketDB basketDb;

    @Autowired
    InventoryFeignClient inv;

    @Override
    public BasketItem addToBasket(String item) {
        Integer itemId = Integer.parseInt(item);
        BasketItem addedItem = inv.getInventoryItem(itemId);

        if(addedItem == null){
            return null; // terrible hack for now
        }

        BasketItem existingItem = basketDb.db.get(item);
        if( existingItem == null){
            addedItem.setQuantity(1);
        }else{
            addedItem.setQuantity(existingItem.getQuantity() + 1);
        }
        basketDb.db.put(Integer.parseInt(item), addedItem);


        return addedItem;
    }

    @Override
    public String removeFromBasket(String item) {
        return null;
    }

    @Override
    public Collection<BasketItem> listBasketItems() {
        Collection<BasketItem> items = basketDb.db.values();

        return items;
    }

    @Override
    public String listBasketItem() {
        return null;
    }

    @Override
    public String calculateBasket() {
        return null;
    }

    @Override
    public String checkout() {
            return null;
    }

}

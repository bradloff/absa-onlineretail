package za.co.absa.service;

import za.co.absa.model.BasketItem;

import java.util.Collection;

/**
 * Created by taariqpetersen on 2017/01/10.
 */
public interface BasketService {

    public BasketItem addToBasket(String item);
    public String removeFromBasket(String item);
    public Collection<BasketItem> listBasketItems();
    public String listBasketItem();
    public String calculateBasket();
    public String checkout();
}

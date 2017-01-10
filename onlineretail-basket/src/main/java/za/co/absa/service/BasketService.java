package za.co.absa.service;

import java.util.Collection;

/**
 * Created by taariqpetersen on 2017/01/10.
 */
public interface BasketService {

    public String addToBasket(String item);
    public String removeFromBasket(String item);
    public Collection<String> listBasketItems();
    public String calculateBasket();
    public String checkout();
}

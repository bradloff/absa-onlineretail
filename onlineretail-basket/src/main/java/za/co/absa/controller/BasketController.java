package za.co.absa.controller;

/**
 * Created by taariqpetersen on 2017/01/10.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.absa.service.BasketServiceImpl;

import java.util.Collection;

@RestController
@RequestMapping("api")
public class BasketController {

    @Autowired
    BasketServiceImpl basketService;

    @RequestMapping(value = "/addToBasket" , method = RequestMethod.POST)
    public String addToBasket(String item){

            return basketService.addToBasket(item);
    }

    @RequestMapping(value = "/removeFromBasket" , method = RequestMethod.POST)
    public String removeFromBasket(String item){

        return basketService.removeFromBasket(item);
    }

    @RequestMapping(value = "/listBasketItems" , method = RequestMethod.GET)
    public Collection<String> listBasketItems(){

        return basketService.listBasketItems();
    }

    @RequestMapping(value = "/calculateBasket" , method = RequestMethod.GET)
    public String calculateBasket(){

        return basketService.calculateBasket();
    }

    @RequestMapping(value = "/checkout" , method = RequestMethod.POST)
    public String checkout(){

        return basketService.checkout();
    }




}

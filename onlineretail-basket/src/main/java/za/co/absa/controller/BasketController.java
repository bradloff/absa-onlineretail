package za.co.absa.controller;

/**
 * Created by taariqpetersen on 2017/01/10.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.absa.model.BasketItem;
import za.co.absa.service.BasketServiceImpl;

import java.util.Collection;

@RestController
@RequestMapping("api/basket")
public class BasketController {

    @Autowired
    BasketServiceImpl basketService;

    @RequestMapping(value = "" , method = RequestMethod.GET)
    public Collection<BasketItem> listBasketItems(){

        return basketService.listBasketItems();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public String listBasketItem(){

        return basketService.listBasketItem();
    }

    @RequestMapping(value = "" , method = RequestMethod.POST)
    @ResponseBody
    public BasketItem addToBasket(@RequestBody String item){

            return basketService.addToBasket(item);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public String removeFromBasket(String id){

        return basketService.removeFromBasket(id);
    }

    @RequestMapping(value = "/calculate" , method = RequestMethod.GET)
    public String calculateBasket(){

        return basketService.calculateBasket();
    }

    @RequestMapping(value = "/checkout" , method = RequestMethod.POST)
    public String checkout(){

        return basketService.checkout();
    }




}

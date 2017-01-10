package za.co.absa.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.absa.model.Item;

/**
 * Created by barry on 2017/01/10.
 */

@RestController
@RequestMapping(value="inventory")
public class InventoryController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Item getItem(@PathVariable("id") int id) {

        return new Item();
    }
}

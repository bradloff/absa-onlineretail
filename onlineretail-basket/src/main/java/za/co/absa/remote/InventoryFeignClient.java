package za.co.absa.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import za.co.absa.model.BasketItem;

/**
 * Created by barry on 2017/01/10.
 */
@FeignClient("inventory-service")
public interface InventoryFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/inventory", consumes = "application/JSON")
    String getInventory();

    @RequestMapping(method = RequestMethod.GET, value = "/inventory/{id}", consumes = "application/JSON")
    BasketItem getInventoryItem(@PathVariable("id") Integer id);


}

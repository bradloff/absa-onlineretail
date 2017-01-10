package za.co.absa.repo;

import org.springframework.stereotype.Component;
import za.co.absa.model.BasketItem;

import java.util.HashMap;

/**
 * Created by barry on 2017/01/10.
 */
@Component
public class BasketDB {

    public  HashMap<String, BasketItem> db = new HashMap();
}

package za.co.absa.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by taariqpetersen on 2017/01/10.
 */
public class BasketItem {

    int id;
    int stockCount;
    String name;
    @Getter @Setter String serialNumber;


    int quantity;

    public BasketItem(){}

    public BasketItem(int id, int stock, String name, int quantity){
        setId(id);
        setStockCount(stock);
        setName(name);
        setQuantity(quantity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("Id: [%d], Name: [%s], Stock Count: [%d], Quanity in Basket [%d], Serial Number: [%s]",
                id, name, stockCount, quantity, serialNumber);
    }
}

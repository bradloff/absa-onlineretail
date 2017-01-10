package za.co.absa.model;

/**
 * Created by barry on 2017/01/10.
 */
public class Item {

    int id;
    int stockCount;
    String name;

    public Item(int id, int stock, String name){
        setId(id);
        setStockCount(stock);
        setName(name);
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

    public void setName(String name) {
        this.name = name;
    }



}

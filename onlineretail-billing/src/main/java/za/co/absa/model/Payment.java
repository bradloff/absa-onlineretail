package za.co.absa.model;

import java.math.BigDecimal;

/**
 * Created by peter on 1/10/17.
 */
public class Payment {
    Long id;
    BigDecimal total;

    public Payment() {
    }

    public Payment(Long id, BigDecimal total) {
        this.id = id;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", total=" + total +
                '}';
    }
}

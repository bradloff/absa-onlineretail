package za.co.absa.model;

/**
 * Created by peter on 1/10/17.
 */
public class PaymentStatus {

    private Long id;

    public PaymentStatus() {}

    public PaymentStatus(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PaymentStatus{" +
                "id: " + id +
                '}';
    }

}

package za.co.absa.service;

import org.springframework.stereotype.Service;
import za.co.absa.model.Payment;
import za.co.absa.model.PaymentStatus;

/**
 * Created by peter on 1/10/17.
 */
@Service
public class DefaultBilling implements Billing {

    @Override
    public PaymentStatus pay(Payment payment) {
        System.out.println(payment);
        return new PaymentStatus(Long.valueOf(1));
    }
}

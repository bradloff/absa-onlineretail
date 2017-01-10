package za.co.absa.service;

import za.co.absa.model.Payment;
import za.co.absa.model.PaymentStatus;

/**
 * Created by peter on 1/10/17.
 */
public interface Billing {

    PaymentStatus pay(Payment payment);
}

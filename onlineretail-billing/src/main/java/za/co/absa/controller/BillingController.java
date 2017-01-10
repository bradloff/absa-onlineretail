package za.co.absa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.absa.model.Payment;
import za.co.absa.model.PaymentStatus;

/**
 * Created by peter on 1/10/17.
 */
@RestController
public class BillingController {

    @PostMapping("/payment")
    PaymentStatus pay(Payment payment) {

        return new PaymentStatus(Long.valueOf(1));
    }
}

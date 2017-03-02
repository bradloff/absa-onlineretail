package za.co.absa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.absa.model.Payment;
import za.co.absa.model.PaymentStatus;
import za.co.absa.service.Billing;

/**
 * Created by peter on 1/10/17.
 */
@RestController
public class BillingController {

    private Billing billing;

    public BillingController(Billing billing) {
        this.billing = billing;
    }

    @PostMapping("/payment")
    public PaymentStatus pay(@RequestBody Payment payment) {

        return billing.pay(payment);
    }
}

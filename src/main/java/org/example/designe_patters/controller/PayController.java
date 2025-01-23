package org.example.designe_patters.controller;


import lombok.RequiredArgsConstructor;
import org.example.designe_patters.domain.pay.PayService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("v1/pay")
@RequiredArgsConstructor
public class PayController {

    private final PayService payService;

    @PostMapping
    public String pay(@RequestParam("amount") BigDecimal amount, @RequestParam("type") String type) {
        return payService.pay(amount, type);
    }

}

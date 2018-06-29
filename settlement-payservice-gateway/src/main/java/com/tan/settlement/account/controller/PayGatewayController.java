package com.tan.settlement.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayGatewayController {
    @GetMapping("/proxy/{id}")
    public String findById(@PathVariable Long id) {
      return "SUCCESS";
    }
}

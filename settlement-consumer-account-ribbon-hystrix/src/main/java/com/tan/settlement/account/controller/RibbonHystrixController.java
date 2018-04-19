package com.tan.settlement.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tan.settlement.account.entity.User;
import com.tan.settlement.account.service.RibbonHystrixService;

@RestController
public class RibbonHystrixController {
  @Autowired
  private RibbonHystrixService ribbonHystrixService;

  @GetMapping("/ribbon/{id}")
  public User findById(@PathVariable Long id) {
    return this.ribbonHystrixService.findById(id);
  }
}

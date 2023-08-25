package com.waes.techtalk.java.spring.migration.controller;

import com.waes.techtalk.java.spring.migration.service.FooService;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

  private final FooService service;

  @Autowired
  public FooController(FooService service) {
    this.service = service;
  }

  @GetMapping("/api/double/{number}")
  public Integer getNumberDoubled(@PathVariable("number") @NotNull Integer number) {
    return service.returnGivenNumberDoubled(number);
  }

  @GetMapping("/api/message")
  public String getMessage() {
    return service.getTheMessage();
  }

}

package com.waes.techtalk.java.spring.migration.service;

import java.util.Random;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class FooService {

  public Integer returnGivenNumberDoubled(@NotNull Object number) {
    if (number instanceof Integer) {
      return (Integer) number * 2;
    } else {
      return 0;
    }
  }

  public String getTheMessage() {
    switch (new Random().nextInt() % 3) {
      case 0:
        return "This "
            + "is "
            + "a "
            + "multiline "
            + "message! (MOD == 0)";
      case 1:
        return "This "
            + "is "
            + "a "
            + "multiline "
            + "message! (MOD == 1)";
      case 2:
        return "This "
            + "is "
            + "a "
            + "multiline "
            + "message! (MOD == 2)";
      default:
        return "This "
            + "is "
            + "another "
            + "multiline "
            + "message!";
    }
  }
}

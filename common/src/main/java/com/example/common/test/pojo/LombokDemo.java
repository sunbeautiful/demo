package com.example.common.test.pojo;

import lombok.Builder;
import lombok.Data;

/**
 *
 */
@Data
@Builder(toBuilder = true)
public class LombokDemo {

  private String high;

  private String length;

  private String age;


}

package com.qust.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Classmaster implements Serializable {

  private Integer masId;
  private String masNumber;
  private String masPassword;
  private String masName;
  private String masImage;
  private String masSex;
  private Date masBirthday;
  private String masAddress;
  private Integer masPhone;
  private Integer flag1;
  private Integer flag2;
  private Integer roleId;
  private Integer classId;

}

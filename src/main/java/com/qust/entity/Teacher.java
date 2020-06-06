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
public class Teacher implements Serializable {

  private Integer teaId;
  private String teaNumber;
  private String teaPassword;
  private String teaName;
  private String teaImage;
  private String teaSex;
  private String teaBirthday;
  private String teaAddress;
  private String teaPhone;
  private Integer flag1;
  private Integer flag2;
  private Integer roleId;
  private Integer courseId;



}

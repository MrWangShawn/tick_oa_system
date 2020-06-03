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
public class Student implements Serializable {

  private Integer stuId;
  private String stuNumber;
  private String stuPassword;
  private String stuName;
  private String stuImage;
  private String stuSex;
  private Date stuBirthday;
  private String stuAddress;
  private Integer stuPhone;
  private Integer flag1;
  private Integer flag2;
  private Integer roleId;
  private Integer classId;

}

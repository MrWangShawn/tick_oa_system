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
public class Principal implements Serializable {

  private Integer prinId;
  private String prinNumber;
  private String prinPassword;
  private String prinName;
  private String prinImage;
  private String prinSex;
  private Date prinBirthday;
  private String prinAddress;
  private Integer prinPhone;
  private Integer flag1;
  private Integer flag2;
  private Integer roleId;

}

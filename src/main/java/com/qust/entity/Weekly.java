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
public class Weekly implements Serializable {

  private Integer weekId;
  private String weekContent;
  private Integer weekTab;
  private String weekTime;
  private Integer stuId;
  private Integer flag;

  private Student student;

}

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
public class Score implements Serializable {

  private Integer scoreId;
  private Integer scoreGrade;
  private Integer stuId;
  private Integer couId;

  private Student student;
  private Course course;

}

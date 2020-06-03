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
public class Leaves implements Serializable {

  private Integer leaveId;
  private Date leaveTime;
  private String leaveReason;
  private Integer leaveTab;
  private Integer stuId;
  private Integer teaId;
  private Integer massterId;

}

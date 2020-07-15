package com.ml.po;

import lombok.Data;

import java.util.Date;

@Data
public class LawCasePendingRecord {

    private String serialNo;

    private String courtCode;

    private String state;

    private Date createDate;

    private Date updateDate;

    private Date beforeUpdateDate;

    private String remark;
}

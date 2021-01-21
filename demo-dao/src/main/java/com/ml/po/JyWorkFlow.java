package com.ml.po;

import java.util.Date;

public class JyWorkFlow {
    private Integer id;

    private String type;

    private String serialNo;

    private Integer operatorId;

    private String operatorName;

    private String orgCode;

    private String orgName;

    private String result;

    private String resultName;

    private String remark;

    private Date createDate;

    private Integer jyAdjustInfoId;

    private String accidentCode;

    private String tempData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName == null ? null : resultName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getJyAdjustInfoId() {
        return jyAdjustInfoId;
    }

    public void setJyAdjustInfoId(Integer jyAdjustInfoId) {
        this.jyAdjustInfoId = jyAdjustInfoId;
    }

    public String getAccidentCode() {
        return accidentCode;
    }

    public void setAccidentCode(String accidentCode) {
        this.accidentCode = accidentCode == null ? null : accidentCode.trim();
    }

    public String getTempData() {
        return tempData;
    }

    public void setTempData(String tempData) {
        this.tempData = tempData == null ? null : tempData.trim();
    }
}
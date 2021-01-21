package com.ml.po;

import java.util.Date;

public class JyAdjustEvidenceInfo {
    private Integer id;

    private String name;

    private String description;

    private String classify;

    private String picture;

    private Integer jyAdjustInfoId;

    private Integer delFlag;

    private Date createDate;

    private String operateName;

    private String operateState;

    private String realState;

    private String realDes;

    private String legitimacyState;

    private String legitimacyDes;

    private String relationState;

    private String relationDes;

    private String judgeState;

    private String isDisagree;

    private String evidenceName;

    private Date evidenceDate;

    private String personType;

    private String serialNo;

    private String source;

    private String evidenceType;

    private String evidenceSuffix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getJyAdjustInfoId() {
        return jyAdjustInfoId;
    }

    public void setJyAdjustInfoId(Integer jyAdjustInfoId) {
        this.jyAdjustInfoId = jyAdjustInfoId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public String getOperateState() {
        return operateState;
    }

    public void setOperateState(String operateState) {
        this.operateState = operateState == null ? null : operateState.trim();
    }

    public String getRealState() {
        return realState;
    }

    public void setRealState(String realState) {
        this.realState = realState == null ? null : realState.trim();
    }

    public String getRealDes() {
        return realDes;
    }

    public void setRealDes(String realDes) {
        this.realDes = realDes == null ? null : realDes.trim();
    }

    public String getLegitimacyState() {
        return legitimacyState;
    }

    public void setLegitimacyState(String legitimacyState) {
        this.legitimacyState = legitimacyState == null ? null : legitimacyState.trim();
    }

    public String getLegitimacyDes() {
        return legitimacyDes;
    }

    public void setLegitimacyDes(String legitimacyDes) {
        this.legitimacyDes = legitimacyDes == null ? null : legitimacyDes.trim();
    }

    public String getRelationState() {
        return relationState;
    }

    public void setRelationState(String relationState) {
        this.relationState = relationState == null ? null : relationState.trim();
    }

    public String getRelationDes() {
        return relationDes;
    }

    public void setRelationDes(String relationDes) {
        this.relationDes = relationDes == null ? null : relationDes.trim();
    }

    public String getJudgeState() {
        return judgeState;
    }

    public void setJudgeState(String judgeState) {
        this.judgeState = judgeState == null ? null : judgeState.trim();
    }

    public String getIsDisagree() {
        return isDisagree;
    }

    public void setIsDisagree(String isDisagree) {
        this.isDisagree = isDisagree == null ? null : isDisagree.trim();
    }

    public String getEvidenceName() {
        return evidenceName;
    }

    public void setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName == null ? null : evidenceName.trim();
    }

    public Date getEvidenceDate() {
        return evidenceDate;
    }

    public void setEvidenceDate(Date evidenceDate) {
        this.evidenceDate = evidenceDate;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType == null ? null : personType.trim();
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getEvidenceType() {
        return evidenceType;
    }

    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType == null ? null : evidenceType.trim();
    }

    public String getEvidenceSuffix() {
        return evidenceSuffix;
    }

    public void setEvidenceSuffix(String evidenceSuffix) {
        this.evidenceSuffix = evidenceSuffix == null ? null : evidenceSuffix.trim();
    }
}
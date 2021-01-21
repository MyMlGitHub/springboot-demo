package com.ml.po;

import java.util.Date;

public class JyDocumentInfo {
    private Integer id;

    private String name;

    private String serialNo;

    private Integer userId;

    private String type;

    private String path;

    private Date createDate;

    private String wordType;

    private String mailLoginName;

    private String personType;

    private String delFlag;

    private String personName;

    private Boolean isPicture;

    private String appraisalNo;

    private Integer applyerId;

    private String folderType;

    private String folderIndex;

    private String remoteSign;

    private String insurancePolicykey;

    private String source;

    private Integer jyAdjustInfoId;

    private String templateContent;

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

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getWordType() {
        return wordType;
    }

    public void setWordType(String wordType) {
        this.wordType = wordType == null ? null : wordType.trim();
    }

    public String getMailLoginName() {
        return mailLoginName;
    }

    public void setMailLoginName(String mailLoginName) {
        this.mailLoginName = mailLoginName == null ? null : mailLoginName.trim();
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType == null ? null : personType.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public Boolean getIsPicture() {
        return isPicture;
    }

    public void setIsPicture(Boolean isPicture) {
        this.isPicture = isPicture;
    }

    public String getAppraisalNo() {
        return appraisalNo;
    }

    public void setAppraisalNo(String appraisalNo) {
        this.appraisalNo = appraisalNo == null ? null : appraisalNo.trim();
    }

    public Integer getApplyerId() {
        return applyerId;
    }

    public void setApplyerId(Integer applyerId) {
        this.applyerId = applyerId;
    }

    public String getFolderType() {
        return folderType;
    }

    public void setFolderType(String folderType) {
        this.folderType = folderType == null ? null : folderType.trim();
    }

    public String getFolderIndex() {
        return folderIndex;
    }

    public void setFolderIndex(String folderIndex) {
        this.folderIndex = folderIndex == null ? null : folderIndex.trim();
    }

    public String getRemoteSign() {
        return remoteSign;
    }

    public void setRemoteSign(String remoteSign) {
        this.remoteSign = remoteSign == null ? null : remoteSign.trim();
    }

    public String getInsurancePolicykey() {
        return insurancePolicykey;
    }

    public void setInsurancePolicykey(String insurancePolicykey) {
        this.insurancePolicykey = insurancePolicykey == null ? null : insurancePolicykey.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getJyAdjustInfoId() {
        return jyAdjustInfoId;
    }

    public void setJyAdjustInfoId(Integer jyAdjustInfoId) {
        this.jyAdjustInfoId = jyAdjustInfoId;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent == null ? null : templateContent.trim();
    }
}
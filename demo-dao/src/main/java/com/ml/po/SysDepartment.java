package com.ml.po;

import java.util.Date;

public class SysDepartment {
    private String id;

    private String deptName;

    private String orgId;

    private String extPro;

    private String delFlag;

    private Date createDate;

    private String isDragIn;

    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getExtPro() {
        return extPro;
    }

    public void setExtPro(String extPro) {
        this.extPro = extPro == null ? null : extPro.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIsDragIn() {
        return isDragIn;
    }

    public void setIsDragIn(String isDragIn) {
        this.isDragIn = isDragIn == null ? null : isDragIn.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}
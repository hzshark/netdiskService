package cn.bestsign.auto.netdiskService.model;

import java.util.Date;

public class SysParam {

    public SysParam(){

    }

    public SysParam(String paramIndex, String paramTitle, String paramValue, String paramRemark){
        this.paramIndex = paramIndex;
        this.paramTitle = paramTitle;
        this.paramValue = paramValue;
        this.paramRemark = paramRemark;
    }

    private Integer paramId;

    private String paramIndex;

    private String paramTitle;

    private String paramValue;

    private String paramRemark;

    private String recordId;

    private Date recordDate;

    private String lastmodiId;

    private Date lastmodiDate;

    private Integer paramType;

    private String paramTypeValue;

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public String getParamIndex() {
        return paramIndex;
    }

    public void setParamIndex(String paramIndex) {
        this.paramIndex = paramIndex;
    }

    public String getParamTitle() {
        return paramTitle;
    }

    public void setParamTitle(String paramTitle) {
        this.paramTitle = paramTitle;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamRemark() {
        return paramRemark;
    }

    public void setParamRemark(String paramRemark) {
        this.paramRemark = paramRemark;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getLastmodiId() {
        return lastmodiId;
    }

    public void setLastmodiId(String lastmodiId) {
        this.lastmodiId = lastmodiId;
    }

    public Date getLastmodiDate() {
        return lastmodiDate;
    }

    public void setLastmodiDate(Date lastmodiDate) {
        this.lastmodiDate = lastmodiDate;
    }

    public Integer getParamType() {
        return paramType;
    }

    public void setParamType(Integer paramType) {
        this.paramType = paramType;
    }

    public String getParamTypeValue() {
        return paramTypeValue;
    }

    public void setParamTypeValue(String paramTypeValue) {
        this.paramTypeValue = paramTypeValue;
    }
}
package cn.bestsign.auto.netdiskService.model;

import java.util.Date;

public class HrmDepartment {

    private Integer depId;

    private String depCode;

    private String depName;

    private String depEngname;

    private String depUpcode;

    private Integer empId;

    private String depDesc;

    private String recordId;

    private Date recordDate;

    private String lastmodiId;

    private Date lastmodiDate;

    private Integer depShowrow;

    private String nextChildCode;

    private HrmEmployee manager;

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepEngname() {
        return depEngname;
    }

    public void setDepEngname(String depEngname) {
        this.depEngname = depEngname;
    }

    public String getDepUpcode() {
        return depUpcode;
    }

    public void setDepUpcode(String depUpcode) {
        this.depUpcode = depUpcode;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getDepDesc() {
        return depDesc;
    }

    public void setDepDesc(String depDesc) {
        this.depDesc = depDesc;
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

    public Integer getDepShowrow() {
        return depShowrow;
    }

    public void setDepShowrow(Integer depShowrow) {
        this.depShowrow = depShowrow;
    }

    public String getNextChildCode() {
        return nextChildCode;
    }

    public void setNextChildCode(String nextChildCode) {
        this.nextChildCode = nextChildCode;
    }

    public HrmEmployee getManager() {
        return manager;
    }

    public void setManager(HrmEmployee manager) {
        this.manager = manager;
    }
}
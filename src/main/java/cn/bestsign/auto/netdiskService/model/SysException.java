package cn.bestsign.auto.netdiskService.model;

import cn.bestsign.common.utils.DateTimeTool;

import java.util.Date;

public class SysException {
    private Integer exceptionId;

    private Long userId;

    private String exceptionMethod;

    private String exceptionParams;

    private Date exceptionDate;

    private String exceptionDateStr = "";

    private String exceptionClass;

    private String processName = "";

    private String processDate = "";

    private Integer exceptionStatus;

    private String exceptionMsg;

    private String exceptionContext;

    private String processContext;

    public Integer getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(Integer exceptionId) {
        this.exceptionId = exceptionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getExceptionMethod() {
        return exceptionMethod;
    }

    public void setExceptionMethod(String exceptionMethod) {
        this.exceptionMethod = exceptionMethod;
    }

    public String getExceptionParams() {
        return exceptionParams;
    }

    public void setExceptionParams(String exceptionParams) {
        this.exceptionParams = exceptionParams;
    }

    public Date getExceptionDate() {
        return exceptionDate;
    }

    public void setExceptionDate(Date exceptionDate) {
        this.exceptionDate = exceptionDate;
    }

    public String getExceptionClass() {
        return exceptionClass;
    }

    public void setExceptionClass(String exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public Integer getExceptionStatus() {
        return exceptionStatus;
    }

    public void setExceptionStatus(Integer exceptionStatus) {
        this.exceptionStatus = exceptionStatus;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionContext() {
        return exceptionContext;
    }

    public void setExceptionContext(String exceptionContext) {
        this.exceptionContext = exceptionContext;
    }

    public String getProcessContext() {
        return processContext;
    }

    public void setProcessContext(String processContext) {
        this.processContext = processContext;
    }

    public String getExceptionDateStr() {
        if(this.exceptionDate !=null){
            return DateTimeTool.getStringFromDate(this.exceptionDate, "yyyy-mm-dd hh:mm:ss");
        }
        return exceptionDateStr;
    }
}
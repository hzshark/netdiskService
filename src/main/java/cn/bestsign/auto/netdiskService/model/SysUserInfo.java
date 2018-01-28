package cn.bestsign.auto.netdiskService.model;

import java.util.Date;
import java.util.List;

public class SysUserInfo {
    private Long userId;

    private Integer empId;

    private String userName;

    private String userPassword;

    private String userSalt;

    private Integer userAction;

    private String headPortrait;

    private String recordId;

    private Date recordDate;

    private String lastmodiId;

    private Date lastmodiDate;

    private Integer userType;

    private String depId;

    private HrmEmployee employee;

    private List<String> userPermissions;

    private List<SysLoginAccount> accountList;

    private String  userRoles;

    //临时流程用户组名称
    private String  processGroup;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public Integer getUserAction() {
        return userAction;
    }

    public void setUserAction(Integer userAction) {
        this.userAction = userAction;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
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

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public HrmEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(HrmEmployee employee) {
        this.employee = employee;
    }

    public List<String> getUserPermissions() {
        return userPermissions;
    }

    public void setUserPermissions(List<String> userPermissions) {
        this.userPermissions = userPermissions;
    }

    public List<SysLoginAccount> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<SysLoginAccount> accountList) {
        this.accountList = accountList;
    }

    public String getProcessGroup() {
        return processGroup;
    }

    public void setProcessGroup(String processGroup) {
        this.processGroup = processGroup;
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }
}
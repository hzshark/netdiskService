package cn.bestsign.auto.netdiskService.model;

import cn.bestsign.admin.common.AdminEnums;

import java.util.Date;

public class SysLoginAccount {
    private Long accountId;

    private Long userId;

    private String loginAccount;

    private Byte accountType;

    private String accountTypeName;

    private Date createTime;

    private Date updateTime;

    private Byte deleteFlag;

    public SysLoginAccount(){

    }

    public SysLoginAccount(Long userId, String loginAccount, Byte accountType){
        this.userId = userId;
        this.loginAccount = loginAccount;
        this.accountType = accountType;
        this.createTime = new Date();
        this.deleteFlag = Byte.valueOf("0");
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getAccountTypeName() {
        if(accountType!=null){
            return AdminEnums.LOGIN_ACCOUNT_TYPE.valueOf(accountType);
        }
        return "";
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }
}
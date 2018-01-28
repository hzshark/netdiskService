package cn.bestsign.auto.netdiskService.model;

public class SysUserBind {
    private Integer bindId;

    private Integer bindType;

    private Long userId;

    private String bindValue;

    public Integer getBindId() {
        return bindId;
    }

    public void setBindId(Integer bindId) {
        this.bindId = bindId;
    }

    public Integer getBindType() {
        return bindType;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBindValue() {
        return bindValue;
    }

    public void setBindValue(String bindValue) {
        this.bindValue = bindValue;
    }
}
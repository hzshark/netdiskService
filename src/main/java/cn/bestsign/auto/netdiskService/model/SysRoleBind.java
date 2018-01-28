package cn.bestsign.auto.netdiskService.model;

public class SysRoleBind {

    private Integer bindId;

    private Integer bindType;

    private Integer roleId;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getBindValue() {
        return bindValue;
    }

    public void setBindValue(String bindValue) {
        this.bindValue = bindValue;
    }
}
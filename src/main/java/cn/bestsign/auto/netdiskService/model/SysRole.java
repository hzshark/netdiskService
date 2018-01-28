package cn.bestsign.auto.netdiskService.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class SysRole {

    private Integer roleId;

    private String roleName;

    private String roleDesc;

    private String recordId;

    private Date recordDate;

    private String lastmodiId;

    private Date lastmodiDate;

    private List<Map<String,String>> bindUsers;

    private List<Map<String,String>> bindDepts;

    private List<Map<String,String>> bindPosts;

    private List<Map<String,String>> bindGroups;

    private List<SysRolePermissions> rolePermissions;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
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

    public List<Map<String, String>> getBindUsers() {
        return bindUsers;
    }

    public void setBindUsers(List<Map<String, String>> bindUsers) {
        this.bindUsers = bindUsers;
    }

    public List<Map<String, String>> getBindDepts() {
        return bindDepts;
    }

    public void setBindDepts(List<Map<String, String>> bindDepts) {
        this.bindDepts = bindDepts;
    }

    public List<Map<String, String>> getBindPosts() {
        return bindPosts;
    }

    public void setBindPosts(List<Map<String, String>> bindPosts) {
        this.bindPosts = bindPosts;
    }

    public List<Map<String, String>> getBindGroups() {
        return bindGroups;
    }

    public void setBindGroups(List<Map<String, String>> bindGroups) {
        this.bindGroups = bindGroups;
    }

    public List<SysRolePermissions> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(List<SysRolePermissions> rolePermissions) {
        this.rolePermissions = rolePermissions;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof SysRole) {
            SysRole role = (SysRole)anObject;
            if (role.getRoleId().equals(this.getRoleId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return this.getRoleId();
    }
}
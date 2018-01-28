package cn.bestsign.auto.netdiskService.model;

public class SysUserPermissionCount {

    private Long userId;

    private String userName = "";

    private String fullName = "";

    private Integer depId;

    private String depCode = "";

    private String depName = "";

    private String postName = "";

    private String userGroupName = "";

    private int userRoles;

    private int deptRoles;

    private int postRoles;

    private int groupRoles;

    private int userPermissions;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

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

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public int getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(int userRoles) {
        this.userRoles = userRoles;
    }

    public int getDeptRoles() {
        return deptRoles;
    }

    public void setDeptRoles(int deptRoles) {
        this.deptRoles = deptRoles;
    }

    public int getPostRoles() {
        return postRoles;
    }

    public void setPostRoles(int postRoles) {
        this.postRoles = postRoles;
    }

    public int getGroupRoles() {
        return groupRoles;
    }

    public void setGroupRoles(int groupRoles) {
        this.groupRoles = groupRoles;
    }

    public int getUserPermissions() {
        return userPermissions;
    }

    public void setUserPermissions(int userPermissions) {
        this.userPermissions = userPermissions;
    }
}
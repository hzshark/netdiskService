package cn.bestsign.auto.netdiskService.model;

public class SysUserGroupDetail {

    private Integer groupDetailId;

    private Long userId;

    private Integer groupId;

    private String groupName;

    private SysUserInfo userInfo;

    public Integer getGroupDetailId() {
        return groupDetailId;
    }

    public void setGroupDetailId(Integer groupDetailId) {
        this.groupDetailId = groupDetailId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public SysUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(SysUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
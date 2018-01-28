package cn.bestsign.auto.netdiskService.model;

import java.util.Date;
import java.util.List;

public class SysUserGroup {
    private Integer groupId;

    private String groupName;

    private String groupDecp;

    private String recordId;

    private Date recordDate;

    private String lastmodiId;

    private Date lastmodeDate;

    private Integer userCount;

    private List<SysUserGroupDetail> userGroupDetailList;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDecp() {
        return groupDecp;
    }

    public void setGroupDecp(String groupDecp) {
        this.groupDecp = groupDecp;
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

    public Date getLastmodeDate() {
        return lastmodeDate;
    }

    public void setLastmodeDate(Date lastmodeDate) {
        this.lastmodeDate = lastmodeDate;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public List<SysUserGroupDetail> getUserGroupDetailList() {
        return userGroupDetailList;
    }

    public void setUserGroupDetailList(List<SysUserGroupDetail> userGroupDetailList) {
        this.userGroupDetailList = userGroupDetailList;
    }
}
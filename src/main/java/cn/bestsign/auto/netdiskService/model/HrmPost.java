package cn.bestsign.auto.netdiskService.model;

import java.util.Date;

public class HrmPost {

    private Integer postId;

    private String postCode;

    private String postName;

    private String postEnname;

    private String postUpcode;

    private String postMang;

    private String postDesc;

    private String recordId;

    private Date recordDate;

    private String lastmodiId;

    private Date lastmodiDate;

    private Integer postShowrow;

    private String nextChildCode;

    private HrmEmployee manager;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostEnname() {
        return postEnname;
    }

    public void setPostEnname(String postEnname) {
        this.postEnname = postEnname;
    }

    public String getPostUpcode() {
        return postUpcode;
    }

    public void setPostUpcode(String postUpcode) {
        this.postUpcode = postUpcode;
    }

    public String getPostMang() {
        return postMang;
    }

    public void setPostMang(String postMang) {
        this.postMang = postMang;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
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

    public Integer getPostShowrow() {
        return postShowrow;
    }

    public void setPostShowrow(Integer postShowrow) {
        this.postShowrow = postShowrow;
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
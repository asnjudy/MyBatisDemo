package com.asn.mybatis.chapter2.param;

/**
 * Created by xuwentang on 2017/9/6.
 */
public class RoleParam {

    private String roleName;
    private String note;

    public RoleParam(String note, String roleName) {
        this.note = note;
        this.roleName = roleName;
    }

    private String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

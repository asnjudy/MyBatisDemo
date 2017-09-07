package com.asn.mybatis.chapter4.po;

import com.asn.mybatis.chapter2.typeHandler.Sex;

/**
 * Created by xuwentang on 2017/9/7.
 *
 * t_student
 */
public class Student {

    private Long id;
    private String Cnname;
    private Sex sex;
    private Long selfcardNo;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnname() {
        return Cnname;
    }

    public void setCnname(String cnname) {
        Cnname = cnname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Long getSelfcardNo() {
        return selfcardNo;
    }

    public void setSelfcardNo(Long selfcardNo) {
        this.selfcardNo = selfcardNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

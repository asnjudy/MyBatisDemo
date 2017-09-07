package com.asn.mybatis.chapter4.po;

/**
 * Created by xuwentang on 2017/9/7.
 *
 * 课程表 t_lecture
 */
public class Lecture {


    private Long id;
    private String lectureName;
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }
}

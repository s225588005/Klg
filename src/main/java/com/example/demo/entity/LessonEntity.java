package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lesson", schema = "zuccknowledge", catalog = "")
public class LessonEntity {
    private int lsid;
    private String lsName;
    private String lsNum;
    private String lsFDes;
    private String teachMaterial;
    private String tag;
    private String teacher;

    @Id
    @Column(name = "Lsid")
    public int getLsid() {
        return lsid;
    }

    public void setLsid(int lsid) {
        this.lsid = lsid;
    }

    @Basic
    @Column(name = "LsName")
    public String getLsName() {
        return lsName;
    }

    public void setLsName(String lsName) {
        this.lsName = lsName;
    }

    @Basic
    @Column(name = "LsNum")
    public String getLsNum() {
        return lsNum;
    }

    public void setLsNum(String lsNum) {
        this.lsNum = lsNum;
    }

    @Basic
    @Column(name = "LsFDes")
    public String getLsFDes() {
        return lsFDes;
    }

    public void setLsFDes(String lsFDes) {
        this.lsFDes = lsFDes;
    }

    @Basic
    @Column(name = "TeachMaterial")
    public String getTeachMaterial() {
        return teachMaterial;
    }

    public void setTeachMaterial(String teachMaterial) {
        this.teachMaterial = teachMaterial;
    }

    @Basic
    @Column(name = "Tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "Teacher")
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonEntity that = (LessonEntity) o;
        return lsid == that.lsid && Objects.equals(lsName, that.lsName) && Objects.equals(lsNum, that.lsNum) && Objects.equals(lsFDes, that.lsFDes) && Objects.equals(teachMaterial, that.teachMaterial) && Objects.equals(tag, that.tag) && Objects.equals(teacher, that.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lsid, lsName, lsNum, lsFDes, teachMaterial, tag, teacher);
    }
}

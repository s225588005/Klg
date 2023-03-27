package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "taggroup", schema = "zuccknowledge", catalog = "")
public class TaggroupEntity {
    private int groupid;
    private String tagGroupName;
    private int tagid;
    private String tagName;

    @Id
    @Column(name = "Groupid")
    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    @Basic
    @Column(name = "TagGroupName")
    public String getTagGroupName() {
        return tagGroupName;
    }

    public void setTagGroupName(String tagGroupName) {
        this.tagGroupName = tagGroupName;
    }

    @Basic
    @Column(name = "Tagid")
    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    @Basic
    @Column(name = "TagName")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaggroupEntity that = (TaggroupEntity) o;
        return groupid == that.groupid && tagid == that.tagid && Objects.equals(tagGroupName, that.tagGroupName) && Objects.equals(tagName, that.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupid, tagGroupName, tagid, tagName);
    }
}

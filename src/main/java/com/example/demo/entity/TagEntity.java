package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tag", schema = "zuccknowledge", catalog = "")
public class TagEntity {
    private int tagid;
    private String tagName;

    @Id
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
        TagEntity tagEntity = (TagEntity) o;
        return tagid == tagEntity.tagid && Objects.equals(tagName, tagEntity.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagid, tagName);
    }
}

package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "knowledge", schema = "zuccknowledge", catalog = "")
public class KnowledgeEntity {
    private int klgid;
    private String klgName;
    private String klgDescription;
    private String highlights;
    private String klgCase;
    private String preKlg;
    private String tag;

    @Id
    @Column(name = "Klgid")
    public int getKlgid() {
        return klgid;
    }

    public void setKlgid(int klgid) {
        this.klgid = klgid;
    }

    @Basic
    @Column(name = "klg_name")
    public String getKlgName() {
        return klgName;
    }

    public void setKlgName(String klgName) {
        this.klgName = klgName;
    }

    @Basic
    @Column(name = "klg_description")
    public String getKlgDescription() {
        return klgDescription;
    }

    public void setKlgDescription(String klgDescription) {
        this.klgDescription = klgDescription;
    }

    @Basic
    @Column(name = "Highlights")
    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    @Basic
    @Column(name = "klg_case")
    public String getKlgCase() {
        return klgCase;
    }

    public void setKlgCase(String klgCase) {
        this.klgCase = klgCase;
    }

    @Basic
    @Column(name = "pre_klg")
    public String getPreKlg() {
        return preKlg;
    }

    public void setPreKlg(String preKlg) {
        this.preKlg = preKlg;
    }

    @Basic
    @Column(name = "Tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KnowledgeEntity that = (KnowledgeEntity) o;
        return klgid == that.klgid && Objects.equals(klgName, that.klgName) && Objects.equals(klgDescription, that.klgDescription) && Objects.equals(highlights, that.highlights) && Objects.equals(klgCase, that.klgCase) && Objects.equals(preKlg, that.preKlg) && Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(klgid, klgName, klgDescription, highlights, klgCase, preKlg, tag);
    }
}

package com.example.demo.formbean;

import com.example.demo.entity.KnowledgeEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

public class knowledge {
    private int klgid;
    private String klgName;
    private String klgDescription;
    private String highlights;
    private String klgCase;
    private String preKlg;
    private String tag;

    public int getKlgid() {
        return klgid;
    }

    public void setKlgid(int klgid) {
        this.klgid = klgid;
    }

    public String getKlgName() {
        return klgName;
    }

    public void setKlgName(String klgName) {
        this.klgName = klgName;
    }

    public String getKlgDescription() {
        return klgDescription;
    }

    public void setKlgDescription(String klgDescription) {
        this.klgDescription = klgDescription;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public String getKlgCase() {
        return klgCase;
    }

    public void setKlgCase(String klgCase) {
        this.klgCase = klgCase;
    }

    public String getPreKlg() {
        return preKlg;
    }

    public void setPreKlg(String preKlg) {
        this.preKlg = preKlg;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}

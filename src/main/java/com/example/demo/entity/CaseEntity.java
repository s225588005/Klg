package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "case", schema = "zuccknowledge", catalog = "")
public class CaseEntity {
    private int caseid;
    private String caseName;
    private String caseDescription;

    @Id
    @Column(name = "Caseid")
    public int getCaseid() {
        return caseid;
    }

    public void setCaseid(int caseid) {
        this.caseid = caseid;
    }

    @Basic
    @Column(name = "CaseName")
    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    @Basic
    @Column(name = "CaseDescription")
    public String getCaseDescription() {
        return caseDescription;
    }

    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaseEntity that = (CaseEntity) o;
        return caseid == that.caseid && Objects.equals(caseName, that.caseName) && Objects.equals(caseDescription, that.caseDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseid, caseName, caseDescription);
    }
}

package com.bluearin.jpastudy3.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tcom_svc_m")
public class JpaStudy3Svc {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer svcNo;

    private String dispNm;

    private String svcStatCd;

    private String svcCdVal;

    private Integer regrNo;

    private Date regDt;

    private Integer cmpnNo;

    public Integer getSvcNo() {
        return svcNo;
    }

    public void setSvcNo(Integer svcNo) {
        this.svcNo = svcNo;
    }

    public String getDispNm() {
        return dispNm;
    }

    public void setDispNm(String dispNm) {
        this.dispNm = dispNm;
    }

    public String getSvcStatCd() {
        return svcStatCd;
    }

    public void setSvcStatCd(String svcStatCd) {
        this.svcStatCd = svcStatCd;
    }

    public String getSvcCdVal() {
        return svcCdVal;
    }

    public void setSvcCdVal(String svcCdVal) {
        this.svcCdVal = svcCdVal;
    }

    public Integer getRegrNo() {
        return regrNo;
    }

    public void setRegrNo(Integer regrNo) {
        this.regrNo = regrNo;
    }

    public Date getRegDt() {
        return regDt;
    }

    public void setRegDt(Date regDt) {
        this.regDt = regDt;
    }

    public Integer getCmpnNo() {
        return cmpnNo;
    }

    public void setCmpnNo(Integer cmpnNo) {
        this.cmpnNo = cmpnNo;
    }

    @Override
    public String toString() {
        return "JpaStudy3Svc{" +
                "svcNo=" + svcNo +
                ", dispNm='" + dispNm + '\'' +
                ", svcStatCd='" + svcStatCd + '\'' +
                ", svcCdVal='" + svcCdVal + '\'' +
                ", regrNo=" + regrNo +
                ", regDt=" + regDt +
                '}';
    }
}

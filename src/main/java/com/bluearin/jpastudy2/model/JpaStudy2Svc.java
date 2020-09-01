package com.bluearin.jpastudy2.model;

import javax.persistence.*;

@Entity
@Table(name = "tcom_svc_m")
public class JpaStudy2Svc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long svcNo;

    private String dispNm;

    private String svcStatCd;

    public Long getSvcNo() {
        return svcNo;
    }

    public void setSvcNo(Long svcNo) {
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

    @Override
    public String toString() {
        return "JpaStudy2Svc{" +
                "svcNo=" + svcNo +
                ", dispNm='" + dispNm + '\'' +
                ", svcStatCd='" + svcStatCd + '\'' +
                '}';
    }
}

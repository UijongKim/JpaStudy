package com.bluearin.jpastudy2.model;

import javax.persistence.*;

@Entity
@Table(name = "tlws_tckt_ainfo_l")
public class JpaStudy2Ainfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tcktAinfoNo;

    private Long tcktNo;

    private String prmtNm;

    private String prmtVal;

    public Long getTcktAinfoNo() {
        return tcktAinfoNo;
    }

    public void setTcktAinfoNo(Long tcktAinfoNo) {
        this.tcktAinfoNo = tcktAinfoNo;
    }

    public Long getTcktNo() {
        return tcktNo;
    }

    public void setTcktNo(Long tcktNo) {
        this.tcktNo = tcktNo;
    }

    public String getPrmtNm() {
        return prmtNm;
    }

    public void setPrmtNm(String prmtNm) {
        this.prmtNm = prmtNm;
    }

    public String getPrmtVal() {
        return prmtVal;
    }

    public void setPrmtVal(String prmtVal) {
        this.prmtVal = prmtVal;
    }
}

package com.bluearin.jpastudy2.model;

import javax.persistence.*;

@Entity
@Table(name = "tlws_tckt_stat_m")
public class JpaStudy2Stat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tcktStatNo;

    private String statCtgCd;

    public Long getTcktStatNo() {
        return tcktStatNo;
    }

    public void setTcktStatNo(Long tcktStatNo) {
        this.tcktStatNo = tcktStatNo;
    }

    public String getStatCtgCd() {
        return statCtgCd;
    }

    public void setStatCtgCd(String statCtgCd) {
        this.statCtgCd = statCtgCd;
    }

    @Override
    public String toString() {
        return "JpaStudy2Stat{" +
                "tcktStatNo=" + tcktStatNo +
                ", statCtgCd='" + statCtgCd + '\'' +
                '}';
    }
}

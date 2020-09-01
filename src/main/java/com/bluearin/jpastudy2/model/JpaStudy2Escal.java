package com.bluearin.jpastudy2.model;

import javax.persistence.*;

@Entity
@Table(name = "tlcs_escal_plcy_m")
public class JpaStudy2Escal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long escalPlcyNo;

//    private Integer archvGrpNo;

    private String statCd;

    private String dispNm;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="archvGrpNo")
    private JpaStudy2Escal escal;

    public Long getEscalPlcyNo() {
        return escalPlcyNo;
    }

    public void setEscalPlcyNo(Long escalPlcyNo) {
        this.escalPlcyNo = escalPlcyNo;
    }

//    public Integer getArchvGrpNo() {
//        return archvGrpNo;
//    }
//
//    public void setArchvGrpNo(Integer archvGrpNo) {
//        this.archvGrpNo = archvGrpNo;
//    }

    public String getStatCd() {
        return statCd;
    }

    public void setStatCd(String statCd) {
        this.statCd = statCd;
    }

    public String getDispNm() {
        return dispNm;
    }

    public void setDispNm(String dispNm) {
        this.dispNm = dispNm;
    }

    public JpaStudy2Escal getEscal() {
        return escal;
    }

    public void setEscal(JpaStudy2Escal escal) {
        this.escal = escal;
    }

    @Override
    public String toString() {
        return "JpaStudy2Escal{" +
                "escalPlcyNo=" + escalPlcyNo +
                ", statCd='" + statCd + '\'' +
                ", dispNm='" + dispNm + '\'' +
                '}';
    }
}

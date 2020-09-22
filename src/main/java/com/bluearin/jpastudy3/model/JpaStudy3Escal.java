package com.bluearin.jpastudy3.model;

import javax.persistence.*;

@Entity
@Table(name = "tlcs_escal_plcy_m")
public class JpaStudy3Escal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long escalPlcyNo;

    private String statCd;

    private String dispNm;

    private String archvCd;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="archvGrpNo")
    private JpaStudy3Escal escal;

    public Long getEscalPlcyNo() {
        return escalPlcyNo;
    }

    public void setEscalPlcyNo(Long escalPlcyNo) {
        this.escalPlcyNo = escalPlcyNo;
    }

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

    public JpaStudy3Escal getEscal() {
        return escal;
    }

    public void setEscal(JpaStudy3Escal escal) {
        this.escal = escal;
    }

    public String getArchvCd() {
        return archvCd;
    }

    public void setArchvCd(String archvCd) {
        this.archvCd = archvCd;
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

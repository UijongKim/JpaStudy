package com.bluearin.jpastudy3.model;

import com.bluearin.jpastudy2.model.JpaStudy2Escal;
import com.bluearin.jpastudy2.model.JpaStudy2Pri;
import com.bluearin.jpastudy2.model.JpaStudy2Step;
import org.hibernate.annotations.JoinFormula;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tlws_tckt_l")
public class JpaStudy3Tckt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tcktNo;

    private Long cmpnTcktSeq;

    private String smrySbst;

    private Date regDt;

    private Date mdfDt;

    private Integer prntsTcktNo;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="svcNo", nullable=false)
    private JpaStudy3Svc svc;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="tcktPriNo", nullable=false)
    private JpaStudy3Pri pri;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="wrkflwStepNo", nullable=false)
    private JpaStudy3Step step;

//    @ManyToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="tcktStatNo", nullable=false)
//    private JpaStudy3Stat stat;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinTable(name="tlcs_escal_plcy_aply_l", joinColumns=@JoinColumn(name="aplyTrgtNo", nullable=false), inverseJoinColumns=@JoinColumn(name="escalPlcyNo", nullable=false))
    private JpaStudy3Escal escal;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinTable(name="tcom_rfr_rel_l", joinColumns={@JoinColumn(name="trgtNo", nullable=false)}, inverseJoinColumns=@JoinColumn(name="srcNo", nullable=false))
    private JpaStudy3Alrt alrt;

//    @ManyToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="titlMsgIdNo", nullable=false)
//    private JpaStudy3itgr itgr;

    public Long getTcktNo() {
        return tcktNo;
    }

    public void setTcktNo(Long tcktNo) {
        this.tcktNo = tcktNo;
    }

    public Long getCmpnTcktSeq() {
        return cmpnTcktSeq;
    }

    public void setCmpnTcktSeq(Long cmpnTcktSeq) {
        this.cmpnTcktSeq = cmpnTcktSeq;
    }

    public String getSmrySbst() {
        return smrySbst;
    }

    public void setSmrySbst(String smrySbst) {
        this.smrySbst = smrySbst;
    }

    public Date getRegDt() {
        return regDt;
    }

    public void setRegDt(Date regDt) {
        this.regDt = regDt;
    }

    public Date getMdfDt() {
        return mdfDt;
    }

    public void setMdfDt(Date mdfDt) {
        this.mdfDt = mdfDt;
    }

    public Integer getPrntsTcktNo() {
        return prntsTcktNo;
    }

    public void setPrntsTcktNo(Integer prntsTcktNo) {
        this.prntsTcktNo = prntsTcktNo;
    }

    public JpaStudy3Svc getSvc() {
        return svc;
    }

    public void setSvc(JpaStudy3Svc svc) {
        this.svc = svc;
    }

    public JpaStudy3Pri getPri() {
        return pri;
    }

    public void setPri(JpaStudy3Pri pri) {
        this.pri = pri;
    }

    public JpaStudy3Step getStep() {
        return step;
    }

    public void setStep(JpaStudy3Step step) {
        this.step = step;
    }

    public JpaStudy3Escal getEscal() {
        return escal;
    }

    public void setEscal(JpaStudy3Escal escal) {
        this.escal = escal;
    }

    public JpaStudy3Alrt getAlrt() {
        return alrt;
    }

    public void setAlrt(JpaStudy3Alrt alrt) {
        this.alrt = alrt;
    }


    //    public JpaStudy3itgr getItgr() {
//        return itgr;
//    }
//
//    public void setItgr(JpaStudy3itgr itgr) {
//        this.itgr = itgr;
//    }

    @Override
    public String toString() {
        return "JpaStudy3Tckt{" +
                "tcktNo=" + tcktNo +
                ", cmpnTcktSeq=" + cmpnTcktSeq +
                ", smrySbst='" + smrySbst + '\'' +
                ", regDt=" + regDt +
                ", mdfDt=" + mdfDt +
                ", prntsTcktNo=" + prntsTcktNo +
                '}';
    }
}

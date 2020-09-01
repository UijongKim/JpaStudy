package com.bluearin.jpastudy2.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "tlws_tckt_l")
public class JpaStudy2Tckt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tcktNo;

    private Long cmpnTcktSeq;

    private String smrySbst;

    private Date regDt;

    private Date mdfDt;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="svcNo", nullable=false)
    private JpaStudy2Svc svc;

    private Integer prntsTcktNo;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="tcktPriNo", nullable=false)
    private JpaStudy2Pri pri;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="wrkflwStepNo", nullable=false)
    private JpaStudy2Step step;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinTable(name="tlcs_escal_plcy_aply_l", joinColumns=@JoinColumn(name="aplyTrgtNo", nullable=false), inverseJoinColumns=@JoinColumn(name="escalPlcyNo", nullable=false))
    private JpaStudy2Escal escal;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinTable(name="tcom_rfr_rel_l", joinColumns=@JoinColumn(name="trgtNo", nullable=false), inverseJoinColumns=@JoinColumn(name="srcNo", nullable=false))
    private JpaStudy2Alert alert;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="asgneNo")
    private JpaStudy2User user;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinTable(name="tlws_tckt_ainfo_l", joinColumns=@JoinColumn(name="tcktNo", nullable=false), inverseJoinColumns=@JoinColumn(name="tcktNo"))
    private JpaStudy2Ainfo ainfo;

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

    public JpaStudy2Svc getSvc() {
        return svc;
    }

    public void setSvc(JpaStudy2Svc svc) {
        this.svc = svc;
    }

    public Integer getPrntsTcktNo() {
        return prntsTcktNo;
    }

    public void setPrntsTcktNo(Integer prntsTcktNo) {
        this.prntsTcktNo = prntsTcktNo;
    }

    public JpaStudy2Pri getPri() {
        return pri;
    }

    public void setPri(JpaStudy2Pri pri) {
        this.pri = pri;
    }

    public JpaStudy2Step getStep() {
        return step;
    }

    public void setStep(JpaStudy2Step step) {
        this.step = step;
    }

    public JpaStudy2Escal getEscal() {
        return escal;
    }

    public void setEscal(JpaStudy2Escal escal) {
        this.escal = escal;
    }

    public JpaStudy2Alert getAlert() {
        return alert;
    }

    public void setAlert(JpaStudy2Alert alert) {
        this.alert = alert;
    }

    public JpaStudy2User getUser() {
        return user;
    }

    public void setUser(JpaStudy2User user) {
        this.user = user;
    }

    public JpaStudy2Ainfo getAinfo() {
        return ainfo;
    }

    public void setAinfo(JpaStudy2Ainfo ainfo) {
        this.ainfo = ainfo;
    }

    @Override
    public String toString() {
        return "JpaStudy2Tckt{" +
                "tcktNo=" + tcktNo +
                ", cmpnTcktSeq=" + cmpnTcktSeq +
                ", smrySbst='" + smrySbst + '\'' +
                ", regDt=" + regDt +
                ", mdfDt=" + mdfDt +
                ", svc=" + svc.toString() +
                ", prntsTcktNo=" + prntsTcktNo +
                ", pri=" + pri.toString() +
                '}';
    }
}

package com.bluearin.jpastudy1.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tlws_tckt_l")
public class IncidentTckt {

    private Integer cmpnNo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tcktNo;

    private Long cmpnTcktSeq;

    private Long txnId;

    private Integer tcktSvcNo;

    private Integer svcNo;

    private Integer wrkflwNo;

    private Integer wrkflwStepNo;

    private Integer tcktPriNo;

    private Integer tcktTypeNo;

    private String smrySbst;

    private Integer prntsTcktNo;

//    @Column
//    private String alrtIdSeq1Val;

    private Integer asgneNo;

    private Integer escalPlcyNo;

    private Integer regrNo;

    private Date regDt;

    private Integer mdfrNo;

    private Date mdfDt;

    @OneToMany(mappedBy = "tcktNo", fetch = FetchType.EAGER)
    List<NotiIvrTokn> toknList;

    public Integer getCmpnNo() {
        return cmpnNo;
    }

    public void setCmpnNo(Integer cmpnNo) {
        this.cmpnNo = cmpnNo;
    }

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

    public Long getTxnId() {
        return txnId;
    }

    public void setTxnId(long txnId) {
        this.txnId = txnId;
    }

    public Integer getTcktSvcNo() {
        return tcktSvcNo;
    }

    public void setTcktSvcNo(int tcktSvcNo) {
        this.tcktSvcNo = tcktSvcNo;
    }

    public Integer getSvcNo() {
        return svcNo;
    }

    public void setSvcNo(int svcNo) {
        this.svcNo = svcNo;
    }

    public Integer getWrkflwNo() {
        return wrkflwNo;
    }

    public void setWrkflwNo(int wrkflwNo) {
        this.wrkflwNo = wrkflwNo;
    }

    public Integer getWrkflwStepNo() {
        return wrkflwStepNo;
    }

    public void setWrkflwStepNo(int wrkflwStepNo) {
        this.wrkflwStepNo = wrkflwStepNo;
    }

    public Integer getTcktPriNo() {
        return tcktPriNo;
    }

    public void setTcktPriNo(int tcktPriNo) {
        this.tcktPriNo = tcktPriNo;
    }

    public Integer getTcktTypeNo() {
        return tcktTypeNo;
    }

    public void setTcktTypeNo(int tcktTypeNo) {
        this.tcktTypeNo = tcktTypeNo;
    }

    public String getSmrySbst() {
        return smrySbst;
    }

    public void setSmrySbst(String smrySbst) {
        this.smrySbst = smrySbst;
    }

    public Integer getPrntsTcktNo() {
        return prntsTcktNo;
    }

    public void setPrntsTcktNo(int prntsTcktNo) {
        this.prntsTcktNo = prntsTcktNo;
    }

//    public String getAlrtIdSeq1Val() {
//        return alrtIdSeq1Val;
//    }
//
//    public void setAlrtIdSeq1Val(String alrtIdSeq1Val) {
//        this.alrtIdSeq1Val = alrtIdSeq1Val;
//    }

    public Integer getAsgneNo() {
        return asgneNo;
    }

    public void setAsgneNo(int asgneNo) {
        this.asgneNo = asgneNo;
    }

    public Integer getEscalPlcyNo() {
        return escalPlcyNo;
    }

    public void setEscalPlcyNo(int escalPlcyNo) {
        this.escalPlcyNo = escalPlcyNo;
    }

    public Integer getRegrNo() {
        return regrNo;
    }

    public void setRegrNo(int regrNo) {
        this.regrNo = regrNo;
    }

    public Date getRegDt() {
        return regDt;
    }

    public void setRegDt(Date regDt) {
        this.regDt = regDt;
    }

    public Integer getMdfrNo() {
        return mdfrNo;
    }

    public void setMdfrNo(int mdfrNo) {
        this.mdfrNo = mdfrNo;
    }

    public Date getMdfDt() {
        return mdfDt;
    }

    public void setMdfDt(Date mdfDt) {
        this.mdfDt = mdfDt;
    }

    public List<NotiIvrTokn> getToknList() {
        return toknList;
    }

    public void setToknList(List<NotiIvrTokn> toknList) {
        this.toknList = toknList;
    }

    @Override
    public String toString() {
        return "IncidentTckt{" +
                "cmpnNo=" + cmpnNo +
                ", tcktNo=" + tcktNo +
                ", cmpnTcktSeq=" + cmpnTcktSeq +
                ", txnId=" + txnId +
                ", tcktSvcNo=" + tcktSvcNo +
                ", svcNo=" + svcNo +
                ", wrkflwNo=" + wrkflwNo +
                ", wrkflwStepNo=" + wrkflwStepNo +
                ", tcktPriNo=" + tcktPriNo +
                ", tcktTypeNo=" + tcktTypeNo +
                ", smrySbst='" + smrySbst + '\'' +
                ", prntsTcktNo=" + prntsTcktNo +
                ", asgneNo=" + asgneNo +
                ", escalPlcyNo=" + escalPlcyNo +
                ", regrNo=" + regrNo +
                ", regDt=" + regDt +
                ", mdfrNo=" + mdfrNo +
                ", mdfDt=" + mdfDt +
                ", listCnt=" + toknList.size() +
                '}';
    }
}

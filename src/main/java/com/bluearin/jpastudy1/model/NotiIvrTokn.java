package com.bluearin.jpastudy1.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tcom_noti_ivr_tokn_l")
public class NotiIvrTokn {

    private Integer cmpnNo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notiIvrToknNo;

    private Integer tcktNo;

    private Integer userNo;

    private String callId;

    private String callSbst;

    private Integer reptCnt;

    private Integer regrNo;

    private Date regDt;

    private Integer mdfrNo;

    private Date mdfDt;

    public Integer getCmpnNo() {
        return cmpnNo;
    }

    public void setCmpnNo(Integer cmpnNo) {
        this.cmpnNo = cmpnNo;
    }

    public Long getNotiIvrToknNo() {
        return notiIvrToknNo;
    }

    public void setNotiIvrToknNo(Long notiIvrToknNo) {
        this.notiIvrToknNo = notiIvrToknNo;
    }

    public Integer getTcktNo() {
        return tcktNo;
    }

    public void setTcktNo(Integer tcktNo) {
        this.tcktNo = tcktNo;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getCallSbst() {
        return callSbst;
    }

    public void setCallSbst(String callSbst) {
        this.callSbst = callSbst;
    }

    public Integer getReptCnt() {
        return reptCnt;
    }

    public void setReptCnt(Integer reptCnt) {
        this.reptCnt = reptCnt;
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

    public Integer getMdfrNo() {
        return mdfrNo;
    }

    public void setMdfrNo(Integer mdfrNo) {
        this.mdfrNo = mdfrNo;
    }

    public Date getMdfDt() {
        return mdfDt;
    }

    public void setMdfDt(Date mdfDt) {
        this.mdfDt = mdfDt;
    }
}

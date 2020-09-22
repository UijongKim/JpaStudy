package com.bluearin.jpastudy3.model;

import javax.persistence.*;

@Entity
@Table(name = "tlts_itgr_appl_m")
public class JpaStudy3itgr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itgrApplNo;

    private String statCd;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="svcNo", nullable=false)
    private JpaStudy3MsgSbst msg;

    public Long getItgrApplNo() {
        return itgrApplNo;
    }

    public void setItgrApplNo(Long itgrApplNo) {
        this.itgrApplNo = itgrApplNo;
    }

    public String getStatCd() {
        return statCd;
    }

    public void setStatCd(String statCd) {
        this.statCd = statCd;
    }

    public JpaStudy3MsgSbst getMsg() {
        return msg;
    }

    public void setMsg(JpaStudy3MsgSbst msg) {
        this.msg = msg;
    }
}

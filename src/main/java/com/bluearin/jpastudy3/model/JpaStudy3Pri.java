package com.bluearin.jpastudy3.model;

import javax.persistence.*;

@Entity
@Table(name = "tlws_tckt_pri_m")
public class JpaStudy3Pri {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tcktPriNo;

    private Integer titlMsgIdNo;

    public Long getTcktPriNo() {
        return tcktPriNo;
    }

    public void setTcktPriNo(Long tcktPriNo) {
        this.tcktPriNo = tcktPriNo;
    }

    public Integer getTitlMsgIdNo() {
        return titlMsgIdNo;
    }

    public void setTitlMsgIdNo(Integer titlMsgIdNo) {
        this.titlMsgIdNo = titlMsgIdNo;
    }

    @Override
    public String toString() {
        return "JpaStudy2Pri{" +
                "tcktPriNo=" + tcktPriNo +
                ", titlMsgIdNo=" + titlMsgIdNo +
                '}';
    }
}

package com.bluearin.jpastudy2.model;

import javax.persistence.*;

@Entity
@Table(name = "tlws_wrkflw_step_l")
public class JpaStudy2Step {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long wrkflwStepNo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="tcktStatNo", nullable=false)
    private JpaStudy2Stat stat;

    public Long getWrkflwStepNo() {
        return wrkflwStepNo;
    }

    public void setWrkflwStepNo(Long wrkflwStepNo) {
        this.wrkflwStepNo = wrkflwStepNo;
    }

    public JpaStudy2Stat getStat() {
        return stat;
    }

    public void setStat(JpaStudy2Stat stat) {
        this.stat = stat;
    }
}

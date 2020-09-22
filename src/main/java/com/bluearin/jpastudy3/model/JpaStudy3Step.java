package com.bluearin.jpastudy3.model;

import com.bluearin.jpastudy2.model.JpaStudy2Stat;

import javax.persistence.*;

@Entity
@Table(name = "tlws_wrkflw_step_l")
public class JpaStudy3Step {

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

package com.bluearin.jpastudy3.model;

import javax.persistence.*;

@Entity
@Table(name = "tlts_itgr_appl_instl_l")
public class JpaStudy3ItgrAppl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itgrApplInstlNo;

    public Long getItgrApplInstlNo() {
        return itgrApplInstlNo;
    }

    public void setItgrApplInstlNo(Long itgrApplInstlNo) {
        this.itgrApplInstlNo = itgrApplInstlNo;
    }

}

package com.bluearin.jpastudy3.model;

import javax.persistence.*;

@Entity
@Table(name = "tlcs_alrt_m")
public class JpaStudy3Alrt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long alrtNo;

//    private String srcTypeCd;

    public Long getAlrtNo() {
        return alrtNo;
    }

    public void setAlrtNo(Long alrtNo) {
        this.alrtNo = alrtNo;
    }

//    public String getSrcTypeCd() {
//        return srcTypeCd;
//    }
//
//    public void setSrcTypeCd(String srcTypeCd) {
//        this.srcTypeCd = srcTypeCd;
//    }
}

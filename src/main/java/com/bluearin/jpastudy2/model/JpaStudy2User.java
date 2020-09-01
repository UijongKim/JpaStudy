package com.bluearin.jpastudy2.model;

import javax.persistence.*;

@Entity
@Table(name = "tcom_user_m_all")
public class JpaStudy2User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userNo;

    private String useYn;

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }
}

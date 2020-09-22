package com.bluearin.jpastudy3.model;

import javax.persistence.*;

@Entity
@Table(name = "tcom_lang_msg_sbst_l")
public class JpaStudy3MsgSbst {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long langMsgIdNo;

    private String msgSbst;

    public Long getLangMsgIdNo() {
        return langMsgIdNo;
    }

    public void setLangMsgIdNo(Long langMsgIdNo) {
        this.langMsgIdNo = langMsgIdNo;
    }

    public String getMsgSbst() {
        return msgSbst;
    }

    public void setMsgSbst(String msgSbst) {
        this.msgSbst = msgSbst;
    }
}

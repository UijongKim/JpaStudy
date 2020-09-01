package com.bluearin.jpastudy2.model;

import javax.persistence.*;

@Entity
@Table(name = "tlcs_alrt_m")
public class JpaStudy2Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long alrtNo;
}

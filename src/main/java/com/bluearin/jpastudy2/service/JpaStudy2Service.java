package com.bluearin.jpastudy2.service;

import com.bluearin.jpastudy2.model.JpaStudy2Tckt;
import com.bluearin.jpastudy2.repository.JpaStudy2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JpaStudy2Service {

    @Autowired
    JpaStudy2Repository incidentReporitory;

    public Optional<JpaStudy2Tckt> getTckt(int tcktNo) {
        return incidentReporitory.findById((long)tcktNo);
    }

    public JpaStudy2Tckt getTcktCustom(int tcktNo) {
        return incidentReporitory.findByCustom((long)tcktNo);
    }
}

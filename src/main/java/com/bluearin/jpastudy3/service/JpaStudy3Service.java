package com.bluearin.jpastudy3.service;

import com.bluearin.jpastudy3.model.JpaStudy3Svc;
import com.bluearin.jpastudy3.model.JpaStudy3Tckt;
import com.bluearin.jpastudy3.repository.JpaStudy3Repository;
import com.bluearin.jpastudy3.repository.JpaStudy3SvcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaStudy3Service {

    @Autowired
    JpaStudy3Repository tcktRepo;

    @Autowired
    JpaStudy3SvcRepository svcRepo;

    public JpaStudy3Tckt getTcktCustom(int tcktNo) {
        return tcktRepo.findByCustom((long)tcktNo);
    }

    public void insertSvcMultiple(List<JpaStudy3Svc> svc) throws Exception {
        svcRepo.saveAll(svc);
    }
}
